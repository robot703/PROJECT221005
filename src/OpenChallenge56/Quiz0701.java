package OpenChallenge56;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Quiz0701 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=null;
		
		while (true) {
			System.out.print(">>");
			s=sc.nextLine();
			
			if(s.equals("그만")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(s," ");
			int n =st.countTokens();
			System.out.print("어절개수는 "+n);
		}
	}
}
