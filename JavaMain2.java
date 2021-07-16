
//public class JavaMain2 {
//
//	public static int Add(int a ,int b)
//	{
//		return a+b;
//	}
//	public static void main(String[] args) {
//		Rectangle r = new Rectangle(10,10,100,70);
//		
//		r.Draw();
//	}
//
//}

public class JavaMain2 {

	public static void main(String[] args) {
		Rectangle r =  new Rectangle(0,0,100,70);
		
		Shape s = r; //Rectangle¿∫ Shape
		s.Draw();
	}

}

