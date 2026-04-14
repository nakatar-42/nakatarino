package curriculum.b;

public class Question3 {
		public static void main(String[] args) {

			// Q1 1から10までの数字を1つずつ表示
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}

			System.out.println("----");

			// Q2 2から20までの偶数を表示
			for (int i = 2; i <= 20; i += 2) {
				System.out.println(i);
			}

			System.out.println("----");

			// Q3 10から1までカウントダウンして表示
			for (int i = 10; i >= 1; i--) {
				System.out.println(i);
			}

			System.out.println("----");

			// Q4 1から100までの合計を求める
			int sum = 0; // 合計を入れる変数を用意

			for (int i = 1; i <= 100; i++) {
				sum += i; // sum = sum + i と同じ
			}

			System.out.println("合計: " + sum);

			System.out.println("----");

			// Q5 三角形を出力
			// 外側のfor文：行の数（1〜5行）
			for (int i = 1; i <= 5; i++) {

				// 内側のfor文：*を表示する回数
				for (int j = 1; j <= i; j++) {
					System.out.print("*"); // 改行しないで表示
				}

				System.out.println(); // 行の最後で改行
			}
		}
}
