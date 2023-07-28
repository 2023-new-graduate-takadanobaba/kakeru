package kakeru;

import java.util.Scanner;

public class PrimeNumbers1 {
	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		System.out.println("入力された数字までの素数を表示します");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Integer num = Integer.parseInt(str);
		for (int i = 2; i <= num; i++) {
			for (int j = 2; (i % j != 0 && j < i) || j == i; j++) {
				if (j == i) {
					System.out.println(i + "は素数です。");
				}
			}
		}
		scan.close();
	}

}
