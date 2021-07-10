import java.awt.*;
import java.awt.event.*;

public class Bingo extends Frame {
 
 Button[] btn = null;
 boolean[][] boo = new boolean[5][5];   //빙고판 체크여부를 확인을 위한 배열
 String[] name = { //배열 이름 설정
   "1","2","3","4","5",
   "6","7","8","9","10",
   "11","12","13","14","15",
   "16","17","18","19","20",
   "21","22","23","24","25"
   };

  Bingo(String title){
  super(title);	//Frame 클래스 생성자 호출
  
  setLayout(new GridLayout(5,5));	//awt 가로세로 5개식 생성  
  EventHandler handler = new EventHandler();
  addWindowListener(handler);
  
  btn = new Button[25];
 
  //Frame에 버튼을 추가
  for(int i = 0; i < 25; i++){
   btn[i] = new Button(name[i]);
   this.add(btn[i]);
   btn[i].addActionListener(handler);
  }
  
   setBounds(500,200,500,500);
   setVisible(true);
 }
 

 boolean checkBingo(){
  int bingoCnt = 0;//완성된 라인의 수
  int i,j;
  int crossCnt1 = 0; //대각선
  int corssCnt2 = 0; //역대각선
  for(i = 0; i <  5; i++){
   for(j = 0; j < 5; j++){//가로검사
      
     if( i==j && boo[i][j]==true){//대각선검사
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
 
 
 ////////////////////메인 함수/////////////////////
 public static void main(String[]args){
    new Bingo("Bingo Game");
 
 }
 
 
 class EventHandler extends WindowAdapter implements ActionListener {
  public void actionPerformed(ActionEvent ae) {//버튼 클릭스 actionPerformed 메서드 오버라이딩 하여 Event 핸들링
    
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