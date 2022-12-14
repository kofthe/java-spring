package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Instructor;
import com.uyarisal.hibernate.demo.entity.InstructorDetail;

public class DeleteInstructorDetailDemo {
	public static void main(String[] args) {
		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {
			// start a transaction
			// delete the ─▒nstructors
			// get the ─▒nstructor detail object
			// print ─▒nstructor detail
			// print the associated ..
			session.beginTransaction();
			int theId = 6;
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			System.out.println("TempInstructorDetail: " + tempInstructorDetail);
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			//delete code is here 
			System.out.println("Deleting tempInstructorDetail: " + tempInstructorDetail);
			
			//remove the associated object reference 
			//break bi-directional link 
			tempInstructorDetail.getInstructor().setInstructorDetail(null);
			session.delete(tempInstructorDetail);
			session.getTransaction().commit();
			System.out.println("Done!");
		} catch (Exception exc) {
			exc.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}
