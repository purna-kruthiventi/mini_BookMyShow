package com.project.bookmyshow;

public class Book extends Thread {
     int availble_tickets=1;
     
     public void bookTickets(int wantedTickets) {
    	 Thread t = currentThread();
    	 String str = t.getName();
    	 System.out.println(str+" trying to get book the tickets");
    	 
    	 synchronized(this) {
    		 if(wantedTickets<=availble_tickets) {
    			 System.out.println(wantedTickets+" ticket is  allowed to "+str);
    			 System.out.println("tickets are printing...");
    			 try {
    				 Thread.sleep(1000);
    			 }
    			 catch(InterruptedException e) { }
    			 availble_tickets=availble_tickets-wantedTickets;
    		 }
    		 else {
    			 System.out.println("Now tickets are sold out");
    		 }
    	 }
    	 System.out.println("availble tickets are"+availble_tickets);
     }
}
