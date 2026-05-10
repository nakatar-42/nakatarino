package curriculum.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		//Q1 配列に1〜5を入れて、順番に表示する
		// 数値を5つ格納した配列
		int[] numbers = { 1, 2, 3, 4, 5 };

		// 配列の先頭から最後まで繰り返す（要素数はnumbers.lengthで取得）
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		System.out.println("----");//Qごとの区切り

		//Q2 配列の要素を逆順に表示
		int[] numbers2 = { 10, 20, 30, 40, 50 };

		for (int i = numbers2.length - 1; i >= 0; i--) {
			System.out.println(numbers2[i]);
		}

		System.out.println("----");

		//Q3 配列の全要素の合計値を表示
		int[] numbers3 = { 3, 5, 7, 9, 11 };

		int sum = 0; // 合計を入れる箱

		// 配列の要素を順番に足していく
		for (int i = 0; i < numbers3.length; i++) {
			sum += numbers3[i];//sum = sum + i
		}
		System.out.println("合計は " + sum);

		System.out.println("----");

		//Q4 配列の最大値と最小値を求める
		int[] numbers4 = { 12, 7, 9, 21, 5, 18 };

		// 最初の値を基準にする
		int max = numbers4[0];
		int min = numbers4[0];

		for (int i = 1; i < numbers4.length; i++) {

			// 最大値更新
			if (numbers4[i] > max) {
				max = numbers4[i];
			}

			// 最小値更新
			if (numbers4[i] < min) {
				min = numbers4[i];
			}
		}

		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

		System.out.println("----");

		//Q5 配列の全要素を2倍にして表示(拡張for文)
		int[] numbers5 = { 1, 2, 3, 4, 5 };

		// 配列の要素を1つずつ取り出して2倍して表示
		for (int num : numbers5) {
			System.out.println(num * 2);
		}

		//Q6 入力した値が配列に含まれているか判定

		int[] numbers6 = { 4, 7, 10, 15, 20 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("数値を入力してください: ");
		int input = scanner.nextInt();

		boolean found = false; // 見つかったかどうか

		// 配列を順番にチェック
		for (int num : numbers6) {
			if (num == input) {
				found = true;
				break; // 見つけたら終了
			}
		}

		// 結果表示
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");
		}
	}

}
