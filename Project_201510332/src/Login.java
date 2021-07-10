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

	    ///////// 프레임 위치 지정(중앙에 위치시키기 위해) //////////
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
				System.out.println("입력하신 id가 유효하지 않습니다. 다시 입력해 주세요.");
				tfId.requestFocus();
				tfId.selectAll();
			} else if (!password.equals("admin")) {
				System.out.println("입력하신 비밀번호가 틀렸습니다. 다시 입력해 주시길 바랍니다.");
				tfPwd.requestFocus();
				tfPwd.selectAll();
			} else {
				System.out.println(id+"님, 성공적으로 로그인 되었습니다.");
				dispose();
			}
		}
		
	}
}
