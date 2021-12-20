import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Currency.class" width=650 height=600></applet>*/
public class Currency extends Applet implements ActionListener
{
TextField t1=new TextField(10);
TextField t2=new TextField(10);
TextField t3=new TextField(10);
TextField t4=new TextField(10);
Label l1=new Label("INR");
Label l2=new Label("DOLLAR");
Label l3=new Label("POUND");
Label l4=new Label("YUAN");
Button b1= new Button("INR");
Button b2= new Button("DOLLAR");
Button b3= new Button("POUND");
Button b4= new Button("YUAN");
//Button b5= new Button("Exit");
Button b6= new Button("Reset");
public void init()
{
add(l1);add(t1);
add(l2);add(t2);
add(l3);add(t3);
add(l4);add(t4);
add(b1);
add(b2);
add(b3);
add(b4);

add(b6);
b1.addActionListener(this);

b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

b6.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
int n1=Integer.parseInt(t1.getText());
t2.setText(""+(n1*0.013));
t3.setText(""+(n1*0.0099));
t4.setText(""+(n1*0.084));
}
if(ae.getSource()==b2)
{
int n1=Integer.parseInt(t2.getText());
t1.setText(""+(n1*76.09));
t3.setText(""+(n1*0.76));
t4.setText(""+(n1*6.38));
}
if(ae.getSource()==b3)
{
int n1=Integer.parseInt(t3.getText());
t1.setText(""+(n1*100.64));
t2.setText(""+(n1*1.32));
t4.setText(""+(n1*8.44));
}
if(ae.getSource()==b4)
{
int n1=Integer.parseInt(t4.getText());
t1.setText(""+(n1*11.93));
t2.setText(""+(n1*0.16));
t3.setText(""+(n1*0.012));
}

if(ae.getSource()==b6)
{
t1.setText(""+0);
t2.setText(""+0);
t3.setText(""+0);
t4.setText(""+0);
}

}

}




