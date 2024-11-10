//design a screen in java to handel the mouse events such as mouse_moved and mouse_click and display the position of the mouse_click in a textFiled.

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame
{
      TextFild t,t,l;
      label l,ll;
      int x,y;
      Panel p;
      MyFrame(String title)
  { 
      super(title);
      setlayout(new Flowlayout());
           p=new panel();
           p.setlayout(new Gridlayout(2,2,5,5));
           t = new TextField(20);
           l = new lable ("Mouse Clicking");
           l1 = new label("Mouse Movement");
           t1 = new TextField(20);
           p.add(l);
           p.add(t);
           p.add(l1);
           p.add(t1);             
           add(p);
           addMouseListener(new MyClick());
           addMouseMotionListener(new MyMove());
                  setSize(500,500);
                  setVisible(true);
         }
         class MyClick extends MouseAdapter
              {

                  public void mouseClicked(MouseEvent me)
                    {
                           x=me.getX();
                           y=me.getY();
            t.setText("X="+x+ " Y="+y);
                }
        }
          class MyMove extends MousemotionAdapter
                {
                     public void mouseMoved(MouseEvenet me)
                      {
                        x=me.getX();
                        y=me.getY();
                 {
                             public static void main(String args[]){
                          MyFrame f = new MyFrame("Slip number 4");
                         

              }      

}                

  