import java.awt.*;
import java.awt.event.*;

/*
class AA implements WindowListener{

      public void windowActivated(WindowEvent e) {}
      public void windowClosed(WindowEvent e) {}
      public void windowClosing(WindowEvent e) {
         System.out.println("���α׷��� �����մϴ�");
         System.exit(0); //���α׷� ����
      }   
      public void windowDeactivated(WindowEvent e) {}
      public void windowDeiconified(WindowEvent e) {}
      public void windowIconified(WindowEvent e) {}   
      public void windowOpened(WindowEvent e) {}   
      }
*/
public class MenuTest extends Frame {
   //��� ���� ���� ����
   
   MenuTest(String title){ //�Ű������ִ� ������(�ʱ�ȭ)
      super(title); //���� ������ ȣ��(Frame("���ڿ�")ó�� ��)
      setSize(500, 500); //������ ����500,����500 ����
      setLayout(null); //������ ���̾ƿ� ������(��ǥ ���� ã�Ƽ� ���)
      setLocation(200,100); //������ ���� ��ġ ����
      
      
      ////////////////// ������ �ݱ� �̺�Ʈ ó�� �κ�   //////////////////
      addWindowListener(new WindowAdapter() {         
         public void windowClosing(WindowEvent e) {
            System.out.println("���α׷��� �����մϴ�");
            System.exit(0); //���α׷� ����
            }   
         });
      
   
      ///////////������ �޴� �κ�////////////
      MenuBar mb = new MenuBar(); //�޴��� ��ü ����
      Menu mFile = new Menu("File");
      Menu mMenu = new Menu("Menu");
      Menu mMyEvent = new Menu("MyEvent");
      Menu mHelp = new Menu("Help");
      
      MenuItem miJoin = new MenuItem("Join");
      MenuItem miExit = new MenuItem("Exit");
      miExit.addActionListener(new ActionListener(){
    		 public void actionPerformed(ActionEvent e) {
    		 System.exit(0); //���α׷� ����
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
      
      /////�޴��ٿ� �޴� ���̱�////
      mb.add(mFile); mb.add(mMenu); mb.add(mMyEvent); mb.add(mHelp);
 
      setMenuBar(mb); //�����ӿ� �޴��� ���̱�      
      setVisible(true); //������ ���̱�
   }
 
   public static void main(String[] args) { //���α׷� ���� ��ġ
      new MenuTest("������Ʈ ������");
      
   }

}