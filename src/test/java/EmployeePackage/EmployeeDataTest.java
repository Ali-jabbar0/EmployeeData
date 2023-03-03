package EmployeePackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDataTest {

    private  Connection  connection;

    @BeforeEach
    void setUp() {
        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xepdb1", "system", "admin");
        } catch (SQLException e) {
            System.out.println("Not Connected");
        }
    }
@Test
    public void insertEmployee(){

        EmployeeData employeeData=new EmployeeData(connection);
        Employee employee=new Employee("Osama","Irtaza","CS",600000L, LocalDate.now());
        Employee employee1=employeeData.Save(employee);
        assertThat(employee1.getId()).isGreaterThan(0);
    }

}