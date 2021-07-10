import java.awt.*;
import java.awt.event.*;

public class Help extends Frame{
	
	Image img = null;
	
	Help(String title) {
		super(title);
		
		setSize(500,400); //������ ���� ���� ����
		
		///////// ������ ��ġ ����(�߾ӿ� ��ġ��Ű�� ����) //////////
	      Toolkit tk = Toolkit.getDefaultToolkit(); 
	      Dimension screenSize = tk.getScreenSize();
	      setLocation(screenSize.width/2-250,screenSize.height/2-200);
	      
	      addWindowListener(new WindowAdapter() {         //x ��ư ������ ���� ����
	          public void windowClosing(WindowEvent e) {
	            dispose(); //�޸𸮿��� ����
	             }   
	          });
	      
	      Toolkit tk2 = Toolkit.getDefaultToolkit();
	      img = tk2.getImage("help.jpg");
	      
	      setVisible(true);
		
	}
	
	//paint() �� �ڵ� ȣ���
	//1. ó�� ȭ���� ��Ÿ�� ��
	//2. �ٸ� ȭ�鿡 �������� �ٽ� ȭ�� ��Ÿ�� ��
	//3. �ּ�ȭ�Ǿ��ٰ� �ٽ� ȭ�� ��Ÿ�� ��

	public void paint(Graphics g) { //�������̵�
		
		if(img == null) {
			return;
		}
		
		int imgWidth = img.getWidth(this);
		int imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 0, this);
	}

}
