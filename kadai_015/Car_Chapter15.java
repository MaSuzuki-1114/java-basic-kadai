package kadai_015;

//車クラス（フィールドとメソッドを持つ）
public class Car_Chapter15 {
	// フィールドの宣言
	private int gear =1;  //1速から5速のギアを表す
	private int speed =10; //ギアチェンジ後の速度を表す
	
	//コンストラクタ
	public Car_Chapter15() {
	}
			
	//メソッド①ギアの値により速度を変える
	public void  gearChange( int afterGear) {
        //速度を配列にする（gearArray）
		int[] gearArray = { 10, 20, 30, 40, 50};
		int idx = 0;
		//this.gear-1をインデックスとして値をthis.speedへ代入する
		//gear > 5ならgearArray[0]を返す
		if (afterGear > 5) {
			speed = gearArray[0];
		}else {
			idx = afterGear-1;
			this.speed = gearArray[idx];
		}
		//ギアgearからafterGearに切り替えました
		System.out.println("ギア1から" + afterGear +"に切り替えました");		
	}
			
	//メソッド②ギアチェンジ後の速度を表示する
	public void  run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

		
		
}	




