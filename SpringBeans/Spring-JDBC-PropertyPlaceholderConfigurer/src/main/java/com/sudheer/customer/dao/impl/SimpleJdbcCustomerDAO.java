package com.sudheer.customer.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import com.sudheer.customer.dao.CustomerDAO;
import com.sudheer.customer.model.Customer;
import com.sudheer.customer.model.CustomerParameterizedRowMapper;


public class SimpleJdbcCustomerDAO extends SimpleJdbcDaoSupport implements CustomerDAO
{
	//insert example
	public void insert(Customer customer){
		
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
			 
		getSimpleJdbcTemplate().update(sql, customer.getCustId(),
					customer.getName(),customer.getAge()  
		);
			
	}
	
	//insert with named parameter
	public void insertNamedParameter(Customer customer){
		
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("custId", customer.getCustId());
		parameters.put("name", customer.getName());
		parameters.put("age", customer.getAge());
		
		getSimpleJdbcTemplate().update(sql, parameters);
			
	}
	
	
	//insert batch example
	public void insertBatch(final List<Customer> customers){
		
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
			
		List<Object[]> parameters = new ArrayList<Object[]>();
        for (Customer cust : customers) {
            parameters.add(new Object[] {cust.getCustId(), cust.getName(), cust.getAge()});
        }
        getSimpleJdbcTemplate().batchUpdate(sql, parameters);
        
	}

	//insert batch with named parameter
	public void insertBatchNamedParameter(final List<Customer> customers){
		
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)";
			
		List<SqlParameterSource> parameters = new ArrayList<SqlParameterSource>();
        for (Customer cust : customers) {
        	
        	parameters.add(new BeanPropertySqlParameterSource(cust));
           
        }
        getSimpleJdbcTemplate().batchUpdate(sql,
        		parameters.toArray(new SqlParameterSource[0]));
	}
	
	//insert batch with named parameter
	public void insertBatchNamedParameter2(final List<Customer> customers){
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(customers.toArray());
        getSimpleJdbcTemplate().batchUpdate(
                "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (:custId, :name, :age)",
                params);
    
	}
	
	//insert batch example with SQL
	public void insertBatchSQL(final String sql){
		
		getJdbcTemplate().batchUpdate(new String[]{sql});
		
	}
	
	//query single row with ParameterizedRowMapper
	public Customer findByCustomerId(int custId){
		 
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
 
		Customer customer = getSimpleJdbcTemplate().queryForObject(
				sql,  new CustomerParameterizedRowMapper(), custId);
	
		return customer;
	}
	
	//query single row with ParameterizedBeanPropertyRowMapper (Customer.class)
	public Customer findByCustomerId2(int custId){
		 
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
 
		Customer customer = getSimpleJdbcTemplate().queryForObject(
				sql,ParameterizedBeanPropertyRowMapper.newInstance(Customer.class), custId);
	
		return customer;
	}
	
	//query mutiple rows with ParameterizedBeanPropertyRowMapper (Customer.class)
	public List<Customer> findAll(){
		
		String sql = "SELECT * FROM CUSTOMER";
		 
		List<Customer> customers = 
			getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Customer.class));
		
		return customers;
	}
	
	//query mutiple rows with ParameterizedBeanPropertyRowMapper (Customer.class)
	public List<Customer> findAll2(){
		
		String sql = "SELECT * FROM CUSTOMER";
		
		List<Customer> customers = 
			getSimpleJdbcTemplate().query(sql, ParameterizedBeanPropertyRowMapper.newInstance(Customer.class));
		
		return customers;
	}
	
	public String findCustomerNameById(int custId){
		
		String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";
		 
		String name = getSimpleJdbcTemplate().queryForObject(
				sql, String.class, custId);
	
		return name;
		
	}
	
	public int findTotalCustomer(){
		
		String sql = "SELECT COUNT(*) FROM CUSTOMER";
		 
		int total = getSimpleJdbcTemplate().queryForInt(sql);
				
		return total;
	}
	
	
}
