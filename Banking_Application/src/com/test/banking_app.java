package com.test;

import java.util.Scanner;

public class banking_app {
	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("Ankit", "1234");
		obj1.showMenu();
	}
}
class BankAccount{
			int balance;
			int previousTransaction;
			String customerName;
			String customerId;
			int option=0;
			BankAccount(String cname,String cid){
				this.customerName=cname;
				this.customerId=cid;
				}
			void deposite(int amount) {
				if(amount !=0) {
					balance=balance+amount;
					previousTransaction=amount;
				}
			}
			void withdraw(int amount) {
					if(amount !=0) {
						balance=balance-amount;
						previousTransaction=amount;
						
					}
				}
				void getpreviousTransaction() {
					if(previousTransaction > 0) {
						System.out.println("Deposited :"+previousTransaction);
						
					}
					else if(previousTransaction<0) {
						System.out.println("withdrawn :"+Math.abs(previousTransaction));
						
					}
					else {
						System.out.println("No Transaction Occured");
					}
					
				}
				void showMenu() {
					Scanner sc =new Scanner(System.in);
					
					System.out.println("Welcome"  +customerName);
					System.out.println("Your id is"+customerId);
					System.out.println("1.Check Balance");
					System.out.println("2.Deposits");
					System.out.println("3.withdraw");
					System.out.println("4.previousTransaction");
					System.out.println("5.Exit");
					
					do {
						System.out.println("Enter Your Choice");
						int option = sc.nextInt();
						switch(option) {
						case 1:
							System.out.println("balance="+balance);
							break;
							
						
						case 2:
							System.out.println("=====Deposite=======");
							System.out.println("Deposite your Amount");
							int amount=sc.nextInt();
							deposite(amount);
							break;
							
						case 3:
							System.out.println("====Withdraw====");
							System.out.println("Withdraw your amount");
							int amount2=sc.nextInt();
							withdraw(amount2);
							break;
							
							
						case 4:
							System.out.println("====================");
							getpreviousTransaction();
							break;
						case 5:
							System.out.println("============");
							break;
							
							default:
								System.out.println("invalid option !! Please try again");
								}
						
					}while(option !='5');
					System.out.println("Thnak for using our service");
					
				}
					
					
			
			}
	
	


