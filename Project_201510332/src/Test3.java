import java.awt.*; //컨포넌트 사용 위해
import java.awt.event.*; //이벤트 처리 위해

//3.이벤트 처리기(핸들러)
class AA implements WindowListener{

   public void windowActivated(WindowEvent e) {}

   public void windowClosed(WindowEvent e) {}

   public void windowClosing(WindowEvent e) {
      System.out.println("프로그램을 종료합니다");
      System.exit(0); //프로그램 종료
   }
   
   public void windowDeactivated(WindowEvent e) {}

   public void windowDeiconified(WindowEvent e) {}

   public void windowIconified(WindowEvent e) {}
   
   public void windowOpened(WindowEvent e) {}
   
}
/*
class CC implements ActionListener{
   
   public void actionPerformed(ActionEvent e) {   
      
      System.out.println( "확인 버튼을  누르셨습니다");
   }
}
*/

public class Test3 {

   public static void main(String[] args) {
   
      Frame f = new Frame("이벤트 처리 연습"); //프레임 기본: 보더레이아웃
   
      f.addWindowListener(new AA()); //AA클래스가 이벤트 처리 클래스임
   
      
      Button b1 = new Button("커피"); //1. 이벤트 소스
      b1.setBounds(80,80,100,100);
      b1.setBackground(Color.RED);
      b1.addActionListener(new CC()); //2. 이벤트 리스너
   
      Button b2 = new Button("종료"); //1. 이벤트 소스
      b2.setBounds(80,200,100,100);
      b2.setBackground(Color.BLUE);
      b2.addActionListener(new DD()); //2. 이벤트 리스너
   
      Button b3 = new Button("선택한 메뉴"); //1. 이벤트 소스
      b3.setBounds(250,80,200,100);
      b3.setBackground(Color.WHITE);
      b3.addActionListener(new DD()); //2. 이벤트 리스너
      
      f.setLayout(null); //레이아웃 사용 안함
      f.setBounds(200, 100, 500, 400); //(200,100)에서 시작, 가로 500, 세로400 설정

      
      f.add(b1); //프레임에 버튼 붙이기
      f.add(b2);
      f.add(b3);
      
      f.setVisible(true); //프레임보이기
   }

}