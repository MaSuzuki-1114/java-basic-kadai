package kadai_018;

abstract public class Kato_Chapter18 {
	//姓・名・住所フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//コンストラクタの作成
	public Kato_Chapter18() {
		
	}

	//共通の紹介を出力するメソッド
	public void commonIntroduce(String familyName, String givenName, String address ) {
		System.out.println("名前は" + this.familyName + this.givenName +"です");
		System.out.println("住所は" + this.address + "です");
	}
		
	//個別の紹介を出力するメソッド
	abstract public void eachIntroduce();
		
	//紹介を実行するメソッド
	public void execIntroduce() {
		commonIntroduce(this.familyName, this.givenName, this.address );
		eachIntroduce();
	}
	

}
