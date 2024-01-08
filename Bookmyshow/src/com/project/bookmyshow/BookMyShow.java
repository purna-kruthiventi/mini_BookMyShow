package com.project.bookmyshow;

public class BookMyShow {

	public static void main(String[] args) {
		Book bk = new Book();
		FirstCustomer fc= new FirstCustomer(bk);
		SecondCustomer sc = new SecondCustomer(bk);
		
		fc.setName("First Person");
		sc.setName("Second Person");
		 
		fc.start();
		sc.start();
		

	}

}
