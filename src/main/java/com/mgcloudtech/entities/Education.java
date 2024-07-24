package com.mgcloudtech.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;

    @Enumerated(EnumType.STRING)
    @Column(name = "education_type")
    private EducationType educationType;

    @Column(name = "major", length = 100)
    private String major;

    @Column(name = "university_name", nullable = false, length = 100)
    private String universityName;

    @Column(name = "university_country", length = 100)
    private String universityCountry;

    @Column(name = "date_degree_awarded")
    private Date dateDegreeAwarded;

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

    public EducationType getEducationType() {
        return educationType;
    }

    public void setEducationType(EducationType educationType) {
        this.educationType = educationType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityCountry() {
        return universityCountry;
    }

    public void setUniversityCountry(String universityCountry) {
        this.universityCountry = universityCountry;
    }

    public Date getDateDegreeAwarded() {
        return dateDegreeAwarded;
    }

    public void setDateDegreeAwarded(Date dateDegreeAwarded) {
        this.dateDegreeAwarded = dateDegreeAwarded;
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

    // Enum for EducationType

    public enum EducationType {
        Bachelor,
        Masters,
        Phd
    }
}
