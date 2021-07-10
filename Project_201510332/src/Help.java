import java.awt.*;
import java.awt.event.*;

public class Help extends Frame{
	
	Image img = null;
	
	Help(String title) {
		super(title);
		
		setSize(500,400); //프레임 가로 세로 설정
		
		///////// 프레임 위치 지정(중앙에 위치시키기 위해) //////////
	      Toolkit tk = Toolkit.getDefaultToolkit(); 
	      Dimension screenSize = tk.getScreenSize();
	      setLocation(screenSize.width/2-250,screenSize.height/2-200);
	      
	      addWindowListener(new WindowAdapter() {         //x 버튼 누르면 나만 닫힘
	          public void windowClosing(WindowEvent e) {
	            dispose(); //메모리에서 해제
	             }   
	          });
	      
	      Toolkit tk2 = Toolkit.getDefaultToolkit();
	      img = tk2.getImage("help.jpg");
	      
	      setVisible(true);
		
	}
	
	//paint() 는 자동 호출됨
	//1. 처음 화면이 나타날 때
	//2. 다른 화면에 가려졌다 다시 화면 나타날 때
	//3. 최소화되었다가 다시 화면 나타날 때

	public void paint(Graphics g) { //오버라이딩
		
		if(img == null) {
			return;
		}
		
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 0, this);
	}

}
