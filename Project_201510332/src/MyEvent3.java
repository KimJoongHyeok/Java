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
	     
	    
	 		lname = new Label("이름 : ", Label.LEFT);
	 		tfName = new TextField(10);
	 		
	 		lid = new Label("학번 : ", Label.LEFT);
	 		tfId = new TextField(10);


		q1 = new Label(" * 전공을 선택하세요 * ");
			group = new CheckboxGroup();
			q1cb1 = new Checkbox("전자소프트웨어 학과", group, false);
			q1cb2 = new Checkbox("ICT디바이스 학과", group, false);
			q1cb3 = new Checkbox("산업보안 학과", group, false);
			
			
			q2 = new Label(" * 수강신청할 전공 과목을 선택하세요 * ");
	     	group = new CheckboxGroup();
			q2cb1 = new Checkbox("자료구조와 알고리즘", group, false);
			q2cb2 = new Checkbox("자바 프로그래밍", group, false);
			q2cb3 = new Checkbox("네트워크 보안", group, false);
			q2cb4 = new Checkbox("C 프로그래밍", group, false);
			
		total = new Label("전공 선택 :");
			Button end = new Button("선   택");
			end.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String major = null,majorclass = null;
					String a= tfName.getText();
					String b = tfId.getText();
					
					if(q1cb1.getState()) major = ("전자소프트웨어 학과");;
					if(q1cb2.getState()) major =("ICT디바이스 학과");;
					if(q1cb3.getState()) major =("산업보안 학과");;
					if(q2cb1.getState()) majorclass = ("자료구조와 알고리즘");;
					if(q2cb2.getState()) majorclass = ("자바 프로그래밍");;
					if(q2cb3.getState()) majorclass = ("네트워크 보안");;
					if(q2cb4.getState()) majorclass = ("C 프로그래밍");;

					
					total.setText("* 학생 정보 :  이름은  ' " + a + " ' , 학번은 ' " +b + " ' 이고, "+ "학과는  ' " + major + "' , 수강 전공 과목은 ' " + majorclass + " '  입니다");
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