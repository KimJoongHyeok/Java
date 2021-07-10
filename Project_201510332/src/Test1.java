import java.awt.*; //������Ʈ ��� ����
import java.awt.event.*; //�̺�Ʈ ó�� ����

//3.�̺�Ʈ ó����(�ڵ鷯)
/*class AA implements WindowListener{

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

class BB extends WindowAdapter {
   public void windowClosing(WindowEvent e) {
      System.out.println("Adapter Ŭ�������� ���� ���α׷��� �����մϴ�");
      System.exit(0); //���α׷� ����
   }
}


class CC implements ActionListener{
   static int cnt = 0;
   
   public void actionPerformed(ActionEvent e) {   
      cnt++;
      System.out.println(cnt+"�� Ȯ�� ��ư��  �����̽��ϴ�");
   }
   
}

class DD implements ActionListener{

   public void actionPerformed(ActionEvent e) { //��ư�� ������ ��
      System.out.println(" ���α׷��� �����մϴ�");
      System.exit(0); //���α׷� ����
   }
   
}

public class Test1 {

   public static void main(String[] args) {
      //1. �̺�Ʈ �ҽ�(�������� x �ݱ� ��ư�� ������ �����ų ����)
      Frame f = new Frame("�̺�Ʈ ó�� ����"); //������ �⺻: �������̾ƿ�
      
   
      //2. �̺�Ʈ ������(������), �������� �����ϴٰ� �̺�Ʈ �߻��ϸ� �̺�Ʈ ó����� ����
      //f.addWindowListener(new AA()); //AAŬ������ �̺�Ʈ ó�� Ŭ������
      //f.addWindowListener(new BB());
      
      f.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            System.out.println("���α׷��� �����մϴ�");
            System.exit(0); //���α׷� ����
         }
      });
      
      
      
      
      //�͸�Ŭ����(��ȸ��, Ŭ�������� ����) ���
      /*f.addWindowListener(new  WindowListener() {

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
         
      } );
      */
      
      //��ư b1�� ������ �ܼ�â�� "Ȯ�ι�ư�� �����̽��ϴ�" ���
      //1. �̺�Ʈ �ҽ� : b1(��ư)
      //2. �̺�Ʈ ������ : ��ư�� ������ �� �̺�Ʈ ó����� ���� 
      //3. �̺�Ʈ ó���� : actionPeformed() �޼ҵ带 ������ Ŭ����
      
      Button b1 = new Button("Ȯ��"); //1. �̺�Ʈ �ҽ�
      b1.setBounds(130,100,100,200);
      b1.setBackground(Color.RED);
      //b1.addActionListener(new CC()); //2. �̺�Ʈ ������
      
      
      //�͸� Ŭ������ ����ϸ� ���� Ŭ������ �ִ� ��� ���ٿ� ȿ����
      b1.addActionListener(new ActionListener() {
         int cnt=0;
         public void actionPerformed(ActionEvent e) { //��ư�� ������ ��
            if(cnt %2  ==0) {
            f.setBackground(Color.YELLOW);
            } else if(cnt %3 ==1) {
               f.setBackground(Color.GREEN);
            } else {
               f.setBackground(Color.GRAY);
            }
            cnt++;
            System.out.println(cnt+"�� Ȯ�� ��ư��  �����̽��ϴ�");
         }
         
            
      });
      
      Button b2 = new Button("����"); //1. �̺�Ʈ �ҽ�
      b2.setBounds(280,100,100,200);
      b2.setBackground(Color.BLUE);
      b2.addActionListener(new DD()); //2. �̺�Ʈ ������
   
      
      f.setLayout(null); //���̾ƿ� ��� ����
      f.setBounds(200, 100, 500, 400); //(200,100)���� ����, ���� 500, ����400 ����

      
      f.add(b1); //�����ӿ� ��ư ���̱�
      f.add(b2);
      
      f.setVisible(true); //�����Ӻ��̱�
   }

}