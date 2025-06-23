package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		//各子クラスのインスタンスを作成
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18("太郎");
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18("一郎");
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18("花子");
		
		//setGivenNameメソッドの実行
		Taro.setGivenName();
		Ichiro.setGivenName();
		Hanako.setGivenName();
		
		//execIntroduceメソッドの実行
		Taro.execIntroduce();
		Ichiro.execIntroduce();
		Hanako.execIntroduce();
		
	}
}
