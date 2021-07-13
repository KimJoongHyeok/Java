public class Point { //Point클래스 정의
   int x,y;
   
   Point(int x, int y){
      this.x=x;
      this.y=y;
   }
   
   //p1과 p2사이의 거리를 구해주는 메소드
   static double distance(Point p1,Point p2) {
      double dist;
        dist = Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)
              +(p1.y-p2.y)*(p1.y-p2.y));
        return dist;

      
   }
}