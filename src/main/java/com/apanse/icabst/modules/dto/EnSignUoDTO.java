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

    @ExcelProperty(index = 0, value = "Name")
    private String userName;
    @ExcelProperty(index = 1, value = "phone")
    private String phone;
    @ExcelProperty(index = 2, value = "Title")
    private String position;
    @ExcelProperty(index = 3, value = "邮箱")
    private String email;
    @ExcelProperty(index = 4, value = "Mobile")
    private String qq;
    @ExcelProperty(index = 5, value = "Alternative Email")
    private String secondemail;
    @ExcelProperty(index = 6, value = "Country")
    private String country;
    @ExcelProperty(index = 7, value = "Research Interests")
    private String researchField;
    @ExcelProperty(index = 8, value = "Affiliation")
    private String affiliation;
    @ExcelProperty(index = 9, value = "H-index")
    private String hindex;
    @ExcelProperty(index = 10, value = "address")
    private String address;
    @ExcelProperty(index = 11, value = "Dietary")
    private String dietary;
    @ExcelProperty(index = 12, value = "Passport No")
    private String passport;
    @ExcelProperty(index = 13, value = "Date of Birth")
    private String birthday;
    @ExcelProperty(index = 14, value = "Arrival Date")
    private String arrival;
    @ExcelProperty(index = 15, value = "Departure Date")
    private String departure;
    @ExcelProperty(index = 16, value = "Presentation Type")
    private String conferenceType;
    @ExcelProperty(index = 17, value = "Registration Type")
    private String registerType;
    @ExcelProperty(index = 18, value = "Session")
    private String issue;
    @ExcelProperty(index = 19, value = "Presentation Title")
    private String title;
    @ExcelProperty(index = 20, value = "creatTime", format = "yyyy-MM-dd HH:mm:ss")
    private String creatTime;
    @ExcelProperty(index = 21, value = "Payment Method")
    private String payment;
    @ExcelProperty(index = 21, value = "uploadFileUrl")
    private String uploadFileUrl;

    public String getUploadFileUrl() {
        return uploadFileUrl;
    }

    public void setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

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
