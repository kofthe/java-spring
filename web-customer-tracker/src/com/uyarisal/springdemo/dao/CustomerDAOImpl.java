package com.uyarisal.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uyarisal.sprringdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	//inject session factory 
	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		//get the current hibernate session. başlatma ve yazma komutlarını annotationda belirttin.
		//create a query 
		//execute query and get result list
		//return the results 
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = 
				currentSession.createQuery("from Customer", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

}
