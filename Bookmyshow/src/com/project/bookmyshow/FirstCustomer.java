package com.project.bookmyshow;

public class FirstCustomer extends Thread{
	
	Book bk;

	public FirstCustomer(Book bk) {
		super();
		this.bk = bk;
	}
	public void run() {
		bk.bookTickets(1);
	}

}
