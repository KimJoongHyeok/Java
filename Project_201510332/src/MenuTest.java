import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
	// ��� ���� ���� ����

	MenuTest(String title) { // �Ű������ִ� ������(�ʱ�ȭ)
		super(title); // ���� ������ ȣ��(Frame("���ڿ�")ó�� ��)
		setSize(500, 500); // ������ ����500,����500 ����
		setLayout(null); // ������ ���̾ƿ� ������(��ǥ ���� ã�Ƽ� ���)

		this.setIconImage(new ImageIcon("icon.png").getImage());

		///////// ������ ��ġ ����(�߾ӿ� ��ġ��Ű�� ����) //////////
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setLocation(screenSize.width / 2 - 250, screenSize.height / 2 - 250);

		// setLocation(200,100); //������ ���� ��ġ ����

		////////////////// ������ �ݱ� �̺�Ʈ ó�� �κ� //////////////////
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("���α׷��� �����մϴ�");
				System.exit(0); // ���α׷� ����
			}
		});

		/////////// ������ �޴� �κ�////////////
		MenuBar mb = new MenuBar(); // �޴��� ��ü ����
		Menu mFile = new Menu("File");
		Menu mMenu = new Menu("Menu");
		Menu mMyEvent = new Menu("MyEvent");
		Menu mHelp = new Menu("Help");

		//////////// �޴������� ��ü ���� /////////////
		MenuItem miJoin = new MenuItem("Join", new MenuShortcut('J', true)); // ����� ����(ctrl + shift + J)

		MenuItem miExit = new MenuItem("Exit", new MenuShortcut('E')); // ����� ����(ctrl + E)
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // ���α׷� ����
			}
		});

		MenuItem miMenu1 = new MenuItem("Coffee");

		miMenu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Coffee("Coffee");
			}
		});

		MenuItem miMenu2 = new MenuItem("Checkbox");

		miMenu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckboxEventTest("Checkbox");
			}
		});

		MenuItem miMenu3 = new MenuItem("Checkbox2");

		miMenu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckboxEventTest2("Checkbox2");
			}
		});

		MenuItem mievent1 = new MenuItem("event1");

		mievent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Bingo("���� ����");
			}
		});
		MenuItem mievent2 = new MenuItem("event2");

		mievent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyEvent2("Ŀ�� �̱�");
			}
		});
		MenuItem mievent3 = new MenuItem("event3");

		mievent3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyEvent3("�а�&����");
			}
		});

		MenuItem mihelp = new MenuItem("help");

		mihelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Help("�������� �˾Ұ����� ����� �׳� ������Ƽ �����̴�");
			}
		});

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

		///// �޴��ٿ� �޴� ���̱�////
		mb.add(mFile);
		mb.add(mMenu);
		mb.add(mMyEvent);
		mb.add(mHelp);

		setMenuBar(mb); // �����ӿ� �޴��� ���̱�
		setVisible(true); // ������ ���̱�
	}

	public void paint(Graphics g) { // �������̵�

		Image img = Toolkit.getDefaultToolkit().getImage("javalogo1.jpg");
		g.drawImage(img, 0, 130, this);
	}

	public static void main(String[] args) { // ���α׷� ���� ��ġ
		new MenuTest("������Ʈ ������");
		// new Login("Login");

	}

}