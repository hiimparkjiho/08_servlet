package com.ohgiraffers.mvc.employee.dto;


import java.sql.Date;

public class EmpInsertDTO {
    private String empId;
    private String empName;
    private String empNO;
    private String email;
    private String phone;
    private String deptCode;
    private String jobCode;
    private int salary;
    private double bonus;
    private String managerId;
    private java.sql.Date hireDate;

    private String salLevel;

    public EmpInsertDTO() {
    }

    public EmpInsertDTO(String empName, String empNO, String email, String phone, String deptCode, String jobCode, int salary, double bonus, String managerId, Date hireDate, String salLevel) {
        this.empName = empName;
        this.empNO = empNO;
        this.email = email;
        this.phone = phone;
        this.deptCode = deptCode;
        this.jobCode = jobCode;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.salLevel = salLevel;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNO() {
        return empNO;
    }

    public void setEmpNO(String empNO) {
        this.empNO = empNO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmpInsertDTO{" +
                "empName='" + empName + '\'' +
                ", empNO='" + empNO + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
