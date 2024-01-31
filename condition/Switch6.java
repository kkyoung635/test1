package condition;

public class Switch6 {
  public static void main(String[] args) {
    int x = 5;
    String  result = switch (x) {
      case 1  -> "운동화" ;
      case 3,4 -> "화장품" ;
      case 5 -> "구두" ;
      case 9 -> "상품권" ;
      default-> "꽝 다음기회에";
    };
    System.out.println( result );
  }
}
