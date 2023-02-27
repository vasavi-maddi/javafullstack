package com.revature.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Appointment;
import com.revature.model.HealthInfo;
import com.revature.model.Patient;
import com.revature.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			createPatient(session);
			createAppointment(session);
			createHealthInfo(session);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
	private static void createPatient(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getPatient());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}

	private static Patient getPatient() {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Patient p=(Patient)context.getBean("patient");
		return p;

	}
	
	private static void createAppointment(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getAppointment());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}
	
	private static Appointment getAppointment() {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Appointment p=(Appointment)context.getBean("appointment");
		return p;
	}
	
	private static void createHealthInfo(Session session) {
		session.beginTransaction();
		Integer id = (Integer) session.save(getHealthInfo());
		System.out.println("Employee is created  with Id::" + id);
		session.getTransaction().commit();
	}

	private static HealthInfo getHealthInfo() {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HealthInfo p=(HealthInfo)context.getBean("health_info");
		return p;

	}
}
