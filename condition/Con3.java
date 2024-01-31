package condition;
/*
문제2 ) 다중 if문
평점 :  rating = 8.1

평점이 7 이상이면 수상한 세탁소
평점이 8 이상이면 아쿠아맨
평점이 9 이상이면 서울의 봄

2. 삼항 연산자로 해보실수 있으시면 해보세요
*/
public class Con3 {
  public static void main(String[] args) {
    double rating = 8.52;

    if (rating >= 9 ){
      System.out.println("서울의 봄");
    } else if (rating >= 8) {
      System.out.println("아쿠아맨");
    } else if (rating >= 7){
      System.out.println("수상한 세탁소");
    }

    String a = rating >= 9 ? "서울의 봄" : rating >= 8 ? "아쿠아맨" : "수상한 세탁소";
    System.out.println(a);
  }
}
