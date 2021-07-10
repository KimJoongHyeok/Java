import java.awt.*; //컨포넌트 사용 위해
import java.awt.event.*; //이벤트 처리 위해

//3.이벤트 처리기(핸들러)
/*class AA implements WindowListener{

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
*/

class BB extends WindowAdapter {
   public void windowClosing(WindowEvent e) {
      System.out.println("Adapter 클래스르를 통해 프로그램을 종료합니다");
      System.exit(0); //프로그램 종료
   }
}


class CC implements ActionListener{
   static int cnt = 0;
   
   public void actionPerformed(ActionEvent e) {   
      cnt++;
      System.out.println(cnt+"번 확인 버튼을  누르셨습니다");
   }
   
}

class DD implements ActionListener{

   public void actionPerformed(ActionEvent e) { //버튼을 눌렀을 때
      System.out.println(" 프로그램을 종료합니다");
      System.exit(0); //프로그램 종료
   }
   
}

public class Test1 {

   public static void main(String[] args) {
      //1. 이벤트 소스(프레임의 x 닫기 버튼을 누르면 종료시킬 예정)
      Frame f = new Frame("이벤트 처리 연습"); //프레임 기본: 보더레이아웃
      
   
      //2. 이벤트 감지기(리스너), 프레임을 감지하다가 이벤트 발생하면 이벤트 처리기로 보냄
      //f.addWindowListener(new AA()); //AA클래스가 이벤트 처리 클래스임
      //f.addWindowListener(new BB());
      
      f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.out.println("프로그램을 종료합니다");
            System.exit(0); //프로그램 종료
         }
      });
      
      
      
      
      //익명클래스(일회용, 클래스명이 없음) 사용
      /*f.addWindowListener(new  WindowListener() {

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
         
      } );
      */
      
      //버튼 b1을 누르면 콘솔창에 "확인버튼을 누르셨습니다" 출력
      //1. 이벤트 소스 : b1(버튼)
      //2. 이벤트 리스너 : 버튼을 눌렀을 때 이벤트 처리기로 보냄 
      //3. 이벤트 처리기 : actionPeformed() 메소드를 구현한 클래스
      
      Button b1 = new Button("확인"); //1. 이벤트 소스
      b1.setBounds(130,100,100,200);
      b1.setBackground(Color.RED);
      //b1.addActionListener(new CC()); //2. 이벤트 리스너
      
      
      //익명 클래스를 사용하면 같은 클래스에 있는 멤버 접근에 효율적
      b1.addActionListener(new ActionListener() {
         int cnt=0;
         public void actionPerformed(ActionEvent e) { //버튼을 눌렀을 때
            if(cnt %2  ==0) {
            f.setBackground(Color.YELLOW);
            } else if(cnt %3 ==1) {
               f.setBackground(Color.GREEN);
            } else {
               f.setBackground(Color.GRAY);
            }
            cnt++;
            System.out.println(cnt+"번 확인 버튼을  누르셨습니다");
         }
         
            
      });
      
      Button b2 = new Button("종료"); //1. 이벤트 소스
      b2.setBounds(280,100,100,200);
      b2.setBackground(Color.BLUE);
      b2.addActionListener(new DD()); //2. 이벤트 리스너
   
      
      f.setLayout(null); //레이아웃 사용 안함
      f.setBounds(200, 100, 500, 400); //(200,100)에서 시작, 가로 500, 세로400 설정

      
      f.add(b1); //프레임에 버튼 붙이기
      f.add(b2);
      
      f.setVisible(true); //프레임보이기
   }

}