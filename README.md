# kakeru
# 交通費精算
ユーザが交通費を使った日付と金額を複数入力する。すべて入力したら、日付順に並んだレポートと合計金額を表示する。入力するとき、同じ日付であれば日付は省略できるようにする。


-  金額と日付を入力してください
    -  入力
       -  1000　2023年6月22日
       -  1500　2023年6月15日
       -  3000　（2023年6月15日）省略
    -  出力
       -  1500円　2023年6月15日
       -  3000円　2023年6月15日
       -  1000円　2023年6月22日
       -  合計5500円
    -  エラーケース
       -  aaa円　2023年6月22日（数字ではないのでエラー）
　     -   円 エラー
       -   ,円　エラー
       -  1000円　2024年6月22日（未来の記述なのでエラー）

-  準備作業
     -  eclipse上で行う

-  入力
     -  金額と日付を入力する
     -  bufferedreaderで金額と日付を別々に入力できるようにする
     -  日付が先

-  処理

  - 日付用bufferedReaderを記述
     -  system.outで日付をYYYYMMDD（年、月、日）の形式で入力してください
     -  bufferedreader r = new b(new InputStreamReader(System. in));日付を入力できるようにする
     -  日付のリストを記述する
     -   - List<String> dateArray = new ArrayList<String>();
     -  isStop = false; で記述してwhile文で囲んでisStop = trueの時にループを抜けるように記述する
     -  trueになる条件は空をコンソール上で入力したときでisEmpty()をif文の条件式に記述してそのような挙動をするようにする。
     -（dateArray.add(str);で追加していく
     -  Collections.sort(dateArray);を入力して昇順に日付を整理する。
　- 金額用bufferedReaderを記述                   
     - system.out「金額を入力してください」
     - 入力した内容をint型に変換
     - String str = r.readLine();
     - int num = Integer.parseInt(str);
     - 金額のリストに格納
     - List<Integer> listFee = new ArrayList<>();
     - isStop1 = false; で記述してwhile文で囲んでisStop1 = trueの時にループを抜けるように記述する
     - trueになる条件は空をコンソール上で入力したときでisEmpty()をif文の条件式に記述してそのような挙動をするようにする。
     -  - if文でfalseだった場合にstrをInteger型に変換する記述を書く。（書かないとエラーになるため）
     - else {
	   int numm = Integer.parseInt(strr);
       listFee.add(numm);

     - System.out.println(dateArray.get(0) + listFee.get(0)+"円です");
     - を記述することでdateArrayとlistFeeのリストに入ったデータの最初の値を取り出す。
     - if文で分岐してdateArrayに要素が格納されない場合でも記述を省略できるようにする。
     - dateArray.size() == 2 と記述することで要素が省略することができる。
     - if (listFee.size() > 1 && dateArray.size() > 2 ) {
			System.out.println(dateArray.get(1) + listFee.get(1)+ "円です");
     - if (listFee.size() > 1 && dateArray.size() == 2) {
			System.out.println("上記の日付で"+ listFee.get(1)+ "円です");
     - int sum = listFee.stream().mapToInt(Integer::intValue).sum();
     - 上記のようなlistFeeに格納された値をすべて合計する記述を書きSystem.outで出力して終了。
　　 - System.out.println("すべての合計金額は"+ sum +"円です");



　- 出力
    - system.outで入力要求をコンソール上で聞く
    - system.outで入力された合計金額を出力する
    - system.outで入力された金額と日付を両方出力する。


-  動作確認
  -  コンソール上に入力して実際の金額の合計が仕様通り出力されるか確認する。
   - 入力
     - 1000　2023年6月15日
     - 3000　（2023年6月15日）省略
   - 出力
     - 1000　2023年6月15日
     - 3000　2023年6月15日
     - 合計4000円
   - 入力
     - 1500円　2023年6月15日
     - 1000円　2023年6月22日
   - 出力
     - 1500円　2023年6月15日
     - 1000円　2023年6月22日
     - 合計2500円
-  エラーケース
     - aaa円　2023年6月22日（数字ではないのでエラー）
　   - 円 エラー
     - ,円　エラー
     - 1000円　2024年6月22日（未来の記述なのでエラー）


