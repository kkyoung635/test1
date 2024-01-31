package exsample;

public class Break {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      System.out.println(i);
      if ( i==10 ){
        break;
      }
      i++;
    }
  }
}
