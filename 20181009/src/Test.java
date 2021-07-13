import java.util.*;
public class Test {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a,b,c,d;
      
      System.out.print("p1의 x입력 : ");
      a=input.nextInt();
      System.out.print("p1의 y입력 : ");
      b=input.nextInt();
      System.out.print("p2의 x입력 : ");
      c=input.nextInt();
      System.out.print("p2의 y입력 : ");
      d=input.nextInt();
      
       Point p1 = new Point(a, b);
       Point p2 = new Point(c, d);
       
       System.out.print("p1("+p1.x+","+p1.y+")과p2("+p2.x+","+p2.y+")");
       double result = Point.distance(p1, p2);
       System.out.printf("두 점 사이의 거리는 %.2f 입니다!",result);
       
      
      

   }

}