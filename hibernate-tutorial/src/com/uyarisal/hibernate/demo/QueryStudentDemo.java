package com.uyarisal.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Student;

public class QueryStudentDemo {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
			// use the session object to save java java object
			//System.out.println("Creating a new stuent object");

			//Student tempStudent = new Student("MElih", "ARI", "Malmelih@gmail.com");
			// create student object,
			session.beginTransaction();
			// save the student object
			//System.out.println("Öğrenci Kaydediliyor");
			//session.save(tempStudent);
			
			//query students 
			List<Student> theStudents = session.createQuery("from Student").getResultList() ; 
			//display students 
			for (Student tempStudent : theStudents) {
				System.out.println(tempStudent);
			}
			
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		} finally {

		}
	}
}
