package com.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.EProduct;

public class HibernateUtil {

	public static SessionFactory buildSessionFactory() {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		
		
		
		SessionFactory sf = cfg.buildSessionFactory();

		return sf;
	}

}