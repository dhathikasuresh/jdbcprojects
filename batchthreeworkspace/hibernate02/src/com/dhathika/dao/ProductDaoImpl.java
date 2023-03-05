package com.dhathika.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.dhathika.dto.Product;
import com.dhathika.sessionutil.SessionUtil;

public class ProductDaoImpl implements ProductDao{

	@Override
	public void createProductDao(Product product) {		
	   Session session = SessionUtil.getSession();
	   Transaction transaction = session.beginTransaction();
	   session.saveOrUpdate(product);   
	   session.flush();
	   Product product1= session.get(Product.class, 1090);
	   transaction.commit();
	   System.out.println(product1);	   
	   SessionUtil.closeSession(session);	  
		}

	@Override
	public Product retriveProductDao(int pId) {
		
		Configuration configuration = new Configuration();
		configuration.configure("com/dhathika/configuration/hibernate.cfg.xml");
	   SessionFactory  sessionFactory = configuration.buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   Transaction transaction = session.beginTransaction();	
	   Product product = session.get(Product.class, pId);
	   transaction.commit();
	   session.close();
	   return product;
	
	}

	@Override
	public void updateProductDao(Product product) {
		Configuration configuration = new Configuration();
		configuration.configure("com/dhathika/configuration/hibernate.cfg.xml");
	   SessionFactory  sessionFactory = configuration.buildSessionFactory();
	   Session session = sessionFactory.openSession();
	   Transaction transaction = session.beginTransaction();	
	   
	   session.update(product);
				transaction.commit();
	                        session.close();

	}

	@Override
	public void deleteProductDao(int pId) {
		
	   Session session = SessionUtil.getSession();
	   Transaction transaction = session.beginTransaction();	
	  			Product product = (Product) retriveProductDao(pId);
	  			session.delete(product);
		  		transaction.commit();
		  		SessionUtil.closeSession(session);		
	}

	@Override
	public void loadExample(int i) {
		   Session session = SessionUtil.getSession();
		   session.load(Product.class, i);// lazy loading  proxy
		   session.get(Product.class, i); // eager loading hit db to get data
		   Criteria criteria = session.createCriteria(Product.class);		
		   Criterion criterion1 = Restrictions.idEq(new Integer(2001));
		   Criterion criterion2 =  Restrictions.eq("pName"	, "Orio");
		   Criterion criterion3 = Restrictions.ge("pPrice", 5.0d); 
		   Criterion criterion4 = Restrictions.le("pPrice", 5.0d);
		   criteria.add(criterion1);
		   criteria.add(criterion2);
		   criteria.add(criterion3);
		   criteria.add(criterion4);
		   List list  = criteria.list();
		   Iterator< Product> itr = list.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   System.out.println(list.size());
//	  Product productReturnedfromget =  session.get(Product.class, i);
//		 System.out.println("get() method already called ");
//		 try {
//		Product productReturnedfromload=  session.load(Product.class, i);
//		System.out.println(productReturnedfromload);
//		System.out.println("load() method already called ");
//		 }
//		 catch(Exception e) {
//			 
//		 }
	
		SessionUtil.closeSession(session);
	}
	


}
