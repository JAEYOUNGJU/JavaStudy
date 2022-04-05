package addPractice;

import java.util.Scanner;

public class timeCalculation {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			
			
			int firstHour = sc.nextInt();
			int firstMinute = sc.nextInt();
			int firstSecond = sc.nextInt();
			int secondHour = sc.nextInt();
			int secondMinute = sc.nextInt();
			int secondSecond = sc.nextInt();
			
			System.out.println(firstHour + "h " + firstMinute + "m " + firstSecond + "s");
			System.out.println(secondHour + "h " + secondMinute + "m " + secondSecond + "s");
			
			firstHour = firstHour*60*60;
			firstMinute = firstMinute*60;
			secondHour = secondHour*60*60;
			secondMinute = secondMinute*60;
			
			int num1 = firstHour+firstMinute+firstSecond;
			int num2 = secondHour+secondMinute+secondSecond;

			int bignumber = 0;
			int smallnumber = 0;
			
			if(num1 > num2) {
				bignumber = num1;
				smallnumber = num2;
			} else {
				bignumber = num2;
				smallnumber = num1;

			}
			
			int sub = bignumber - smallnumber;
			
			int hour1= sub/3600;
			int firstlast = sub % 3600;
			int minute1 = firstlast/60;
			int second1 = firstlast % 60;
			
			System.out.println(hour1 + "h "+ minute1 + "m " + second1 + "s");
			}
		}
