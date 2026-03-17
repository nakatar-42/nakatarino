package curriculum.a;

public class Question1 {

	public static void main(String[] args) {

		// Q1 変数宣言
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;

		// Q2 値を代入
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;

		// ===== Q3 出力 =====

		// ① 10 + 100 + 1000 + 10000 = 11110
		System.out.println(byteNum + shortNum + intNum + longNum);

		// ② 10 × 2 = 20
		System.out.println(byteNum * 2);

		// ③ 文字・文字列・真偽値を連結して表示
		// a Hello true a Hello true
		System.out.println(letter + " " + letters + " " + isBoolean + " ");

		// ④ ①の合計 + ②の結果 = 11130
		System.out.println((int) (byteNum + shortNum + intNum + longNum + floatNum + doubleNum));

		// ⑤ 小数以外の数値をすべて掛け算
		System.out.println(byteNum * shortNum * intNum * longNum);

		// ⑥ 10.5 ÷ 100 = 0.105
		System.out.println(doubleNum / shortNum);

		// ⑦ 10 − 100 = -90
		System.out.println(byteNum - shortNum);

		// ===== Q4 文字列の代入と表示 =====

		// nameというString型の変数を宣言
		String name;

		// 変数に名前を代入
		name = "山田太郎";

		// name変数を使って挨拶文を表示
		System.out.println("こんにちは、" + name + "さん！");

		// ===== Q5 整数の代入と表示 =====

		// ageというint型の変数を宣言
		int age;

		// 年齢を代入
		age = 25;

		// age変数を使って年齢を表示
		System.out.println("年齢: " + age + "歳");

		// ===== Q6 足し算の結果を別の変数に代入 =====

		// num1とnum2を宣言し値を代入
		int num1 = 10;
		int num2 = 5;

		// 足し算の結果をsumに代入
		int sum = num1 + num2;

		// 計算結果を表示
		System.out.println(sum);

		// ===== Q7 変数の値を更新 =====

		// scoreを宣言し初期値80を代入
		int score = 80;

		// scoreに20を加算して更新
		score = score + 20;

		// 更新後のスコアを表示
		System.out.println("最終スコア: " + score);

		// ===== Q8 double → int へ型変換 =====

		// priceというdouble型の変数を宣言し、99.99を代入
		double price = 99.99;

		// 変換後の整数価格を表示
		System.out.println("整数価格: " + (int) price);

		/* ===== Q9 String → int へ型変換 ===== */

		// numStrというString型の変数に"123"を代入
		String numStr = "123";

		// 文字列をint型へ変換（数値として扱えるようにする）
		int convertedNum = Integer.parseInt(numStr);

		// 変換後の値に10を足した結果を表示
		System.out.println("変換後の値: " + (convertedNum + 10));

		/* ===== Q10 int → String へ型変換 ===== */

		// numというint型の変数に50を代入
		int num = 50;

		// int型をString型へ変換
		String strNum = String.valueOf(num);

		// 指定された形式で表示
		System.out.println("得点: " + strNum + "点");

		// ===== Q11 条件演算子でbooleanに代入 =====

		// aとbを宣言して値を代入
		int a = 10;
		int b = 20;

		// aがbより小さいかどうかを三項演算子で判定
		// 条件 ? trueの場合 : falseの場合
		boolean result = (a < b) ? true : false;

		// 判定結果を表示
		System.out.println(result);

		// ===== Q12 三項演算子で文字表示 =====

		// xを宣言して15を代入
		int x = 15;

		// xが10以上なら"OK"、そうでなければ"NG"
		String message = (x >= 10) ? "OK" : "NG";

		// 結果を表示
		System.out.println(message);

		// ===== Q13 文字列の置き換え =====

		// 文章を代入
		String text = "私はJavaが好きです。Javaは楽しい！";

		// 置き換え後の文章を表示
		System.out.println(text.replace("Java", "Python"));

	}
}
