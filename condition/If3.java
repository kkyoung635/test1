package condition;

/*
8 ~ 13 : 초등학생
14 ~ 16 : 중학생
17 ~ 19 : 고등학생
20 ~ : 성년
*/
public class If3 {
  public static void main(String[] args) {
    int age;
    age = 6;

    if (age <=7) {
      System.out.println("미취학");
    } else if (age <= 13) {
      System.out.println("초등학생");
    } else if (age > 13 && age <= 16) {
      System.out.println("중학생");
    } else if (age > 16 && age <= 19) {
      System.out.println("고등학생");
    } else if (age >= 20) {
      System.out.println("성인");
    }
  }
}

/*
public class If3 {
  public static void main(String[] args) {
    int age;
    age = 13;

    if (age >= 0 && age <=7) {
      System.out.println("미취학");
    }
    if (age > 7 && age <= 13) {
      System.out.println("초등학생");
    }
    if (age > 13 && age <= 16) {
      System.out.println("중학생");
    }
    if (age > 16 && age <= 19) {
      System.out.println("고등학생");
    }
    if (age >= 20) {
      System.out.println("성인");
    }
  }
}
*/