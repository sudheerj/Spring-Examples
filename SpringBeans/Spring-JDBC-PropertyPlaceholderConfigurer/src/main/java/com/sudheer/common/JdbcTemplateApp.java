package com.sudheer.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sudheer.customer.dao.CustomerDAO;
import com.sudheer.customer.model.Customer;

public class JdbcTemplateApp 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext context = 
    		new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
    	 CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
         Customer customer1 = new Customer(1, "sudheer1",21);
         Customer customer3 = new Customer(2, "sudheer2",22);
         Customer customer2 = new Customer(3, "sudheer3",23);
  
         List<Customer>customers = new ArrayList<Customer>();
         customers.add(customer1);
         customers.add(customer2);
         customers.add(customer3);
  
         customerDAO.insertBatch(customers);

         String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
         customerDAO.insertBatchSQL(sql);
         
         System.out.println("Batch Insert Done!");
         
         Customer customerA = customerDAO.findByCustomerId(1);
         System.out.println("Customer A : " + customerA);
         
         Customer customerB = customerDAO.findByCustomerId2(1);
         System.out.println("Customer B : " + customerB);
         
         List<Customer> customerAs = customerDAO.findAll();
         for(Customer cust: customerAs){
         	 System.out.println("Customer As : " + customerAs);
         }
        
         List<Customer> customerBs = customerDAO.findAll2();
         for(Customer cust: customerBs){
         	 System.out.println("Customer Bs : " + customerBs);
         }
         
         String customerName = customerDAO.findCustomerNameById(1);
         System.out.println("Customer Name : " + customerName);
         
         int total = customerDAO.findTotalCustomer();
         System.out.println("Total : " + total);
         
         //delete all records
         customerDAO.insertBatchSQL("DELETE FROM CUSTOMER");
         System.out.println("Records Deleted!");
         
       
    }
}
