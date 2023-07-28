package kakeru;

import java.util.Random;
import java.util.Scanner;

public class Fotune {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("今日の運勢は何でしょうか");
		Scanner scan = new Scanner(System.in);
		System.out.println("名前を書いてください");
		String str = scan.nextLine();
		System.out.println(str+"さんの今日の運勢は、、、");
		Random random = new Random();
		int num = random.nextInt(9);
		
		if(num > 8) {
			System.out.println("大吉です。めっちゃいい日になりますよ！！");
		}else if(num > 6) {
			System.out.println("中吉です。まあまあいい日になるでしょう");
		}else if(num > 4) {
			System.out.println("小吉です。まあ普通です");
		}else if(num > 2) {
			System.out.println("凶です。足元にお気を付けください");
		}else {
			System.out.println("大凶です。後ろに気を付けてください");
		}
		scan.close();
	}

}
