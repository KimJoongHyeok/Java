public class Point { //PointŬ���� ����
   int x,y;
   
   Point(int x, int y){
      this.x=x;
      this.y=y;
   }
   
   //p1�� p2������ �Ÿ��� �����ִ� �޼ҵ�
   static double distance(Point p1,Point p2) {
      double dist;
        dist = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)
              +(p1.y-p2.y)*(p1.y-p2.y));
        return dist;

      
   }
}