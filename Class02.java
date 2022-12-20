package myJava14;

import java.util.Scanner;
import java.lang.String;

public class Class02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("輸入字串:");
		str = sc.nextLine();
		System.out.println("轉換成大寫:" + str.toUpperCase());
	}
}