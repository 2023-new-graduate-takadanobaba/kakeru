package kakeru;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("素数かどうか判定します");
		System.out.println("数字を入力して下さい");
		System.out.println("➤");
		int num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(i + "で割り切れています");
				System.out.println(num + "は素数ではありません");
				return;
			}
		}
		System.out.println(num + " は素数です");
		sc.close();
	}

}
