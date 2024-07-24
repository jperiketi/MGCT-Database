package com.mgcloudtech.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee_Work_Auth")
public class EmployeeWorkAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

    @Enumerated(EnumType.STRING)
    @Column(name = "visa_status")
    private VisaStatus visaStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "work_auth_type")
    private WorkAuthType workAuthType;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "ead_number", length = 20)
    private String eadNumber;

    @Column(name = "work_auth_start_date")
    private Date workAuthStartDate;

    @Column(name = "work_auth_end_date")
    private Date workAuthEndDate;

    @Column(name = "create_ts")
    private Date createTs;

    @Column(name = "create_by", length = 100)
    private String createBy;

    @Column(name = "update_ts")
    private Date updateTs;

    @Column(name = "update_by", length = 100)
    private String updateBy;

    // Getters and Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public VisaStatus getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(VisaStatus visaStatus) {
        this.visaStatus = visaStatus;
    }

    public WorkAuthType getWorkAuthType() {
        return workAuthType;
    }

    public void setWorkAuthType(WorkAuthType workAuthType) {
        this.workAuthType = workAuthType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getEadNumber() {
        return eadNumber;
    }

    public void setEadNumber(String eadNumber) {
        this.eadNumber = eadNumber;
    }

    public Date getWorkAuthStartDate() {
        return workAuthStartDate;
    }

    public void setWorkAuthStartDate(Date workAuthStartDate) {
        this.workAuthStartDate = workAuthStartDate;
    }

    public Date getWorkAuthEndDate() {
        return workAuthEndDate;
    }

    public void setWorkAuthEndDate(Date workAuthEndDate) {
        this.workAuthEndDate = workAuthEndDate;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public enum VisaStatus {
        F1,
        H1B,
        L1,
        H4,
        L2,
        GC,
        USC,
        Asylum_EAD,
        Refugee_EAD;
    }

    public enum WorkAuthType {
        CPT,
        OPT_EAD,
        STEM_OPT_EAD,
        H1B,
        GC_EAD,
        GC,
        H4EAD,
        USC,
        L1,
        L2;
    }
}
