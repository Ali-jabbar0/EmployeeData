package EmployeePackage;

import java.sql.*;

public class EmployeeData {
    Connection connection;

    public EmployeeData(Connection connection) {
        this.connection=connection;
    }

    public Employee Save(Employee employee) {
         String sql="INSERT INTO EMPLOYEE(fName,lName,Dept,Salary,date) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,employee.getfName());
            preparedStatement.setString(2,employee.getlName());
            preparedStatement.setString(3,employee.getDept());
            preparedStatement.setLong(4,employee.getSalary());
            preparedStatement.setDate(5, Date.valueOf(employee.getDate()));
            int up=preparedStatement.executeUpdate();
            ResultSet resultSet=preparedStatement.getGeneratedKeys();
            while (resultSet.next()){
                int id=resultSet.getInt(1);
                employee.setId(id);
            }
            System.out.println("Execute "+up);
        } catch (SQLException e) {
            System.out.println("Not Found");
        }
        return employee;
    }
}
