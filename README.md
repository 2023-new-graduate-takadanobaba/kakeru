# kakeru
ユーザが交通費を使った日付と金額を複数入力する。すべて入力したら、日付順に並んだレポートと合計金額を表示する。入力するとき、同じ日付であれば日付は省略できるようにする。


金額と日付を入力してください
入力
  1000　2023年6月22日
  1500　2023年6月15日
  3000　（2023年6月15日）省略
出力
  1500円　2023年6月15日
  3000円　2023年6月15日
  1000円　2023年6月22日
  合計5500円
エラーケース
aaa円　2023年6月22日（数字ではないのでエラー）
　円 エラー
 ,円　エラー
1000円　2024年6月22日（未来の記述なのでエラー）

準備作業
eclipse上で行うのかな？

入力
金額と日付を入力する
bufferedreaderで金額と日付を別々に入力できるようにする
日付が先

処理
system.outで日付をYYYYMMDD（年、月、日）の形式で入力してください

日付用bufferedReaderを記述
bufferedreader r = new b(new InputStreamReader(System. in));日付を入力できるようにする
日付のリストを記述する
num i = 0;
List<Integer> list = new ArrayList<>();

この方法のほうがいいかもしれない↓
String str;
List<String> dateArray = new ArrayList<String>();

.add(num)で追加していく
（dateArray.add("");
system.outでListnameに格納された内容をListname.get(1)を出力
if文で分岐して何も入力されていないときは前回入力されたものを出力するように記述する。
新しく入力された場合はプラス1して新しい場所に入力するようにする。
Array.sort(dateArray)で日付をsortする。
これができない場合
Collections.sort(dateArray);
      


system.out「金額を入力してください」
入力した日付と金額は別々に処理をする。
金額用bufferedReaderを記述
入力した内容をint型に変換
String str = r.readLine();
int num = Integer.parseInt(str);
金額の配列に格納 int[] sum = new int[100];
格納方法sum[1] = 100;
入力した内容をfor文で合計値を出せるようにする。
sum = 0;
for int i = 0; i < 100; i++;
sum = sum + i;
for (int value : sum);
for文は配列に入っている一つ一つの内容を合計していく記述
変数sumに合計値を格納
変数sumをsystem.outに記述する。
配列の次の要素を格納できるように配列の要素に＋１をして格納する場所を変える。

コードの中全体をwhile文で囲み繰り返し入力できるようにする。
while(条件式){
}
while文の内容は常にその条件を満たすものにする、何でもいい

try{}
catch(IOException e){}
で囲んでエラー対策



出力
system.outで入力要求をコンソール上で聞く
system.outで入力された合計金額を出力する
system.outで入力された金額と日付を両方出力する。


動作確認
コンソール上に入力して実際の金額の合計が出力されるか確認する。


