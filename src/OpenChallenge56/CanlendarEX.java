package OpenChallenge56;

import java.util.Calendar;


public class CanlendarEX {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int hourofday = now.get(Calendar.HOUR_OF_DAY);
		
		if(4<=hourofday && hourofday <12) {
			System.out.println(hourofday);
			System.out.println("Good Mornig");
		}
		else if(12<=hourofday && hourofday<18)
			System.out.println("Good Afternoon");
		else if(18<=hourofday && hourofday<22) {
			System.out.println(hourofday);
			System.out.println("good Evening");
		}
		else
			System.out.println("good Night");

	}

}
