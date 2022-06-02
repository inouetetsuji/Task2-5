package study;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";
	private static final Entry<String, Integer> entry = null;

    public static void main(String args[]) {

        // ① 定数を全て使って、String型のListを記述してください。
        HashMap<Integer,String>shohinList = new HashMap<Integer,String>();
		shohinList.put(0, "バナナ");
    	shohinList.put(1, "牛乳");
        shohinList.put(2, "豚肉");
        shohinList.put(3, "コロッケ");

     // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
        /*
         * [ここへ記述]
         *生成したインスタンスをMapインターフェース型の変数sampleHashHashMapに保持している
         *putメソッドで要素の追加を行う
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
		shopMap.put(shohinList.get(0), 125);
        shopMap.put(shohinList.get(1), 180);
        shopMap.put(shohinList.get(2), 350);
        shopMap.put(shohinList.get(3), 100);

        // ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
     for(String shopMap:shopMap) {
    	 System.out.println(shopMap);
     }



    }

	private static int extracted(int i) {
		return i;
	}

	private static String getValue() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}


