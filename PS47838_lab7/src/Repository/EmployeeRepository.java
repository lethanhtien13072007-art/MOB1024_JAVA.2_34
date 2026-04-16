package Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import connect.DbConnect;
import Entity.Employee;

public class EmployeeRepository {

	    // ===== GET ALL =====
	    public List<Employee> findAll() {
	        String sql = "select * from employee";
	        List<Employee> list = new ArrayList<>();

	        try (Connection conn = DbConnect.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql);
	             ResultSet rs = ps.executeQuery()) {

	            while (rs.next()) {
	                Employee emp = new Employee(
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getDouble("salary"));
	                list.add(emp);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return list;
	    }

	    public void showAll() {
	        findAll().forEach(System.out::println);
	    }

	    // ===== FIND BY ID =====
	    public Employee findByID(int id) {
	        String sql = "select * from employee where id = ?";

	        try (Connection conn = DbConnect.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setInt(1, id);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                return new Employee(
	                        rs.getInt("id"),
	                        rs.getString("name"),
	                        rs.getDouble("salary"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    // ===== INSERT =====
	    public boolean addNew(Employee employee) {
	        String sql = "insert into employee (name, salary) values (?, ?)";

	        try (Connection conn = DbConnect.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setString(1, employee.getName());
	            ps.setDouble(2, employee.getSalary());

	            return ps.executeUpdate() > 0;

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return false;
	    }

	    // ===== DELETE (FIXED) =====
	    public boolean deleteEmp(int id) {
	        String sql = "delete from employee where id = ?";

	        try (Connection conn = DbConnect.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setInt(1, id);
	            return ps.executeUpdate() > 0;

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return false;
	    }

	    // ===== UPDATE (FIXED) =====
	    public boolean updateEmp(Employee employee) {
	        String sql = "update employee set name = ?, salary = ? where id = ?";

	        try (Connection conn = DbConnect.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setString(1, employee.getName());
	            ps.setDouble(2, employee.getSalary());
	            ps.setInt(3, employee.getId());

	            return ps.executeUpdate() > 0;

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return false;
	}
}
