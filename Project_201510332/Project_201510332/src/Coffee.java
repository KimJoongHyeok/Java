import java.awt.*; // 컨포넌트 사용 위해
import java.awt.event.*; // 이벤트 처리 위해

public class Coffee extends Frame{
    
     Label l = new Label("음료 선택하세요");
     Font f1 = new Font("Serif", Font.BOLD, 20);
     
     Coffee(String title){
        super(title);

        
        l.setBounds(250, 100, 200, 80);
        l.setFont(f1);
       
        setBackground(new Color (150,210,160));
        
        addWindowListener(new WindowAdapter() { //닫기버튼
         public void windowClosing(WindowEvent e) {
        	 //System.out.println("프로그램 종료합니다.");
        	 	// System.exit(0); // 프로그램 종료
        	 dispose(); //메모리에서 해제(현재 프레임만 닫힘)
         }
        });     

        Button b1 = new Button("커피"); // 1. 이벤트 소스
        b1.setBounds(100, 100, 100, 100);
        b1.setBackground(Color.ORANGE);
        
        // 익명클래스 사용하면 같은 클래스에 있는 멤버 접근이 효율적!(쉬움)
        b1.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
          l.setForeground(Color.BLUE); // 글자색 변경
          l.setText("커피 선택! :D ");
         }
        });

        
        Button b2 = new Button("콜라");
        b2.setBounds(100, 220, 100, 100);
        b2.setBackground(Color.CYAN);
        
        b2.addActionListener(new ActionListener() { 
         public void actionPerformed(ActionEvent e) { 
          l.setForeground(Color.RED);
          l.setText("콜라 선택! :D ");
         }
        });
        
        setLayout(null); 
        setBounds(200, 100, 500, 400);

        add(b1);
        add(b2);
        add(l);
        
        setVisible(true); // 프레임 보이기
      
     }
     
/*
 public static void main(String[] args) {
    
    new Coffee("Coffee");
 } */
       
}