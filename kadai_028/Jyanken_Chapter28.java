package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

//じゃんけんクラス
public class Jyanken_Chapter28 {
	
	//じゃんけんの手を入力するメソッド
	public String getMyChoice() {
		String myHand = "";
		int cnt = 0;
		do {
			//じゃんけんの手を入力する
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			//正しいじゃんけんの手か判定する
			switch (input) {
			case "r":

			case "s":

			case "p":
				cnt = 1;
				myHand = input;
				break;
			default:
				cnt = 0;
			}
		} while (cnt == 0);
			
		//実行クラスにじゃんけんの手を返す
		return myHand;

	}
	
	//相手の手を乱数で選ぶメソッド
	public String getRandom() {
			
		//配列を作成する
		String[] jankenArray = {"r", "s", "p"};		
		
		//乱数で相手の手を選ぶ
		int rdmHand = 0;
		rdmHand = (int) Math.floor(Math.random()*3);
		
		//実行クラスに相手の手を返す
		return jankenArray[rdmHand];

	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		
		//自分と相手の手を出力する
		System.out.println(
				"自分のじゃんけんの手を入力しましょう"
				+ "\nグーはrockのrを入力しましょう"
				+ "\nチョキはscissorsのsを入力しましょう"
				+ "\nパーはpaperのpを入力しましょう"
				);
		
		//自分と相手の手を比較する
		HashMap<String, String>	hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");

		String mine = getMyChoice();
		String cpu = getRandom();
		System.out.println("自分の手は"+ hand.get(mine)+"," + "対戦相手の手は" + hand.get(cpu));
		
		//結果を出力する
		if (mine.equals(cpu)) {
			System.out.println("あいこです");			
		} else if (
			(mine == "r") && (cpu == "s")
			||(mine == "s") && (cpu == "p")
			||(mine == "p") && (cpu == "r")
			) {
			System.out.println("自分の勝ちです");
		} else{
			System.out.println("自分の負けです");
		}	
	}

}
