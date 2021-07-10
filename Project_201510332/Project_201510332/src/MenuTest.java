import java.awt.*;
import java.awt.event.*;

/*
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
*/
public class MenuTest extends Frame {
   //멤버 변수 선언 구역
   
   MenuTest(String title){ //매개변수있는 생성자(초기화)
      super(title); //조상 생성자 호출(Frame("문자열")처럼 됨)
      setSize(500, 500); //프레임 가로500,세로500 설정
      setLayout(null); //프레임 레이아웃 사용안함(좌표 직접 찾아서 사용)
      setLocation(200,100); //프레임 시작 위치 설정
      
      
      ////////////////// 프레임 닫기 이벤트 처리 부분   //////////////////
      addWindowListener(new WindowAdapter() {         
         public void windowClosing(WindowEvent e) {
            System.out.println("프로그램을 종료합니다");
            System.exit(0); //프로그램 종료
            }   
         });
      
   
      ///////////프레임 메뉴 부분////////////
      MenuBar mb = new MenuBar(); //메뉴바 객체 생성
      Menu mFile = new Menu("File");
      Menu mMenu = new Menu("Menu");
      Menu mMyEvent = new Menu("MyEvent");
      Menu mHelp = new Menu("Help");
      
      MenuItem miJoin = new MenuItem("Join");
      MenuItem miExit = new MenuItem("Exit");
      miExit.addActionListener(new ActionListener(){
    		 public void actionPerformed(ActionEvent e) {
    		 System.exit(0); //프로그램 종료
    		 	}		
    	});
      
      
      MenuItem miMenu1 = new MenuItem("Coffee");
      
      miMenu1.addActionListener(new ActionListener(){
 		 public void actionPerformed(ActionEvent e) {
 		 new Coffee("Coffee");
 		 	}
      });
      
      MenuItem miMenu2 = new MenuItem("Checkbox");

      miMenu2.addActionListener(new ActionListener(){
  		 public void actionPerformed(ActionEvent e) {
  		 new CheckboxEventTest("Checkbox");
  		 	}
       });
      
      MenuItem miMenu3 = new MenuItem("Checkbox2");
      
      miMenu3.addActionListener(new ActionListener(){
   		 public void actionPerformed(ActionEvent e) {
   		 new CheckboxEventTest2("Checkbox2");
   		 	}
        });
      
      MenuItem mievent1 = new MenuItem("event1");
      MenuItem mievent2 = new MenuItem("event2");
      MenuItem mievent3 = new MenuItem("event3");
      MenuItem mihelp = new MenuItem("help");
  
      mFile.add(miJoin);
      mFile.addSeparator();
      mFile.add(miExit);
      mMenu.add(miMenu1);
      mMenu.add(miMenu2);
      mMenu.add(miMenu3);
      mMyEvent.add(mievent1);
      mMyEvent.add(mievent2);
      mMyEvent.add(mievent3);
      mHelp.add(mihelp);
      
      /////메뉴바에 메뉴 붙이기////
      mb.add(mFile); mb.add(mMenu); mb.add(mMyEvent); mb.add(mHelp);
 
      setMenuBar(mb); //프레임에 메뉴바 붙이기      
      setVisible(true); //프레임 보이기
   }
 
   public static void main(String[] args) { //프로그램 시작 위치
      new MenuTest("프로젝트 김중혁");
      
   }

}