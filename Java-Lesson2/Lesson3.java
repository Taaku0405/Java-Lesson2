public class Lesson3 {
  public static void main(String[] args) {
    // 配列の学習 => namesに複数の値を入れる
    String[] names = { "マイケル", "ボブ", "キャサリン" };
    // マイケルを出力
    System.out.println(names[0]);
    // キャサリンを出力
    System.out.println(names[2]);

    // 配列要素の上書きの学習
    String[] languages = { "Ruby", "PHP", "Python" };
    System.out.println(languages[1]);
    languages[1] = "Java";
    System.out.println(languages[1]);

    // 配列と繰り返しの学習 => for文を使って繰り返し
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // 配列用のfor文の学習
    for (String name : names) {
      System.out.println("私の名前は" + name + "です");
    }
  }
}
