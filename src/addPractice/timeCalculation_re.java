package addPractice;

import java.util.Scanner;

public class timeCalculation_re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 Scanner sc = new Scanner(System.in); 

	      String firstTime = sc.nextLine(); 
	      String secondTime = sc.nextLine();
	  
	      System.out.println(firstTime);
	      System.out.println(secondTime);
	  
	      firstTime = firstTime.replace("h", "");
	      firstTime = firstTime.replace("m", "");
	      firstTime = firstTime.replace("s", "");
	      secondTime = secondTime.replace("h", "");
	      secondTime = secondTime.replace("m", "");
	      secondTime = secondTime.replace("s", "");
	  
	      String[] firstTimeArr = firstTime.split(" ");
	      String[] secondTimeArr = secondTime.split(" ");

	
	      long firstHour = Integer.parseInt(firstTimeArr[0]);
	      long firstMinute = Integer.parseInt(firstTimeArr[1]);
	      long firstSecond = Integer.parseInt(firstTimeArr[2]);
	      long secondHour = Integer.parseInt(secondTimeArr[0]);
	      long secondMinute = Integer.parseInt(secondTimeArr[1]);
	      long secondSecond = Integer.parseInt(secondTimeArr[2]);
	  
	      firstHour = firstHour * 60 * 60;
	      firstMinute = firstMinute * 60;
	      secondHour = secondHour * 60 * 60;
	      secondMinute = secondMinute * 60;

	      long num1 = firstHour + firstMinute + firstSecond;
	      long num2 = secondHour + secondMinute + secondSecond;

	      long bignumber = 0;
	      long smallnumber = 0;

	      if (num1 > num2) {
	         bignumber = num1;
	         smallnumber = num2;
	      } else {
	         bignumber = num2;
	         smallnumber = num1;

	      }

	      long sub = bignumber - smallnumber;

	      long hour1 = sub / 3600;
	      long firstlast = sub % 3600; 
	      long minute1 = firstlast / 60;
	      long second1 = firstlast % 60;

	      System.out.println(hour1 + "h " + minute1 + "m " + second1 + "s");
	   }
	}
	


