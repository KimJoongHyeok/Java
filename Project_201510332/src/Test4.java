import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Test4 {

	public static void main(String[] args) {
		Frame f = new Frame("�α��� ȭ��");
		f.setLayout(null);
		f.setBounds(100, 100, 300, 200);
		f.setBackground(Color.orange);
		
		////////////////��Ʈ ��ü ����/////////////
		Font f1 = new Font("SansSerif",Font.ITALIC,15);
		Font f2 = new Font("Serif",Font.BOLD,20);
		Font f3 = new Font("DialogInput",Font.BOLD+Font.ITALIC,25);

		
		Label id = new Label("ID: ",Label.RIGHT); //���̺� ��ü ���� 
		id.setBounds(50,50,100,10);
		
		Label pwd = new Label("PASSWORD: ", Label.RIGHT); //���̺� ��ü ���� 
		pwd.setBounds(50,75,100,10);
		
		TextField tfid = new TextField(10);//�ؽ�Ʈ�ʵ� ��ü ����
		tfid.setBounds(160,50,100,20);
		//tfid.setBackground(Color.black);
		//tfid.setForeground(Color.white);
		
		TextField tfpwd =  new TextField(10);
		tfpwd.setBounds(160,75,100,20);
		tfpwd.setEchoChar('*'); // �Է°� ��� '����'�� ����
		//tfpwd.setBackground(Color.black);
		//tfpwd.setForeground(Color.white);
		
		Label text = new Label("Text : �ȳ��ϼ���");
		text.setBounds(50,80,200,100);
		text.setForeground(Color.blue);
		text.setFont(f2); // ���̺� text�� ��Ʈ ����
		
		 //������ ���� ����
		//////////////////////�����ӿ� ������Ʈ ����////////////
		f.add(id);
		f.add(pwd);
		f.add(tfid);
		f.add(tfpwd);
		f.add(text);
		
		f.setVisible(true);// �����Ӻ��̱� (�ʼ�)
	}

}
