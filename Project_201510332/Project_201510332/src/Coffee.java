import java.awt.*; // ������Ʈ ��� ����
import java.awt.event.*; // �̺�Ʈ ó�� ����

public class Coffee extends Frame{
    
     Label l = new Label("���� �����ϼ���");
     Font f1 = new Font("Serif", Font.BOLD, 20);
     
     Coffee(String title){
        super(title);

        
        l.setBounds(250, 100, 200, 80);
        l.setFont(f1);
       
        setBackground(new Color (150,210,160));
        
        addWindowListener(new WindowAdapter() { //�ݱ��ư
         public void windowClosing(WindowEvent e) {
        	 //System.out.println("���α׷� �����մϴ�.");
        	 	// System.exit(0); // ���α׷� ����
        	 dispose(); //�޸𸮿��� ����(���� �����Ӹ� ����)
         }
        });     

        Button b1 = new Button("Ŀ��"); // 1. �̺�Ʈ �ҽ�
        b1.setBounds(100, 100, 100, 100);
        b1.setBackground(Color.ORANGE);
        
        // �͸�Ŭ���� ����ϸ� ���� Ŭ������ �ִ� ��� ������ ȿ����!(����)
        b1.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
          l.setForeground(Color.BLUE); // ���ڻ� ����
          l.setText("Ŀ�� ����! :D ");
         }
        });

        
        Button b2 = new Button("�ݶ�");
        b2.setBounds(100, 220, 100, 100);
        b2.setBackground(Color.CYAN);
        
        b2.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
          l.setForeground(Color.RED);
          l.setText("�ݶ� ����! :D ");
         }
        });
        
        setLayout(null); 
        setBounds(200, 100, 500, 400);

        add(b1);
        add(b2);
        add(l);
        
        setVisible(true); // ������ ���̱�
      
     }
     
/*
 public static void main(String[] args) {
    
    new Coffee("Coffee");
 } */
       
}