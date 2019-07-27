package com.apanse.icabst.modules.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @program: icabst
 * @Date: 2019/7/27 12:15 PM
 * @Author: sunguolu
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnSignUoDTO extends BaseRowModel {

    @ExcelProperty(index = 0, value = "userName")
    private String userName;
    @ExcelProperty(index = 1, value = "phone")
    private String phone;
    @ExcelProperty(index = 1, value = "position")
    private String position;
    @ExcelProperty(index = 2, value = "邮箱")
    private String email;
    @ExcelProperty(index = 3, value = "QQ")
    private String qq;
    @ExcelProperty(index = 2, value = "secondemail")
    private String secondemail;
    @ExcelProperty(index = 2, value = "country")
    private String country;
    @ExcelProperty(index = 8, value = "researchField")
    private String researchField;
    @ExcelProperty(index = 6, value = "affiliation")
    private String affiliation;
    @ExcelProperty(index = 2, value = "hindex")
    private String hindex;
    @ExcelProperty(index = 7, value = "address")
    private String address;
    @ExcelProperty(index = 7, value = "dietary")
    private String dietary;
    @ExcelProperty(index = 7, value = "passport")
    private String passport;
    @ExcelProperty(index = 7, value = "birthday")
    private String birthday;
    @ExcelProperty(index = 7, value = "arrival")
    private String arrival;
    @ExcelProperty(index = 7, value = "departure")
    private String departure;
    @ExcelProperty(index = 7, value = "conferenceType")
    private String conferenceType;
    @ExcelProperty(index = 7, value = "registerType")
    private String registerType;
    @ExcelProperty(index = 7, value = "issue")
    private String issue;
    @ExcelProperty(index = 7, value = "title")
    private String title;

    @ExcelProperty(index = 16, value = "creatTime", format = "yyyy-MM-dd HH:mm:ss")
    private String creatTime;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getSecondemail() {
        return secondemail;
    }

    public void setSecondemail(String secondemail) {
        this.secondemail = secondemail;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getHindex() {
        return hindex;
    }

    public void setHindex(String hindex) {
        this.hindex = hindex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDietary() {
        return dietary;
    }

    public void setDietary(String dietary) {
        this.dietary = dietary;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getConferenceType() {
        return conferenceType;
    }

    public void setConferenceType(String conferenceType) {
        this.conferenceType = conferenceType;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }
}
