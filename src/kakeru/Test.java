package kakeru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("日付をYYYY年MM月DD日の形式で入力してください、省略する場合は0と入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> dateArray = new ArrayList<>();

		boolean isStop = false;
		while (!isStop) {

			String str = reader.readLine();
			dateArray.add(str);

			if (str.isEmpty()) {
				isStop = true;
			}

		}

		System.out.println("金額を入力してください（円は記入しなくて良い");

		BufferedReader readerr = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> listFee = new ArrayList<>();

		boolean isStop2 = false;

		while (!isStop2) {

			String strr = readerr.readLine();
			
			if (strr.isEmpty()) {
				isStop2 = true;
			}
			
			else {
	
			int numm = Integer.parseInt(strr);

			listFee.add(numm);


			}
			
		}
		//日付は2つまでの対応となる
		System.out.println(dateArray.get(0) + listFee.get(0)+"円です");
		
		if (listFee.size() > 1 && dateArray.size() > 2 ) {
			System.out.println(dateArray.get(1) + listFee.get(1)+ "円です");
		}
		
		if (listFee.size() > 1 && dateArray.size() == 2) {
			System.out.println("上記の日付で"+ listFee.get(1)+ "円です");
		}
		
		int sum = listFee.stream().mapToInt(Integer::intValue).sum();
		System.out.println("すべての合計金額は"+ sum +"円です");
		

	}

}
