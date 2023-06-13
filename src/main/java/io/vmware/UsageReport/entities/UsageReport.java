package io.vmware.UsageReport.entities;

import io.vmware.UsageReport.entities.Application;
import io.vmware.UsageReport.Space;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class UsageReport {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String reportName;

    @OneToMany(mappedBy = "")
    private Set<Application> application;

    @OneToMany(mappedBy = "id")
    private Set<Space> space;

    public void setId(Long id) {
        this.id = id;
    }
}