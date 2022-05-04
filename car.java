package Assignmentweek1.day2;

public class car {
	
	public void applyBreak() {
		int noOfBreak=2;
		boolean breakApply=true;
		System.out.println("breakApply:"+breakApply);
		System.out.println("noOfBreak:"+noOfBreak);
		
	
	}
	
	public void applyGear() {
		
		int Gear=4;
		System.out.println("Total Number Of Gear:"+Gear);
		
	}
	
	public void switchonAc() {
		
		   String turnOnAc="Already on";
		
		   System.out.println("hello Turn on the AC"+turnOnAc);
		   
	}
	
	public void applyAccelerator() {
		
		int increaseSpeed=60;
		
		System.out.println("Current Speed:"+increaseSpeed);
		
	}
		
	
	public static void main(String[]args) {
		
		car object=new car();
		object.applyBreak();
		
	}
	
	
	
	
	
	
	
		
	}