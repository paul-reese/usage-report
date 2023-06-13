package io.vmware.UsageReport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class UsageReportApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UsageReportApplication.class, args);
	}

	@Override
	public void run(String...args) {
		Set<String> listOfJsonFiles = Stream.of(new File("/src/main/resources/usage-reports/*.json"))
				.map(File::getName)
				.collect(Collectors.toSet());
		System.out.println(listOfJsonFiles);
	}

	public Resource loadUsageReportFIles() {
		return new ClassPathResource("/usage_reports/*.json");
	}
}
