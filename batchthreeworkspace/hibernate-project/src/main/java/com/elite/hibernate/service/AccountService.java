package com.elite.hibernate.service;

import com.elite.hibernate.dao.AccountDAO;
import com.elite.hibernate.dto.Account;

public class AccountService {
	public static void main(String[] args) {
			AccountDAO dao = new AccountDAO();
		
				// Retrieve Account
				Account rAccount = dao.get(1010);
				System.out.println("Account details ....");
				System.out.println("Accno : " + rAccount.getAccno());
				System.out.println("Name : " + rAccount.getName());
				System.out.println("Balance : " + rAccount.getBalance());
				
			
				// Create Account
					Account cAccount = new Account();
				cAccount.setAccno(1063);
				cAccount.setName("sekhar");
			cAccount.setBalance(6899);
					dao.insert(cAccount);
					System.out.println("Account created successfully");
	
					// Update Account
				Account uAccount = new Account();
					uAccount.setAccno(10369);
				uAccount.setName("sekhareddy");
					uAccount.setBalance(4500);
									System.out.println("Account updated successfully");
		
				// Delete Account
				dao.delete(1030);
				System.out.println("Account is deleted successfully");
			
			}
			}



