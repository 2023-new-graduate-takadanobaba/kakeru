package kakeru;

import java.io.IOException;
import java.util.Scanner;

public class MarrigePartner {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("お相手の年収を入力してください");
		String text = scanner.nextLine();
		Integer num = Integer.parseInt(text);
		System.out.println("お相手の年収は"+ num + "万円ですね");
		System.out.println("次にお相手の容姿を100点満点で評価してください");
		String text1 = scanner.nextLine();
		Integer num1 = Integer.parseInt(text1);
		System.out.println("お相手の容姿は"+ num1 + "点ですね");
		System.out.println("次にお相手の総合的な性格の良さを100点満点で評価してください");
		String text2 = scanner.nextLine();
		Integer num2 = Integer.parseInt(text2);
		System.out.println("お相手の性格の良さは"+ num2 + "点ですね");
		double result = 0;
		
		if(num > 250) {
			result = result + 40;
		}
		
		if(num1 > 50) {
			result = result + 70;
		}
		
		if(num2 > 50) {
			result = result + 80;
		}
		
		result = Math.round(result / 190 * 100);
		
		System.out.println("合計" +result + "点！");
		
		if(result > 70) {
			System.out.println("とてもいい人です。ぜひ結婚しましょう");
		}else if(result > 50) {
			System.out.println("いいところを探しましょう");
		}else {
			System.out.println("考え直しましょう");
		}
		
		scanner.close();
		
	}

}
