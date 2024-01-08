package com.project.bookmyshow;

public class SecondCustomer extends Thread{
	
	Book bk;

	public SecondCustomer(Book bk) {
		super();
		this.bk = bk;
	}
	
	public void run() {
		bk.bookTickets(1);
	}

}
