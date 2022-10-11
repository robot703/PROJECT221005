package OpenChallenge56;

import java.util.Scanner;

public class Stringbuffer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;

		System.out.print(">>");
		String str1 = scan.nextLine();
		StringBuffer sb = new StringBuffer(str1);

		while(true) {
			System.out.println("명령:");
			String order =scan.nextLine();
			if(order.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}


			String[] arguments = order.split("!");

			if(arguments[0].equals("")){			

				System.out.println("잘못된 명령입니다!");

				continue;
			}
			if (sb.indexOf(arguments[0]) == -1) {

				System.out.println("찾을 수 없습니다!");

				continue;
			}


			while (sb.indexOf(arguments[0]) != -1) {

				sb.replace(sb.indexOf(arguments[0]), sb.indexOf(arguments[0]) + arguments[0].length(),

						arguments[1]);

			}
			System.out.println(sb.toString());
		}
	}


}
