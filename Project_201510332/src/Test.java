import java.awt.*; //awt������Ʈ ����ϱ� ���� �߰�
// �������� �����̳��̰� �⺻ ���̾ƿ��� �������̾ƿ���(�������� �����̳ʶ�� ��)
public class Test {

   public static void main(String[] args) {
      Frame f = new Frame("������ �����Դϴ�"); //������ ��ü ����      
      Button b = new Button("ok��ư"); //��ư ��ü ����
      Button b2 = new Button("ok2��ư"); //��ư ��ü ����
      Choice day = new Choice(); //���̽� ��ü ����      
      
      f.setLayout(null); //������ ���̾ƿ� ��� ����(���� ��ǥ�� �ۼ�)
      
      /////////////��ư b ������Ʈ ����////////////////
      b.setBounds(100,100,200,100); //��ư ������ġ, ���� ����
      b.setBackground(Color.red);
      b.setForeground(Color.yellow);
      
      /////////////��ư b2 ������Ʈ ����////////////////
      b2.setBounds(400,100,100,50); //��ư ������ġ, ���� ����      
      b2.setBackground(Color.red);      
      b2.setForeground(Color.yellow);
      
      /////////////choice ��� �߰�////////////////
      day.add("��");
      day.add("��");
      day.add("ȭ");
      day.add("��");
      day.add("��");
      day.add("��");
      day.add("��");
   
      day.setBounds(100,300,100,70);
   
      
      //f.setSize(300, 200); //������ ����,���� ������ ����
      //f.setLocation(500, 500); //������ ���� ��ġ(x,y)��ǥ ����
      f.setBounds(500, 200, 600, 400); //���� ���ٰ� ����      
      f.setBackground(Color.black); //������ ���� ����
      
      
      /////////////������ �����̳� ����////////////////
      f.add(b); //������ �����̳ʿ� ��ư ������Ʈ�� ����
      f.add(b2);
      f.add(day);
      
      f.setVisible(true); //������ ���̱�
      
   }

}