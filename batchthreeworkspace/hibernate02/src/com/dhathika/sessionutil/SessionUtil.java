package com.dhathika.sessionutil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	public static Session getSession() {
		SessionFactory sessionFactory = new Configuration().configure("com/dhathika/configuration/hibernatemysql.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session;
	}

	public static void closeSession(Session session) {
		session.close();
	}

}
