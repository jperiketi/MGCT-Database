package com.mgcloudtech.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Employee")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")
public class    Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "middle_name", length = 100)
    private String middleName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "DOB")
    private Date dob;

    @Enumerated(EnumType.STRING)
    @Column(name = "job_type")
    private JobType jobType;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "is_marketing_active")
    private Boolean isMarketingActive;

    @Column(name = "email_id_1", nullable = false, length = 100)
    private String emailId1;

    @Column(name = "email_id_2", length = 100)
    private String emailId2;

    @Column(name = "ph_num_1", nullable = false)
    private Long phNum1;

    @Column(name = "ph_num_2")
    private Long phNum2;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private Gender gender;

    @Column(name = "SSN", unique = true)
    private Long ssn;

    @Enumerated(EnumType.STRING)
    @Column(name = "e_verified")
    private EVerified eVerified;

    @Column(name = "a_number", length = 20)
    private String aNumber;

    @Column(name = "country_of_birth", length = 100)
    private String countryOfBirth;

    @Column(name = "province_of_birth", length = 100)
    private String provinceOfBirth;

    @Column(name = "country_of_citizenship", length = 100)
    private String countryOfCitizenship;

    @Column(name = "date_of_last_arrival")
    private Date dateOfLastArrival;

    @Column(name = "i_94_number", length = 50)
    private String i94Number;

    @Column(name = "passport_number", nullable = false, length = 15, unique = true)
    private String passportNumber;

    @Column(name = "passport_issued_date")
    private Date passportIssuedDate;

    @Column(name = "passport_expires_date")
    private Date passportExpiresDate;

    @Column(name = "passport_issued_country", length = 100)
    private String passportIssuedCountry;

    @Column(name = "sevis_id", unique = true, length = 50)
    private String sevisId;

    @Column(name = "create_ts")
    private Date createTs;

    @Column(name = "create_by", length = 100)
    private String createBy;

    @Column(name = "update_ts")
    private Date updateTs;

    @Column(name = "update_by", length = 100)
    private String updateBy;


    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("employee")
    private List<Address> addresses;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("employee")
    private List<Education> educations;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("employee")
    private List<EmployeeWorkAuth> employeeWorkAuths;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("employee")
    private List<EmployeeMarketingWorkAuth> employeeMarketingWorkAuths;



    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getIsMarketingActive() {
        return isMarketingActive;
    }

    public void setIsMarketingActive(Boolean isMarketingActive) {
        this.isMarketingActive = isMarketingActive;
    }

    public String getEmailId1() {
        return emailId1;
    }

    public void setEmailId1(String emailId1) {
        this.emailId1 = emailId1;
    }

    public String getEmailId2() {
        return emailId2;
    }

    public void setEmailId2(String emailId2) {
        this.emailId2 = emailId2;
    }

    public Long getPhNum1() {
        return phNum1;
    }

    public void setPhNum1(Long phNum1) {
        this.phNum1 = phNum1;
    }

    public Long getPhNum2() {
        return phNum2;
    }

    public void setPhNum2(Long phNum2) {
        this.phNum2 = phNum2;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public EVerified getEVerified() {
        return eVerified;
    }

    public void setEVerified(EVerified eVerified) {
        this.eVerified = eVerified;
    }

    public String getANumber() {
        return aNumber;
    }

    public void setANumber(String aNumber) {
        this.aNumber = aNumber;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getProvinceOfBirth() {
        return provinceOfBirth;
    }

    public void setProvinceOfBirth(String provinceOfBirth) {
        this.provinceOfBirth = provinceOfBirth;
    }

    public String getCountryOfCitizenship() {
        return countryOfCitizenship;
    }

    public void setCountryOfCitizenship(String countryOfCitizenship) {
        this.countryOfCitizenship = countryOfCitizenship;
    }

    public Date getDateOfLastArrival() {
        return dateOfLastArrival;
    }

    public void setDateOfLastArrival(Date dateOfLastArrival) {
        this.dateOfLastArrival = dateOfLastArrival;
    }

    public String getI94Number() {
        return i94Number;
    }

    public void setI94Number(String i94Number) {
        this.i94Number = i94Number;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getPassportIssuedDate() {
        return passportIssuedDate;
    }

    public void setPassportIssuedDate(Date passportIssuedDate) {
        this.passportIssuedDate = passportIssuedDate;
    }

    public Date getPassportExpiresDate() {
        return passportExpiresDate;
    }

    public void setPassportExpiresDate(Date passportExpiresDate) {
        this.passportExpiresDate = passportExpiresDate;
    }

    public String getPassportIssuedCountry() {
        return passportIssuedCountry;
    }

    public void setPassportIssuedCountry(String passportIssuedCountry) {
        this.passportIssuedCountry = passportIssuedCountry;
    }

    public String getSevisId() {
        return sevisId;
    }

    public void setSevisId(String sevisId) {
        this.sevisId = sevisId;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<EmployeeWorkAuth> getEmployeeWorkAuths() {
        return employeeWorkAuths;
    }

    public void setEmployeeWorkAuths(List<EmployeeWorkAuth> employeeWorkAuths) {
        this.employeeWorkAuths = employeeWorkAuths;
    }

   public List<EmployeeMarketingWorkAuth> getEmployeeMarketingWorkAuths() {
        return employeeMarketingWorkAuths;
    }

    public void setEmployeeMarketingWorkAuths(List<EmployeeMarketingWorkAuth> employeeMarketingWorkAuths) {
        this.employeeMarketingWorkAuths = employeeMarketingWorkAuths;
    }

    // Enums for JobType, Gender, EVerified

    public enum JobType {
        Primary,
        Secondary
    }

    public enum Gender {
        M,
        F
    }

    public enum EVerified {
        Y,
        N
    }
}

