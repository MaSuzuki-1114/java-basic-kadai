package kadai_021;

import java.util.HashMap;


public class Dictionary_Chapter21 {
	public void engDictionary(String engKey) {
		
		//HashMapの宣言
		HashMap <String, String> engWord = new HashMap<String, String>();
		
		//英単語の追加
		engWord.put("apple", "りんご");
		engWord.put("peach", "桃");
		engWord.put("banana", "バナナ");
		engWord.put("lemon", "レモン");
		engWord.put("pear", "梨");
		engWord.put("kiwi", "キウィ");
		engWord.put("strawberry", "いちご");
		engWord.put("grape", "ぶどう");
		engWord.put("muscat", "マスカット");
		engWord.put("cherry", "さくらんぼ");
		
		if (engWord.get(engKey) != null) {
			System.out.println( engKey + "の意味は" + engWord.get(engKey) );
		}else {
			System.out.println( engKey + "は辞書に存在しません");
		}
	}
}
