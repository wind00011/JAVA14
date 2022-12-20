package myJava14;

import java.io.*;

public class Class04 {

	public static void main(String[] args) throws IOException {
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\PC 007\\donkey.txt");
		int num = fr.read(data);
		String str = new String(data, 0, num);
		System.out.println("Characters read= " + num);
		System.out.println(str);
		fr.close();
	}
}
//(b)因為在 Windows 裡，Java 把換行字元「\r\n」看成是兩個字元。