/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Customer {
    private String cusID;
    private String cusName;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String nation;
    private String cccd;

    public Customer() {
    }

    public Customer(String cusID, String cusName, String gender, String phone, String email, String address, String nation, String cccd) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.nation = nation;
        this.cccd = cccd;
    }

    public Customer(String cusID, String cusName, String phone, String email, String cccd) {
        this.cusID = cusID;
        this.cusName = cusName;
        this.phone = phone;
        this.email = email;
        this.cccd = cccd;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "Customer{" + "cusID=" + cusID + ", cusName=" + cusName + ", gender=" + gender + ", phone=" + phone + ", email=" + email + ", address=" + address + ", nation=" + nation + ", cccd=" + cccd + '}';
    }
}
