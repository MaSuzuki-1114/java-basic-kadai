package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	//コンストラクタの作成
	public KatoHanako_Chapter18(String givenName) {
		this.givenName = givenName;
	}

	public void setGivenName() {
		//名を表すフィールドの値をセットする
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18(givenName);
	}
	//個別の自己紹介を出力する（eachIntroduce）
	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

		
}

