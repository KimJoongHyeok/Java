import java.awt.*;
import java.awt.event.*;

public class Bingo extends Frame {
 
 Button[] btn = null;
 boolean[][] boo = new boolean[5][5];   //������ üũ���θ� Ȯ���� ���� �迭
 String[] name = { //�迭 �̸� ����
   "1","2","3","4","5",
   "6","7","8","9","10",
   "11","12","13","14","15",
   "16","17","18","19","20",
   "21","22","23","24","25"
   };

  Bingo(String title){
  super(title);	//Frame Ŭ���� ������ ȣ��
  
  setLayout(new GridLayout(5,5));	//awt ���μ��� 5���� ����  
  EventHandler handler = new EventHandler();
  addWindowListener(handler);
  
  btn = new Button[25];
 
  //Frame�� ��ư�� �߰�
  for(int i = 0; i < 25; i++){
   btn[i] = new Button(name[i]);
   this.add(btn[i]);
   btn[i].addActionListener(handler);
  }
  
   setBounds(500,200,500,500);
   setVisible(true);
 }
 

 boolean checkBingo(){
  int bingoCnt = 0;//�ϼ��� ������ ��
  int i,j;
  int crossCnt1 = 0; //�밢��
  int corssCnt2 = 0; //���밢��
  for(i = 0; i <  5; i++){
   for(j = 0; j < 5; j++){//���ΰ˻�
      
     if( i==j && boo[i][j]==true){//�밢���˻�
       crossCnt1++;
       if(crossCnt1 == 5){
        for(int n = 0; n < 25; n = n+6){
           System.exit(0);
        }
       }
     }
     
     if( ((boo.length - 1)-i) == j  && boo[i][j]==true){	
      corssCnt2++;
      if(corssCnt2 == 5){
       for(int n = 26; n > 0; n = n-6){
        if(n % 4 ==0) System.exit(0);
       }
      }
     }
     
   }
  }
  
  return bingoCnt >= 5;
 }
 
 
 ////////////////////���� �Լ�/////////////////////
 public static void main(String[]args){
    new Bingo("Bingo Game");
 
 }
 
 
 class EventHandler extends WindowAdapter implements ActionListener {
  public void actionPerformed(ActionEvent ae) {//��ư Ŭ���� actionPerformed �޼��� �������̵� �Ͽ� Event �ڵ鸵
    
   Button btn2 = (Button)ae.getSource();            
   
   for(int i = 0; i < 25; i++){
    if(btn[i] == btn2){   
     if(boo[i/5][i%5] == true){      
     }else{
      boo[i/5][i%5] = true;     
     }        
     btn[i].setBackground(Color.pink);    
    }    
   } 
   if(checkBingo() == true){   
   }
  }
  
  public void windowClosing(WindowEvent e) {  
   System.exit(0);
  }
 }
 
}