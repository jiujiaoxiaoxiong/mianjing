package com.mian.bean;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * com.mian.bean
 * Created by Reinhard Tristan Eugen Heydrich
 * 2016/11/11.
 * 求职者发布的求职信息
 */
@Entity
@Table(name = "account")
public class EmployeeJob {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String accountUuid;
    private String company;
    /*职务*/
    private String position;
    /*工作年限*/
    private Double workYears;
    /*薪资 元/小时*/
    private Double payroll;
    /*工作时间*/
    private AdvisoryTime advisoryTime;
    /*工作地点*/
    private String workLocation;
    /*顾问类型*/
    private ConsultantType consultanType;
    /*工作经历*/
    private String workExperience;

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getWorkYears() {
        return workYears;
    }

    public void setWorkYears(Double workYears) {
        this.workYears = workYears;
    }

    public Double getPayroll() {
        return payroll;
    }

    public void setPayroll(Double payroll) {
        this.payroll = payroll;
    }

    public AdvisoryTime getAdvisoryTime() {
        return advisoryTime;
    }

    public void setAdvisoryTime(AdvisoryTime advisoryTime) {
        this.advisoryTime = advisoryTime;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public ConsultantType getConsultanType() {
        return consultanType;
    }

    public void setConsultanType(ConsultantType consultanType) {
        this.consultanType = consultanType;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }
}
