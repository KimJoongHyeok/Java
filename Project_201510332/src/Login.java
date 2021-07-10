import java.awt.*;
import java.awt.event.*;

public class Login extends Frame {
	Label lid;
	Label lpwd;
	TextField tfId;
	TextField tfPwd;
	Button ok;
	Login(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("Password : ", Label.RIGHT);
		
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		
		ok = new Button("OK");
		
		tfId.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout());
		add(lid);
		add(tfId);
		add(lpwd);
		add(tfPwd);
		add(ok);
		setSize(450, 75);

	    ///////// ������ ��ġ ����(�߾ӿ� ��ġ��Ű�� ����) //////////
	      Toolkit tk = Toolkit.getDefaultToolkit(); 
	      Dimension screenSize = tk.getScreenSize();
	      setLocation(screenSize.width/2-225,screenSize.height/2-37);
	      
		
		
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String id = tfId.getText();
			String password = tfPwd.getText();
			
			if (!id.equals("admin")) {
				System.out.println("�Է��Ͻ� id�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				tfId.requestFocus();
				tfId.selectAll();
			} else if (!password.equals("admin")) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println(id+"��, ���������� �α��� �Ǿ����ϴ�.");
				dispose();
			}
		}
		
	}
}
