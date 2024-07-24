package com.mgcloudtech.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Employee_Marketing_Work_Auth")
public class EmployeeMarketingWorkAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "recruiter_id")
    private MgctOffshoreEmployees recruiter;

    @Enumerated(EnumType.STRING)
    @Column(name = "visa_status")
    private VisaStatus visaStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "work_auth_type")
    private WorkAuthType workAuthType;

    @Column(name = "role_resume", length = 50)
    private String roleResume;

    @Column(name = "years_of_exp")
    private Integer yearsOfExp;

    @Column(name = "marketing_start_date")
    private Date marketingStartDate;

    @Column(name = "marketing_end_date")
    private Date marketingEndDate;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "drivers_license")
    private Boolean driversLicense;

    @Column(name = "drivers_license_state", length = 50)
    private String driversLicenseState;

    @Column(name = "dl_issue_date")
    private Date dlIssueDate;

    @Column(name = "dl_expiry_date")
    private Date dlExpiryDate;

    @Column(name = "ead_number", length = 20, unique = true)
    private String eadNumber;

    @Column(name = "work_auth_start_date")
    private Date workAuthStartDate;

    @Column(name = "work_auth_end_date")
    private Date workAuthEndDate;

    @Column(name = "assigned_date")
    private Date assignedDate;

    @ManyToOne
    @JoinColumn(name = "lead_recruiter_id")
    private MgctOffshoreEmployees leadRecruiter;

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

    public MgctOffshoreEmployees getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(MgctOffshoreEmployees recruiter) {
        this.recruiter = recruiter;
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

    public String getRoleResume() {
        return roleResume;
    }

    public void setRoleResume(String roleResume) {
        this.roleResume = roleResume;
    }

    public Integer getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(Integer yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public Date getMarketingStartDate() {
        return marketingStartDate;
    }

    public void setMarketingStartDate(Date marketingStartDate) {
        this.marketingStartDate = marketingStartDate;
    }

    public Date getMarketingEndDate() {
        return marketingEndDate;
    }

    public void setMarketingEndDate(Date marketingEndDate) {
        this.marketingEndDate = marketingEndDate;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(Boolean driversLicense) {
        this.driversLicense = driversLicense;
    }

    public String getDriversLicenseState() {
        return driversLicenseState;
    }

    public void setDriversLicenseState(String driversLicenseState) {
        this.driversLicenseState = driversLicenseState;
    }

    public Date getDlIssueDate() {
        return dlIssueDate;
    }

    public void setDlIssueDate(Date dlIssueDate) {
        this.dlIssueDate = dlIssueDate;
    }

    public Date getDlExpiryDate() {
        return dlExpiryDate;
    }

    public void setDlExpiryDate(Date dlExpiryDate) {
        this.dlExpiryDate = dlExpiryDate;
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

    public Date getAssignedDate() {
        return assignedDate;
    }

    public void setAssignedDate(Date assignedDate) {
        this.assignedDate = assignedDate;
    }

    public MgctOffshoreEmployees getLeadRecruiter() {
        return leadRecruiter;
    }

    public void setLeadRecruiter(MgctOffshoreEmployees leadRecruiter) {
        this.leadRecruiter = leadRecruiter;
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

    // Enums for VisaStatus and WorkAuthType

    public enum VisaStatus {
        F1,
        H1B,
        L1,
        H4,
        L2,
        GC,
        USC,
        Asylum_EAD,
        Refugee_EAD
    }

    public enum WorkAuthType {
        OPT_EAD,
        STEM_OPT_EAD,
        H1B,
        GC_EAD,
        GC,
        H4EAD,
        USC,
        L1,
        L2
    }
}
