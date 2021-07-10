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

	     addWindowListener(new WindowAdapter() { //닫기버튼
	         public void windowClosing(WindowEvent e) {
	        	 dispose(); //메모리에서 해제(현재 프레임만 닫힘)
	         }
	        });     
	     
	     q1 = new Label("*커피를 선택하세요*");
	     	group = new CheckboxGroup();
			q1cb1 = new Checkbox("아메리카노 (500원)", group, false);
			q1cb2 = new Checkbox("카페라떼 (1000원)", group, false);
			q1cb3 = new Checkbox("카푸치노 (1500원)", group, false);
			
		q2 = new Label("*사이즈를 선택하세요*");
			group = new CheckboxGroup();
			q2cb1 = new Checkbox("작은거 (+0원)", group, false);
			q2cb2 = new Checkbox("중간거 (+500원)", group, false);
			q2cb3 = new Checkbox("큰거 (+1000원)", group, false);
			
		total = new Label("당신의 커피 :");
			end = new Button("선   택");
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
					
					if(q1cb1.getState()) coffee = ("아메리카노");;
					if(q1cb2.getState()) coffee =("카페라떼");;
					if(q1cb3.getState()) coffee =("카푸치노");;
					if(q2cb1.getState()) size = ("작은사이즈");;
					if(q2cb2.getState()) size = ("중간사이즈");;
					if(q2cb3.getState()) size = ("큰사이즈");;
					
					total.setText("* 결과 : 당신의 커피는 " + coffee + " " + size +  " , 총 금액은 " + totalprice + "원 입니다.");
			}
			});
			
			add(q1);
			add(q1cb1); add(q1cb2); add(q1cb3); 
			
			add(new Label("")); //문제들 사이에 빈 줄을 하나 삽입하기 위해 사용
			
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

	