import java.awt.*;
import java.awt.event.*;

public class Test2 extends Frame {
	//멤버 선언
	Label lid;
	Label lpwd;
	TextField tfld;
	TextField tfPwd;
	Button ok;

	//생성자
	Test2(String title){
		super(title); //Frame(String title)을 호출한다
		
		lid = new Label("ID :",Label.RIGHT); //Lable의 text정렬을 오른쪽정렬
		lpwd = new Label("Password : ",Label.RIGHT);
		// 약 10개의 글자를 입력할 수 있는 TextField 생성
		tfld = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*'); //입력한 값 대신 '*'이 보이게 한다
		ok =  new Button("OK");
		//ok버튼과 TextField에 이벤트처리를 위한 Listener를 추가해준다
		tfld.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());

		setLayout(new FlowLayout()); //LayoutManager 를 FlowLayout으로
		add(lid);					//생성한 Component들을 Frame에 포함시킨다
		add(tfld);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450, 65);
		setVisible(true); //Frame이 화면에 보이게 한다
		
	}
	
	public static void main(String[] args) {
		Test2 aa = new Test2("Login");
	}
		
	class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String id = tfld.getText(); //tfld에 입력되어있는 text를 얻어온다
			String password = tfPwd.getText();

			if(!id.equals("javachobo")) {
				System.out.println("입력하신  id가 유효하지 않습니다. 다시 입력해 주세요");
				//id를 다시 입력할 수 있도록, focus를 tfld로 옮긴다
				tfld.requestFocus();
				tfld.selectAll(); //tfld에 입력된 text가 선택되게 한다
			} else if (!password.equals("asdf")) {
				System.out.println("입력하신 비밀번호가 틀렸습니다. 다시 입력해 주시기 바랍니다.");
				//id를 다시 입력할 수 있도록 focus를 tfld로 옮긴다
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println(id + "님, 성공적으로 로그인 되었습니다.");
			}
		}
	}
	
	//이벤트 처리기(클래스) 내부클래스로 작성해야Test2클래스 내의 멤버 접근 가능
}
