import java.awt.*; // 컨포넌트 사용 위해
import java.awt.event.*; // 이벤트 처리 위해
public class CheckboxEventTest2 extends Frame{

       CheckboxGroup group;
       Checkbox cb1;
       Checkbox cb2;
       Checkbox cb3;
       
       CheckboxEventTest2(String title){
          super(title);
          group = new CheckboxGroup();
          cb1 = new Checkbox("red",group,true);
          cb2 = new Checkbox("green",group,false);
          cb3 = new Checkbox("blue",group,false);
          
          cb1.addItemListener(new EventHandler());
          cb2.addItemListener(new EventHandler());
          cb3.addItemListener(new EventHandler());
          
          setLayout(new FlowLayout());
          add(cb1);
          add(cb2);
          add(cb3);
          
          setBackground(Color.red);
          setSize(300,200);
          setVisible(true);
          
          addWindowListener(new WindowAdapter() { //닫기버튼
               public void windowClosing(WindowEvent e) {       
                dispose(); //메모리에서 해제(현재 프레임만 닫힘)
               }
              });
  
       }
   
//public static void main(String[] args) {
   //CheckboxEventTest2 mainWin = new CheckboxEventTest2("CheckboxEventTest2");
//}

class EventHandler implements ItemListener{
   public void itemStateChanged(ItemEvent e) {
      Checkbox cb = (Checkbox)e.getSource();
      String color = cb.getLabel();
      
      if(color.equals("red")) {
         setBackground(Color.red);
         cb1.setBackground(Color.red);
         cb2.setBackground(Color.red);
         cb3.setBackground(Color.red);
         
      } else if (color.equals("green")) {
         setBackground(Color.green);
         cb1.setBackground(Color.green);
         cb2.setBackground(Color.green);
         cb3.setBackground(Color.green);
      } else {
         setBackground(Color.blue);
         cb1.setBackground(Color.blue);
         cb2.setBackground(Color.blue);
         cb3.setBackground(Color.blue);
      }
   }
}
}