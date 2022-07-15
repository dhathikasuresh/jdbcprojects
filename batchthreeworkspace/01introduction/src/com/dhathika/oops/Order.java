package com.dhathika.oops;

public class Order extends Object {
	
	long orderNum;
	String orderItem;
	double orderPrice;
	
	public Order(long orderNum, String orderItem, double orderPrice) {
	
		this.orderNum = orderNum;
		this.orderItem = orderItem;
		this.orderPrice = orderPrice;
	}

	@Override
	public String toString() {
		return "Order [orderNum=" + this.orderNum + ", orderItem=" + this.orderItem + ", orderPrice=" + this.orderPrice + "]";
//	    return "hi hi hi";
	}
	
	public int add(int a , int b) {
		return a+b;
	}
//	@Override
//	public String toString() {
//		
//		return "OrderNum :" + this.orderNum + ",orderItem :" + this.orderItem + 
//				",orderPrice :" + this.orderPrice;
//	}
	
	public void main() {
		System.out.println(" Hi I am the first stmt in main method");
		Order o1 = new Order(1050, "grocerry", 500);
		System.out.println(o1);
		o1.toString();
		System.out.println(o1.add(5, 6));
		
	
		
	}
	public static void main(String[] args) {
		
		if(args.length>0)
		System.out.println(args[0]);		
		Order.main(new String[] {"suresh"});
		Order o1 = new Order(1050, "grocerry", 500);
		o1.main();
	}
	

}
