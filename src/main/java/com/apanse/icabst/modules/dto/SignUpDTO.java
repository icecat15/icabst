package com.apanse.icabst.modules.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @program: icabst
 * @Date: 2019/6/8 4:22 PM
 * @Author: sunguolu
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpDTO extends BaseRowModel {

    @ExcelProperty(index = 0, value = "姓名")
    private String userName;
    @ExcelProperty(index = 1, value = "手机号")
    private String phone;
    @ExcelProperty(index = 2, value = "邮箱")
    private String email;
    @ExcelProperty(index = 3, value = "QQ")
    private String qq;
    @ExcelProperty(index = 4, value = "备用邮箱")
    private String secondemail;
    @ExcelProperty(index = 5, value = "微信")
    private String wechat;
    @ExcelProperty(index = 6, value = "报告题目")
    private String title;
    @ExcelProperty(index = 7, value = "职称")
    private String position;
    @ExcelProperty(index = 8, value = "单位院系")
    private String affiliation;
    @ExcelProperty(index = 9, value = "通讯地址")
    private String address;
    @ExcelProperty(index = 10, value = "研究领域")
    private String researchField;
    @ExcelProperty(index = 11, value = "出生日期")
    private String passport;
    @ExcelProperty(index = 12, value = "护照号")
    private String birthday;
    @ExcelProperty(index = 13, value = "参会类型")
    private String conferenceType;
    @ExcelProperty(index = 14, value = "缴费类型")
    private String registerType;
    @ExcelProperty(index = 15, value = "支付方式")
    private String payment;
    @ExcelProperty(index = 16, value = "发票类型")
    private String invoice;
    @ExcelProperty(index = 17, value = "议题")
    private String issue;
    @ExcelProperty(index = 18, value = "创建时间", format = "yyyy-MM-dd HH:mm:ss")
    private String creatTime;
    @ExcelProperty(index = 19, value = "上传文件地址")
    private String uploadFileUrl;
    @ExcelProperty(index = 20, value = "所有作者")
    private String allAuthors;
    @ExcelProperty(index = 21, value = "其他说明")
    private String otherInstructions;
    @ExcelProperty(index = 22, value = "抵达日期")
    private String arrival;
    @ExcelProperty(index = 23, value = "返回日期")
    private String departure;


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

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
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

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getUploadFileUrl() {
        return uploadFileUrl;
    }

    public void setUploadFileUrl(String uploadFileUrl) {
        this.uploadFileUrl = uploadFileUrl;
    }

    public String getAllAuthors() {
        return allAuthors;
    }

    public void setAllAuthors(String allAuthors) {
        this.allAuthors = allAuthors;
    }

    public String getOtherInstructions() {
        return otherInstructions;
    }

    public void setOtherInstructions(String otherInstructions) {
        this.otherInstructions = otherInstructions;
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
}
