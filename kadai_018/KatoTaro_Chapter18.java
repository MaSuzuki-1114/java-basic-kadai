package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{

	//コンストラクタの作成
	public KatoTaro_Chapter18(String givenName) {
		this.givenName = givenName;
	}
	
	public void setGivenName() {
		//名を表すフィールドの値をセットする
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18(givenName);
	}
	//個別の自己紹介を出力する（eachIntroduce）
	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

		
}

