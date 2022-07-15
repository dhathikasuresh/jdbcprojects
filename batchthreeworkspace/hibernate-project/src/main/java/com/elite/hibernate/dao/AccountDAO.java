package com.elite.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elite.hibernate.dto.Account;
import com.elite.hibernate.sessionutil.SessionUtil;

public class AccountDAO {
	public Account get(long accno) {
		
				Session session = null;
				Account account = null;
				
					session = SessionUtil.getSession();
						account = (Account) session.get(Account.class, accno);
			              SessionUtil.closeSession(session);
			  return account;
			}
		
			public void insert(Account account) {
		
					Session session = null;
					session = SessionUtil.getSession();
					session.getTransaction().begin();
					session.save(account);
					session.getTransaction().commit();
				SessionUtil.closeSession(session);
				}
			
		
		public void update(Account account) {
				Session session = null;
				              session = SessionUtil.getSession();
					session.getTransaction().begin();
					session.update(account);
					session.getTransaction().commit();
			                           SessionUtil.closeSession(session);
					
			}
			public void delete(long accno) {
				Session session = null;
				Transaction transaction = null;
					session = SessionUtil.getSession();
					transaction = session.beginTransaction();
					Account account = (Account) session.get(Account.class, accno);
					session.delete(account);
			                            SessionUtil.closeSession(session);
				}
			}



