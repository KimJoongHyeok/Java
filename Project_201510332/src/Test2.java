import java.awt.*;
import java.awt.event.*;

public class Test2 extends Frame {
	//��� ����
	Label lid;
	Label lpwd;
	TextField tfld;
	TextField tfPwd;
	Button ok;

	//������
	Test2(String title){
		super(title); //Frame(String title)�� ȣ���Ѵ�
		
		lid = new Label("ID :",Label.RIGHT); //Lable�� text������ ����������
		lpwd = new Label("Password : ",Label.RIGHT);
		// �� 10���� ���ڸ� �Է��� �� �ִ� TextField ����
		tfld = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*'); //�Է��� �� ��� '*'�� ���̰� �Ѵ�
		ok =  new Button("OK");
		//ok��ư�� TextField�� �̺�Ʈó���� ���� Listener�� �߰����ش�
		tfld.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());

		setLayout(new FlowLayout()); //LayoutManager �� FlowLayout����
		add(lid);					//������ Component���� Frame�� ���Խ�Ų��
		add(tfld);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450, 65);
		setVisible(true); //Frame�� ȭ�鿡 ���̰� �Ѵ�
		
	}
	
	public static void main(String[] args) {
		Test2 aa = new Test2("Login");
	}
		
	class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String id = tfld.getText(); //tfld�� �ԷµǾ��ִ� text�� ���´�
			String password = tfPwd.getText();

			if(!id.equals("javachobo")) {
				System.out.println("�Է��Ͻ�  id�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���");
				//id�� �ٽ� �Է��� �� �ֵ���, focus�� tfld�� �ű��
				tfld.requestFocus();
				tfld.selectAll(); //tfld�� �Էµ� text�� ���õǰ� �Ѵ�
			} else if (!password.equals("asdf")) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				//id�� �ٽ� �Է��� �� �ֵ��� focus�� tfld�� �ű��
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println(id + "��, ���������� �α��� �Ǿ����ϴ�.");
			}
		}
	}
	
	//�̺�Ʈ ó����(Ŭ����) ����Ŭ������ �ۼ��ؾ�Test2Ŭ���� ���� ��� ���� ����
}
