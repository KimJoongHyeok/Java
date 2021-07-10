import java.awt.*; //awt컴포넌트 사용하기 위해 추가
// 프레임은 컨테이너이고 기본 레이아웃은 보더레이아웃임(독립적인 컨테이너라고 함)
public class Test {

   public static void main(String[] args) {
      Frame f = new Frame("프레임 제목입니다"); //프레임 객체 생성      
      Button b = new Button("ok버튼"); //버튼 객체 생성
      Button b2 = new Button("ok2버튼"); //버튼 객체 생성
      Choice day = new Choice(); //초이스 객체 생성      
      
      f.setLayout(null); //프레임 레이아웃 사용 안함(직접 좌표로 작성)
      
      /////////////버튼 b 컨포넌트 설정////////////////
      b.setBounds(100,100,200,100); //버튼 시작위치, 높이 설정
      b.setBackground(Color.red);
      b.setForeground(Color.yellow);
      
      /////////////버튼 b2 컨포넌트 설정////////////////
      b2.setBounds(400,100,100,50); //버튼 시작위치, 높이 설정      
      b2.setBackground(Color.red);      
      b2.setForeground(Color.yellow);
      
      /////////////choice 목록 추가////////////////
      day.add("일");
      day.add("월");
      day.add("화");
      day.add("수");
      day.add("목");
      day.add("금");
      day.add("토");
   
      day.setBounds(100,300,100,70);
   
      
      //f.setSize(300, 200); //프레임 가로,세로 사이즈 설정
      //f.setLocation(500, 500); //프레임 시작 위치(x,y)좌표 설정
      f.setBounds(500, 200, 600, 400); //위의 두줄과 같음      
      f.setBackground(Color.black); //프레임 배경색 설정
      
      
      /////////////프레임 컨테이너 붙임////////////////
      f.add(b); //프레임 컨테이너에 버튼 컨포넌트를 붙임
      f.add(b2);
      f.add(day);
      
      f.setVisible(true); //프레임 보이기
      
   }

}