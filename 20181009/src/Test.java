import java.util.*;
public class Test {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a,b,c,d;
      
      System.out.print("p1�� x�Է� : ");
      a=input.nextInt();
      System.out.print("p1�� y�Է� : ");
      b=input.nextInt();
      System.out.print("p2�� x�Է� : ");
      c=input.nextInt();
      System.out.print("p2�� y�Է� : ");
      d=input.nextInt();
      
       Point p1 = new Point(a, b);
       Point p2 = new Point(c, d);
       
       System.out.print("p1("+p1.x+","+p1.y+")��p2("+p2.x+","+p2.y+")");
       double result = Point.distance(p1, p2);
       System.out.printf("�� �� ������ �Ÿ��� %.2f �Դϴ�!",result);
       
      
      

   }

}