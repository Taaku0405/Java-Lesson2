class Main {
  public static void main(String[] args) {
    // 真偽値と条件式の学習
    System.out.println(true);
    System.out.println(false);
    System.out.println(12 / 4 == 3);
    System.out.println(12 / 4 != 3);
    boolean bool = 3 * 9 == 27;
    System.out.println(bool);

    // 比較演算子の学習
    System.out.println(4 + 2 < 6);
    System.out.println(4 + 2 <= 6);

    // 論理演算子の学習 『かつ』= && 『または』 = || 『〜でない』 = !(◯ >= △)
    System.out.println(true || false);
    System.out.println(false && true);
    // 8 < 5 かつ 3 >= 2 の結果を出力
    System.out.println(8 < 5 && 3 >= 2);
    // 8 < 5 または 3 >= 2 の結果を出力
    System.out.println(8 < 5 || 3 >= 2);
    // 8 < 5 でないの結果を出力
    System.out.println(!(8 < 5));

    // 条件分岐ifを使った学習
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }

    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }

    int x = 5;
    if (x > 2) {
      System.out.println("xは２より大きい");
    }

    if (x > 8) {
      System.out.println("xは8より大きい");
    }

    // 条件分岐 else, eise if の学習
    int number = 12;
    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }

    // swich文の学習①
    int n = 1;
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
    }
  }
}