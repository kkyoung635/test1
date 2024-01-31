package condition;

public class Switch4 {
  public static void main(String[] args) {
    int month = 4, day = 0;
    switch ( month ) {
      case 1: case 3: case 5: case 7: case 10: case 12:
        day = 31; break;
      case 4: case 6: case 9: case 11:
        day = 30; break;
      case 2 : day = 29; break;
      default:
        System.out.println("해당월은 존재 않습니다.");
    }
    if( month >= 1  && month <= 12 ){
      System.out.println(month+"월은 "+ day+"까지 입니다.");
    }
  }
}