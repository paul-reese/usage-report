package io.vmware.UsageReport.repositories;

import io.vmware.UsageReport.entities.UsageReport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageReportRepository extends CrudRepository<UsageReport, Long> {
    UsageReport getUsageReports();
}