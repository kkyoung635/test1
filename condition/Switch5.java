package condition;

public class Switch5 {
  public static void main(String[] args) {
    // 짝수, 홀수 ? : if , 삼항
    int num = 5;
    switch ( num % 2 ) {
      case 0 :
        System.out.println("짝수");
        break;
      default:
        System.out.println("홀수");
    }
  }
}
