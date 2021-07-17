
//public class Rectangle {
//	int x,y;
//	int width;
//	int height; //안쓰면 private 자동으로
//	
//	public Rectangle(int _x,int _y,int w,int h)
//	{
//		x = _x;
//		y = _y;
//		width = w;
//		height = h;
//	}
//	public void Draw()
//	{
//		System.out.println("" + x + "," + y + "-" + width + "," + height);
//	}
//}


public class Rectangle extends Shape {
	int x,y;
	int width;
	int height; //안쓰면 private 자동으로
	
	public Rectangle(int _x,int _y,int w,int h)
	{
		x = _x;
		y = _y;
		width = w;
		height = h;
	}
	public void Draw()
	{
		System.out.println("Draw Rectangle!");
	}
	
}
