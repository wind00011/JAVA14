package myJava14;

import java.io.*;

public class Class07 {

	public static void main(String[] args) throws IOException {
		int count = 0;
		String str;
		FileReader fr = new FileReader("C:\\Users\\PC 007\\donkey.txt");
		BufferedReader br = new BufferedReader(fr);

		while ((str = br.readLine()) != null) {
			if (count == 1)
				br.skip(14);
			System.out.println(str);
			count++;
		}
		fr.close();
	}
}