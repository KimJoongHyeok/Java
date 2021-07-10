import java.awt.*;
import java.awt.event.*;

public class MyEvent2 extends Frame{

	Label q1;
	Label q2;
	Label total;
	Checkbox q1cb1, q1cb2,q1cb3; 
	Checkbox q2cb1, q2cb2,q2cb3;
	CheckboxGroup group;
	Button end;
	
	MyEvent2(String title) {
		super(title);
		setSize(500,400);
		setLayout(new GridLayout(12,1));
		
	      Toolkit tk = Toolkit.getDefaultToolkit(); 
	      Dimension screenSize = tk.getScreenSize();
	      setLocation(screenSize.width/2-250,screenSize.height/2-200);

	     addWindowListener(new WindowAdapter() { //�ݱ��ư
	         public void windowClosing(WindowEvent e) {
	        	 dispose(); //�޸𸮿��� ����(���� �����Ӹ� ����)
	         }
	        });     
	     
	     q1 = new Label("*Ŀ�Ǹ� �����ϼ���*");
	     	group = new CheckboxGroup();
			q1cb1 = new Checkbox("�Ƹ޸�ī�� (500��)", group, false);
			q1cb2 = new Checkbox("ī��� (1000��)", group, false);
			q1cb3 = new Checkbox("īǪġ�� (1500��)", group, false);
			
		q2 = new Label("*����� �����ϼ���*");
			group = new CheckboxGroup();
			q2cb1 = new Checkbox("������ (+0��)", group, false);
			q2cb2 = new Checkbox("�߰��� (+500��)", group, false);
			q2cb3 = new Checkbox("ū�� (+1000��)", group, false);
			
		total = new Label("����� Ŀ�� :");
			end = new Button("��   ��");
			end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					int totalprice = 0 ;
					String coffee = null,size = null;
					
					if(q1cb1.getState()) totalprice += 500;
					if(q1cb2.getState()) totalprice += 1000;
					if(q1cb3.getState()) totalprice += 1500;
					if(q2cb1.getState()) totalprice += 0;
					if(q2cb2.getState()) totalprice += 500;
					if(q2cb3.getState()) totalprice += 1000;
					
					if(q1cb1.getState()) coffee = ("�Ƹ޸�ī��");;
					if(q1cb2.getState()) coffee =("ī���");;
					if(q1cb3.getState()) coffee =("īǪġ��");;
					if(q2cb1.getState()) size = ("����������");;
					if(q2cb2.getState()) size = ("�߰�������");;
					if(q2cb3.getState()) size = ("ū������");;
					
					total.setText("* ��� : ����� Ŀ�Ǵ� " + coffee + " " + size +  " , �� �ݾ��� " + totalprice + "�� �Դϴ�.");
			}
			});
			
			add(q1);
			add(q1cb1); add(q1cb2); add(q1cb3); 
			
			add(new Label("")); //������ ���̿� �� ���� �ϳ� �����ϱ� ���� ���
			
			add(q2);
			add(q2cb1); add(q2cb2); add(q2cb3); 
			
			add(end);
			add(total);
			
			setVisible(true);
		}
		
	
		public static void main(String args[]) {
				MyEvent2 mainWin = new MyEvent2("MyEvent2 - coffee");
	}
}

	