package EmployeePackage;

import java.time.LocalDate;

public class Employee {
    int id;
    Long Salary;
    String fName,lName,Dept;
    LocalDate date;

    public Employee(  String fName, String lName, String dept,Long salary, LocalDate date) {

        Salary = salary;
        this.fName = fName;
        this.lName = lName;
        Dept = dept;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
