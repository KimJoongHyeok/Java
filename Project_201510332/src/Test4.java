import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Test4 {

	public static void main(String[] args) {
		Frame f = new Frame("로그인 화면");
		f.setLayout(null);
		f.setBounds(100, 100, 300, 200);
		f.setBackground(Color.orange);
		
		////////////////폰트 객체 생성/////////////
		Font f1 = new Font("SansSerif",Font.ITALIC,15);
		Font f2 = new Font("Serif",Font.BOLD,20);
		Font f3 = new Font("DialogInput",Font.BOLD+Font.ITALIC,25);

		
		Label id = new Label("ID: ",Label.RIGHT); //레이블 객체 생성 
		id.setBounds(50,50,100,10);
		
		Label pwd = new Label("PASSWORD: ", Label.RIGHT); //레이블 객체 생성 
		pwd.setBounds(50,75,100,10);
		
		TextField tfid = new TextField(10);//텍스트필드 객체 생성
		tfid.setBounds(160,50,100,20);
		//tfid.setBackground(Color.black);
		//tfid.setForeground(Color.white);
		
		TextField tfpwd =  new TextField(10);
		tfpwd.setBounds(160,75,100,20);
		tfpwd.setEchoChar('*'); // 입력값 대신 '문자'가 나옴
		//tfpwd.setBackground(Color.black);
		//tfpwd.setForeground(Color.white);
		
		Label text = new Label("Text : 안녕하세요");
		text.setBounds(50,80,200,100);
		text.setForeground(Color.blue);
		text.setFont(f2); // 레이블 text의 폰트 설정
		
		 //프레임 배경색 설정
		//////////////////////프레임에 컨포넌트 붙임////////////
		f.add(id);
		f.add(pwd);
		f.add(tfid);
		f.add(tfpwd);
		f.add(text);
		
		f.setVisible(true);// 프레임보이기 (필수)
	}

}
