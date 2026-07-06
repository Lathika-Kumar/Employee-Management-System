package in.kce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

import in.kce.bean.Employee;
import in.kce.util.DBUtil;

public class EmployeeDAO {
	//Store Employee
	public boolean saveEmployee(Employee employee) {
		//
		Connection connection=DBUtil.getConnection();
		String query="insert into employee2 values(?,?,?)";
		try {
			PreparedStatement ps=connection.prepareStatement(query);
			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setString(3, employee.getDesignation());
			int row=ps.executeUpdate();
			if(row>=1) {
				return true;
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//update Employee
	public boolean updateEmployee(Employee employee) {
		Connection connection=DBUtil.getConnection();
		String updatequery = "UPDATE employee2 SET empname =? where empid=?";
	    try {
	    	PreparedStatement ps1 = connection.prepareStatement(updatequery);
	    	ps1.setString(1,employee.getEmpName());
	    	ps1.setInt(2,employee.getEmpId());
	    	int rows = ps1.executeUpdate();
	    	return rows>0;
	    	
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	return false;
	    }
	}
	//delete Employee
	public boolean deleteEmployee(int empId) {
		Connection connection=DBUtil.getConnection();
		String deletequery = "DELETE from employee2 where empid=?";
		try {
			PreparedStatement ps2 = connection.prepareStatement(deletequery);
			ps2.setInt(1,empId);
			int rows = ps2.executeUpdate();
			return rows>0;
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return true;
		}
		
	//fetch one employee
	public Employee getEmployee(int empId) {
		Connection connection=DBUtil.getConnection();
		String fetchQuery = "select * from employee2 where empid=?";
		try {
			PreparedStatement ps3 = connection.prepareStatement(fetchQuery);
			ps3.setInt(1,empId);
			ResultSet rs = ps3.executeQuery();
	        if(rs.next()) {
	            Employee emp = new Employee();
	            emp.setEmpId(rs.getInt(1));
	            emp.setEmpName(rs.getString(2));
	            emp.setDesignation(rs.getString(3));
	            return emp;
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return null;	
	}
	//fetch all employees
	public ArrayList<Employee> getAllEmployees(){
		Connection connection=DBUtil.getConnection();
		String fetchAllQuery = "select * from employee2";
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		try {
			PreparedStatement ps3 = connection.prepareStatement(fetchAllQuery);
			ResultSet rs  = ps3.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setDesignation(rs.getString(3));
				a1.add(emp);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return a1;
	}
}
