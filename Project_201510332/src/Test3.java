import java.awt.*; //������Ʈ ��� ����
import java.awt.event.*; //�̺�Ʈ ó�� ����

//3.�̺�Ʈ ó����(�ڵ鷯)
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
/*
class CC implements ActionListener{
   
   public void actionPerformed(ActionEvent e) {   
      
      System.out.println( "Ȯ�� ��ư��  �����̽��ϴ�");
   }
}
*/

public class Test3 {

   public static void main(String[] args) {
   
      Frame f = new Frame("�̺�Ʈ ó�� ����"); //������ �⺻: �������̾ƿ�
   
      f.addWindowListener(new AA()); //AAŬ������ �̺�Ʈ ó�� Ŭ������
   
      
      Button b1 = new Button("Ŀ��"); //1. �̺�Ʈ �ҽ�
      b1.setBounds(80,80,100,100);
      b1.setBackground(Color.RED);
      b1.addActionListener(new CC()); //2. �̺�Ʈ ������
   
      Button b2 = new Button("����"); //1. �̺�Ʈ �ҽ�
      b2.setBounds(80,200,100,100);
      b2.setBackground(Color.BLUE);
      b2.addActionListener(new DD()); //2. �̺�Ʈ ������
   
      Button b3 = new Button("������ �޴�"); //1. �̺�Ʈ �ҽ�
      b3.setBounds(250,80,200,100);
      b3.setBackground(Color.WHITE);
      b3.addActionListener(new DD()); //2. �̺�Ʈ ������
      
      f.setLayout(null); //���̾ƿ� ��� ����
      f.setBounds(200, 100, 500, 400); //(200,100)���� ����, ���� 500, ����400 ����

      
      f.add(b1); //�����ӿ� ��ư ���̱�
      f.add(b2);
      f.add(b3);
      
      f.setVisible(true); //�����Ӻ��̱�
   }

}