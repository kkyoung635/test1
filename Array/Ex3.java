package Array;

/*
문제1)

신발 사이즈는 250 부터 295 까지 5 단위로 증가 => 5 단위 산수로 넣기?
신발 사이즈 수는 총 10가지 : 배열 arr => arr 배열로 만들기

결과
사이즈 250 (재고 있음)
사이즈 255 (재고 있음)

..

총 10개 출력
* */
public class Ex3 {
  public static void main(String[] args) {
    int[] arr = new int[10]; // 인덱스의 갯수 != 배열의 길이 (length)
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 250 + i * 5;
      System.out.println("사이즈 " + arr[i] + " (재고있음)");
    }

    /*for (int size : arr) { // size로 변수 선언하고 배열을 할당했음 - 확장형 for
      System.out.println("사이즈 " + size + " (재고있음)");
    }*/
  }
}
