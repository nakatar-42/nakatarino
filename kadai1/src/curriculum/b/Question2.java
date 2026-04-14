package curriculum.b;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		// Q1 scoreが60以上なら合格を表示
		int score = 75;

		if (score >= 60) {
			System.out.println("合格です！");
		}

		// Q2 ageが20以上30以下なら適正年齢
		{
			int age = 25;

			if (age >= 20 && age <= 30) {
				System.out.println("適正年齢です");
			} else {
				System.out.println("対象外です");
			}
		}

		//　Q3 年齢によって表示を変える
		{
			int age = 18;

			if (age >= 20) {
				System.out.println("成人です");
			} else if (age >= 13 && age <= 19) {
				System.out.println("ティーンエイジャーです");
			} else {
				System.out.println("子供です");
			}
		}

		// Q4 一番大きい数値を判定して表示
		int x = 30;
		int y = 15;
		int z = 50;

		if (x >= y && x >= z) {
			System.out.println("一番大きい数は " + x);
		} else if (y >= x && y >= z) {
			System.out.println("一番大きい数は " + y);
		} else {
			System.out.println("一番大きい数は " + z);
		}

		// Q5 入力した数値が正・0・負のどれかを判定する
		Scanner scanner = new Scanner(System.in);

		System.out.print("数値を入力してください: ");
		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println("正の数です");
		} else if (num == 0) {
			System.out.println("0 です");
		} else {
			System.out.println("負の数です");
		}

		// Q6入力した数値が偶数か奇数かを判定する
		System.out.print("数値を入力してください: ");
		int value = scanner.nextInt();

		if (value % 2 == 0) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}

		// Q7入力した点数に応じて評価（優・良・可・不可）を表示する
		System.out.print("0から100のいずれかの数値を入力してください: ");
		int score2 = scanner.nextInt();

		if (score2 < 0 || score2 > 100) {
		    System.out.println("無効な値です");
		} else if (score2 >= 90) {
			System.out.println("優");
		} else if (score2 >= 70) {
			System.out.println("良");
		} else if (score2 >= 50) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}

		// Q8文字列入力が空または未入力かをチェックする
		scanner.nextLine();
		System.out.print("文字を入力してください: ");
		String input = scanner.nextLine();

		if (input == null || input.isEmpty()) {
			System.out.println("入力が無効です");
		} else {
			System.out.println("入力された値" + input);
		}

		// Q9入力した数字（1〜7）に対応する曜日を表示する
		System.out.print("1〜7の数字を入力してください: ");
		int day = scanner.nextInt();

		switch (day) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		case 4:
			System.out.println("木曜日");
			break;
		case 5:
			System.out.println("金曜日");
			break;
		case 6:
			System.out.println("土曜日");
			break;
		case 7:
			System.out.println("日曜日");
			break;
		default:
			System.out.println("無効な入力です");
		}

		//Q10入力した月（1〜12）に応じて季節を表示する
		System.out.print("月を入力してください（1～12）：");
		int month = scanner.nextInt();

		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("冬");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;

		default:
			System.out.println("無効な月です");
		}

		scanner.close();
	}

}
