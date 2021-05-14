package employeeManagementsystem;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employeedatabase {

	private JdbcTemplate jdbcTemplate;  
	  
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	  
	public int saveEmployee(EmployeeDomain e){  
	    String query="insert into employee values(  
	    '"+e.getemployeeId()+"','"+e.getemployeeName()+"','" +e.getemployeeDepartement()+ "','" +e.getemployeeDesignation+ "','" +e.getSalary()+"')";  
	    return jdbcTemplate.update(query);  
	}  
	public int updateEmployee(EmployeeDomain e){  
	    String query="update employee set   
	    name='"+e.getName()+"',departement = '"+e.getemployeeDepartement()+"', designation = '"+e.getemployeeDesignation()+"',salary='"+e.getSalary()+"' where id='"+e.getId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteEmployee(EmployeeDomain e){  
	    String query="delete from employee where id='"+e.getEmployeeId()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
}
