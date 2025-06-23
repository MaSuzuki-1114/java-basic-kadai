package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		//インスタンスを作成
		Dictionary_Chapter21 engDict = new Dictionary_Chapter21();
		
		//調べる英単語の配列を作成
		String[] engArray = {"apple", "banana", "grape", "orange"} ;
		
		//メソッドを指定の引数で呼び出す
		for (int i = 0; i < engArray.length; i++) {
			engDict.engDictionary(engArray[i]);			
		}
	}

}
