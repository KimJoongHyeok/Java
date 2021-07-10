import java.awt.*;
import java.awt.event.*;

public class MyEvent3 extends Frame{
	
	Label lname;
	Label lid;
	TextField tfName;
	TextField tfId;

	Label q1;
	Label q2;
	Label total;
	Checkbox q1cb1, q1cb2,q1cb3; 
	Checkbox q2cb1, q2cb2,q2cb3,q2cb4;
	CheckboxGroup group;

	
	MyEvent3(String title) {
		super(title);
		setSize(1200,800);
		setLayout(new GridLayout(20,1));
		
	      Toolkit tk = Toolkit.getDefaultToolkit(); 
	      Dimension screenSize = tk.getScreenSize();
	      setLocation(screenSize.width/2-600,screenSize.height/2-400);

	     addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent e) {
	        	 dispose(); 
	         }
	        });
	     
	    
	 		lname = new Label("�̸� : ", Label.LEFT);
	 		tfName = new TextField(10);
	 		
	 		lid = new Label("�й� : ", Label.LEFT);
	 		tfId = new TextField(10);


		q1 = new Label(" * ������ �����ϼ��� * ");
			group = new CheckboxGroup();
			q1cb1 = new Checkbox("���ڼ���Ʈ���� �а�", group, false);
			q1cb2 = new Checkbox("ICT����̽� �а�", group, false);
			q1cb3 = new Checkbox("������� �а�", group, false);
			
			
			q2 = new Label(" * ������û�� ���� ������ �����ϼ��� * ");
	     	group = new CheckboxGroup();
			q2cb1 = new Checkbox("�ڷᱸ���� �˰���", group, false);
			q2cb2 = new Checkbox("�ڹ� ���α׷���", group, false);
			q2cb3 = new Checkbox("��Ʈ��ũ ����", group, false);
			q2cb4 = new Checkbox("C ���α׷���", group, false);
			
		total = new Label("���� ���� :");
			Button end = new Button("��   ��");
			end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String major = null,majorclass = null;
					String a= tfName.getText();
					String b = tfId.getText();
					
					if(q1cb1.getState()) major = ("���ڼ���Ʈ���� �а�");;
					if(q1cb2.getState()) major =("ICT����̽� �а�");;
					if(q1cb3.getState()) major =("������� �а�");;
					if(q2cb1.getState()) majorclass = ("�ڷᱸ���� �˰���");;
					if(q2cb2.getState()) majorclass = ("�ڹ� ���α׷���");;
					if(q2cb3.getState()) majorclass = ("��Ʈ��ũ ����");;
					if(q2cb4.getState()) majorclass = ("C ���α׷���");;

					
					total.setText("* �л� ���� :  �̸���  ' " + a + " ' , �й��� ' " +b + " ' �̰�, "+ "�а���  ' " + major + "' , ���� ���� ������ ' " + majorclass + " '  �Դϴ�");
			}
			});
			
			add(lname);
			add(tfName);
			add(lid);
			add(tfId);
			
			add(q1);
			add(q1cb1); add(q1cb2); add(q1cb3); 
			
			add(new Label("")); 
			
			add(q2);
			add(q2cb1); add(q2cb2); add(q2cb3); add(q2cb4);
			
			add(end);
			add(total);
			
			setVisible(true);
		}
		
	
		public static void main(String args[]) {
				
	}
}