package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Course;
import com.uyarisal.hibernate.demo.entity.Instructor;
import com.uyarisal.hibernate.demo.entity.InstructorDetail;
import com.uyarisal.hibernate.demo.entity.Review;


public class CreateCourseAndReviewsDemo {
			public static void main(String[] args) {
				// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory()	; 
		
		//create session 
			
		Session session = factory.getCurrentSession() ; 
		
		
		try {
			//start transaction
			session.beginTransaction() ;
			//create course
			Course tempCourse = new Course("Death Course - How to Death 2") ; 
			//add some reviews 
			tempCourse.addReview(new Review("Nice!"));
			tempCourse.addReview(new Review("Good"));
			tempCourse.addReview(new Review("my mom is death because of you!")) ;
			//save the course .. leverage the cascade all
			System.out.println("Saving the Course");
			System.out.println(tempCourse);
			System.out.println(tempCourse.getReviews());
			session.save(tempCourse); 
			session.getTransaction().commit(); 
			System.out.println("Done!");
		}finally {
			session.close();
			factory.close();
		}
}
			}
