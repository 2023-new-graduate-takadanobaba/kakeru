package kakeru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VendingMachineFlowChart {

	public static void main(String[] args) throws IOException {

		try {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日ahh時mm分ss秒");
		System.out.println("現在の時刻");
		System.out.println(simple.format(date));
		
		boolean lean = false;
		List<String> AppleJuice = new ArrayList<>();
		AppleJuice.add("appleJuice");
		AppleJuice.add("appleJuice");
		AppleJuice.add("appleJuice");
		List<String> Coke = new ArrayList<>();
		Coke.add("coke");
		Coke.add("coke");
		Coke.add("coke");
		List<String> MonsterEnergy = new ArrayList<>();
		MonsterEnergy.add("monsterEnergy");

		List<Integer> TenYen = new ArrayList<>();
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);
		TenYen.add(10);

		List<Integer> FiftyYen = new ArrayList<>();
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);
		FiftyYen.add(50);

		List<Integer> OneHandredYen = new ArrayList<>();
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);
		OneHandredYen.add(100);

		List<Integer> FiveHandredYen = new ArrayList<>();
		FiveHandredYen.add(500);
		FiveHandredYen.add(500);

		while (!lean) {
			System.out.println("お金をいれてください。");
			System.out.println("10円玉、50円玉、100円玉、500円玉、1000円札が利用できます。");

			if (TenYen.size() <= 3) {
				System.out.println("釣銭切れ：10円玉");
			}

			if (FiftyYen.size() == 0) {
				System.out.println("釣銭切れ：50円玉");
			}

			if (OneHandredYen.size() <= 3) {
				System.out.println("釣銭切れ：100円玉");
			}

			if (FiveHandredYen.size() == 0) {
				System.out.println("釣銭切れ：500円玉、お札中止");
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			List<Integer> list = new ArrayList<>();

			boolean boo = false;

			do {
				
				String alt = reader.readLine();
				Pattern pattern = Pattern.compile("^[0-9]*$");
				Matcher matcher = pattern.matcher(alt);
				System.out.println(matcher.find());

				if (alt.isEmpty()) {
					boo = true;
				} else {
					Integer num = Integer.parseInt(alt);
					switch (num) {
					case 10:
						list.add(num);
						TenYen.add(10);
						break;
					case 50:
						list.add(num);
						FiftyYen.add(50);
						break;
					case 100:
						list.add(num);
						OneHandredYen.add(100);
						break;
					case 500:
						list.add(num);
						FiveHandredYen.add(500);
						break;
					case 1000:
						if (FiveHandredYen.size() == 0) {
							System.out.println("現在1000円は使えません");
						} else {
							list.add(num);
						}
						break;
					default:
						System.out.println("返却" + num);
						break;
					}

					System.out.println("ピ");

				}

				int numm = list.stream().mapToInt(Integer::intValue).sum();
				System.out.println("投入金額" + numm + "円");

				if (AppleJuice.size() > 0 && numm >= 100) {
					System.out.println("●リンゴジュース100円");
				}
				if (AppleJuice.size() == 0) {
					System.out.println("(売り切れ)リンゴジュース100円");
				}
				if (Coke.size() > 0 && numm >= 150) {
					System.out.println("●コーラ150円");
				}
				if (Coke.size() == 0) {
					System.out.println("(売り切れ)コーラ150円");
				}

				if (MonsterEnergy.size() > 0 && numm >= 200) {
					System.out.println("●モンスターエナジー200円");
				}

				if (MonsterEnergy.size() == 0) {
					System.out.println("(売り切れ)モンスターエナジー200円");
				}

			} while (!boo);

			int sum = list.stream().mapToInt(Integer::intValue).sum();

			System.out.println("点灯しているボタンの商品を押してください");

			if (sum < 100) {
				System.out.println("と言いたいところですが、今のあなたには何も買えません");
			}
			if (AppleJuice.size() > 0 && sum >= 100) {
				System.out.println("●リンゴジュース");
			}
			if (Coke.size() > 0 && sum >= 150) {
				System.out.println("●コーラ");
			}
			if (MonsterEnergy.size() > 0 && sum >= 200) {
				System.out.println("●モンスターエナジー");
			}

			String alt = reader.readLine();

			switch (alt) {

			case "リンゴジュース":
				sum = sum - 100;
				AppleJuice.remove(0);
				System.out.println("ガタンッ！！リンゴジュースが落ちてきた！");
				System.out.println("♫");
				break;
			case "コーラ":
				sum = sum - 150;
				Coke.remove(0);
				System.out.println("ガタンッ！！コーラが落ちてきた！");
				System.out.println("♫");
				break;
			case "モンスターエナジー":
				sum = sum - 200;
				MonsterEnergy.remove(0);
				System.out.println("ガタンッ！！モンスタエナジーが落ちてきた！");
				System.out.println("♫");
				break;
			default:
				System.out.println("正しくボタンが押されませんでした");
				break;
			}

			int sum1 = 0;
			int sum2 = 0;
			int sum3 = 0;
			int sum4 = 0;
			int sum5 = 0;
			int sum6 = 0;
			int sum7 = 0;
			int sum8 = 0;
			int sum9 = 0;
			int sum10 = 0;
			int sum11 = 0;
			int sum12 = 0;
			int sum13 = 0;

			sum1 = sum / 500;
			sum2 = sum % 500;
			System.out.println("500円玉が" + sum1 + "枚");

			if (FiftyYen.size() > 0 && OneHandredYen.size() > 2) {
				sum3 = sum2 / 100;
				sum4 = sum2 % 100;
				sum5 = sum4 / 50;
				sum6 = sum4 % 50;
				sum7 = sum6 / 10;
			}

			if (FiftyYen.size() == 0 && OneHandredYen.size() > 2) {
				sum11 = sum2 / 100;
				sum12 = sum2 % 100;
				sum13 = sum12 / 10;
			}

			if (FiftyYen.size() > 0 && OneHandredYen.size() < 3) {

				sum8 = sum2 / 50;
				sum9 = sum2 % 50;
				sum10 = sum9 / 10;
			}

			int a = 1;
			for (; a <= sum1; a++) {
				FiveHandredYen.remove(0);
			}

			if (FiftyYen.size() > 0 && OneHandredYen.size() > 2) {

				int z = 1;
				for (; z <= sum3; z++) {
					OneHandredYen.remove(0);
				}
				int s = 1;
				for (; s <= sum5; s++) {
					FiftyYen.remove(0);
				}

				int i = 1;
				for (; i <= sum7; i++) {
					TenYen.remove(0);
				}
				
				System.out.println("100円玉が" + sum3 + "枚");
				System.out.println("50円玉が" + sum5 + "枚");
				System.out.println("10円玉が" + sum7 + "枚");

			}

			if (FiftyYen.size() == 0 && OneHandredYen.size() > 2) {
				int z = 1;
				for (; z <= sum11; z++) {
					OneHandredYen.remove(0);
				}
				int i = 1;
				for (; i <= sum13; i++) {
					TenYen.remove(0);
				}
				System.out.println("100円玉が" + sum11 + "枚");
				System.out.println("10円玉が" + sum13 + "枚");

			}

			if (FiftyYen.size() > 0 && OneHandredYen.size() < 3) {
				int s = 1;
				for (; s <= sum8; s++) {
					FiftyYen.remove(0);
				}
				int i = 1;
				for (; i <= sum10; i++) {
					TenYen.remove(0);
				}
				System.out.println("50円玉が" + sum8 + "枚");
				System.out.println("10円玉が" + sum10 + "枚");
			}
			System.out.println("お釣りとして返却されました！");
			
			Random random = new Random();
			int num = 7;
			int num1 = 7;
			int num2 = 7;
			int num3 = random.nextInt(9);
			System.out.println("ルーレットスタート！");
			System.out.print(num);
			System.out.print(num1);
			System.out.print(num2);
			System.out.print(num3);
			if(num == num1 && num == num2 && num == num3) {
				System.out.println("あたり！もう一本どうぞ！");
			}else {
			System.out.println("残念、、またチャレンジしてね");
			}
			}
		
		 }catch(NumberFormatException e) {
			System.out.println("入力が不正です。数字を入力しなおしてください");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("もう個数がありません、、");
		}
	}
}
