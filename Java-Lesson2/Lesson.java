public class Lesson {
  public static void main(String[] args) {
    // switch文の学習② => defaultを使用
    int n = 0;
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("中吉です");
        break;
      default:
        System.out.println("凶です");
        break;
    }
  }
}
