package curriculum.b;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		//Q1 for文で1から10までの数字を1つずつ表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("----");//Qごとの区切り

		//Q2 for文で2から20までの偶数を表示
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}

		System.out.println("----");

		//Q3 for文で10から1までカウントダウンして表示
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		System.out.println("----");

		//Q4 for文で1から100までの合計を求める
		int sum = 0; // 合計を入れる変数を用意

		for (int i = 1; i <= 100; i++) {
			sum += i; //sum = sum + i
		}

		System.out.println("合計: " + sum);

		System.out.println("----");

		//Q5 三角形を出力
		for (int i = 1; i <= 5; i++) { // 行(縦)
			for (int j = 1; j <= i; j++) { // 列(横)
				System.out.print("*");
			}
			System.out.println(); // 行の最後で改行
		}

		//Q6 while文で1から10までの数字を1つずつ表示
		int k = 1;

		while (k <= 10) {
			System.out.println(k);
			k++;
		}
		System.out.println("----");

		//07 while文を使って2から20までの偶数を1ずつ表示
		int l = 2;

		while (l <= 20) {
			System.out.println(l);
			l += 2;
		}
		System.out.println("----");

		//Q8 while文を使って10から1までカウントダウンして表示
		int m = 10;

		while (m >= 1) {
			System.out.println(m);
			m--;
		}
		System.out.println("----");

		//Q9 while文を使って1から100までの合計を表示
		int n = 1;
		//変数名sumが重複していたためsum2で対応
		int sum2 = 0;
		while (n <= 100) {
			sum2 += n;
			n++;
		}

		System.out.println("合計: " + sum2);

		//Q10 0が入力されるまで数値入力を繰り返し、0で終了するプログラム
		// Scannerクラスを使ってキーボード入力を受けとれるようにする
		Scanner scanner = new Scanner(System.in);

		int num = -1; // 初期値（0以外）
		System.out.print("数値を入力してください: ");
		num = scanner.nextInt();//1回目の入力受け取り
		while (num != 0) { // numが0でない間、繰り返す
			System.out.println("入力された数字: " + num);
			num = scanner.nextInt();//2回目以降の入力受け取り
		}

		System.out.println("終了しました");//numが0のとき
		scanner.nextLine();//改行

		//Q11 for文で九九表の表示
		for (int i = 1; i <= 9; i++) { // 縦（段）
			for (int j = 1; j <= 9; j++) { // 横（かける数）
				if (j == 9) {
					// 最後は||をつけない
					System.out.printf("%02d * %02d = %02d", i, j, i * j);
				} else {
					// それ以外は||つける
					System.out.printf("%02d * %02d = %02d || ", i, j, i * j);
				}
			}
			System.out.println(); //行が終わったら改行
		}

		//Q12　入力された商品の残り台数が表示されるシステム
		System.out.print("商品を入力（、区切り）: ");
		String input = scanner.nextLine();

		String[] products = input.split("、"); //商品ごとの区切り配列にする

		// Randomクラスを使って残り台数をランダムに表記する
		Random rand = new Random();
		int stock;//箱

		//テレビとディスプレイで残り在庫の合計を11台にするため
		int tvStock = rand.nextInt(12); // 0〜11
		int disstock = 11 - tvStock; //テレビの台数から引く

		for (String product : products) { //products配列の中身を1個ずつ取り出す
			stock = rand.nextInt(12); //各商品ごとに在庫をランダム生成

			switch (product) {

			//productがこれらの商品名のいずれかと一致した場合
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(product + "の残り台数は" + stock + "台です");
				break;//次のcase（別の商品）に処理が流れるのを防ぐ

			//productがテレビかディスプレイと一致したとき
			case "テレビ":
			case "ディスプレイ":
				System.out.println(product.equals("テレビ") ? "テレビの残り台数は" + tvStock + "台です"
						: "ディスプレイの残り台数は" + disstock + "台です"); //条件演算子
				break;

			//productがその他の商品だった場合
			default:
				System.out.println("『 " + product + " 』は指定の商品ではありません");
				break;
			}
		}
		scanner.close();
	}
}
