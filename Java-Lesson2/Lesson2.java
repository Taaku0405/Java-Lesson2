public class Lesson2 {
  public static void main(String[] args) {
    // break,continueを使った条件分岐の学習
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // breakを使って、iが5の倍数のときに繰り返し処理を強制終了
      if (i % 5 == 0) {
        break;
      }

      System.out.println(i);
      i++;
    }

    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // continueを使ってjが3の倍数のときの処理をスキップする
      if (j % 3 == 0) {
        continue;
      }
      System.out.println(j);
    }
  }
}
