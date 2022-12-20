package myJava14;

import java.io.*;

public class Class10 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\PC 007\\rand.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\PC 007\\rand2.txt");
		FileReader fr = new FileReader("C:\\Users\\PC 007\\rand.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int i, max, min, arr[] = new int[1000];
		long sum = 0L;

		for (i = 1; i <= 1000; i++) {
			Double num = new Double(Math.random() * 100000);
			str = Integer.toString(num.intValue());
			bw.write(str);
			bw.newLine();
		}
		bw.flush();
		fw.close();

		i = 0;
		max = 0;
		min = 100000;
		while ((str = br.readLine()) != null) {
			arr[i] = Integer.parseInt(str);
			sum += arr[i];
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
			i++;
		}
		System.out.println("Maximum=" + max + ", Minmum=" + min);
		System.out.println("Average=" + sum / 1000);

		bubble_sort(arr);
		for (i = 0; i < 1000; i++) {
			str = Integer.toString(arr[i]);
			bw2.write(str);
			bw2.newLine();
		}
		bw2.flush();
		fw2.close();
	}

	public static void bubble_sort(int a[]) {
		int i, j, temp;
		boolean flag = true;
		for (i = 1; (i < a.length) && (flag == true); i++) {
			flag = false;
			for (j = 0; j < (a.length - i); j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + i];
					a[j + 1] = temp;
					flag = true;
				}
		}
		return;
	}
}