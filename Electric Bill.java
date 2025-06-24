import java.awt.*;
import java.awt.event.*;
class Bill extends Frame implements ActionListener {
TextField t1, t2, t3, t4, t5, t6;
public static void main(String[] args) {
Bill f = new Bill();
f.setSize(600, 600);
f.setTitle("ELECTRICITY BILL");
f.setLayout(null);
f.setVisible(true);
}
Bill() {
this.setBackground(new Color(245, 245, 245));
Panel p1 = new Panel();
p1.setLayout(null);
p1.setBackground(Color.RED);
p1.setBounds(80, 30, 500, 100);
Label l1 = new Label("GOVERNMENT OF TAMILNADU");
Label l2 = new Label("TANGEDCO");
Font f1 = new Font("Arial", Font.BOLD, 26);
Font f2 = new Font("Arial", Font.BOLD, 25);
Font f3 = new Font("Arial", Font.BOLD, 24);
l1.setFont(f1);
l2.setFont(f2);
l1.setForeground(Color.pink);
l2.setForeground(Color.WHITE);
l1.setBounds(100, 40, 400, 30);
l2.setBounds(200, 70, 400, 30);
p1.add(l1);
p1.add(l2);
this.add(p1);
Panel p2 = new Panel();
p2.setLayout(null);
p2.setBackground(Color.blue);
p2.setBounds(80, 130, 500, 80);
Label l3 = new Label("ELECTRICITY BILL");
Font f4 = new Font("Arial", Font.BOLD, 24);
l3.setFont(f4);
l3.setBounds(200, 40, 200, 30);
p2.add(l3);
this.add(p2);
Label l11 = new Label("ENTER THE EB-NO:");
l11.setBounds(80, 220, 150, 25);
this.add(l11);
t1 = new TextField(20);
t1.setBounds(250, 220, 200, 25);
this.add(t1);
Label l12 = new Label("ENTER CUSTOMER NAME:");
l12.setBounds(80, 250, 150, 25);
this.add(l12);
t2 = new TextField(20);
t2.setBounds(250, 250, 200, 25);
this.add(t2);
Label l13 = new Label("ENTER PREVIOUS UNIT:");
l13.setBounds(80, 280, 150, 25);
this.add(l13);
t3 = new TextField(20);
t3.setBounds(250, 280, 200, 25);
this.add(t3);
Label l14 = new Label("ENTER CURRENT UNIT:");l14.setBounds(80, 310, 150, 25);
this.add(l14);
t4 = new TextField(20);
t4.setBounds(250, 310, 200, 25);
this.add(t4);
Label l15 = new Label("UNIT CONSUMED:");
l15.setBounds(80, 340, 150, 25);
this.add(l15);
t5 = new TextField(20);
t5.setBounds(250, 340, 200, 25);
this.add(t5);
Label l16 = new Label("TOTAL AMOUNT:");
l16.setBounds(80, 370, 150, 25);
this.add(l16);
t6 = new TextField(20);
t6.setBounds(250, 370, 200, 25);
this.add(t6);
Button b1 = new Button("SUBMIT");
b1.setBackground(Color.PINK);
b1.setBounds(300, 400, 100, 30);
this.add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
try {
int m1 = Integer.parseInt(t3.getText());  
int m2 = Integer.parseInt(t4.getText());  
int unit = m2 - m1;
int amount = unit * 5;
t5.setText(String.valueOf(unit));
t6.setText(String.valueOf(amount));
} catch (NumberFormatException e) {
t5.setText("Invalid input");
t6.setText("Check UNIT");
}
}
}
