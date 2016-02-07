import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rider1 extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton b1, b2;
JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
JTextField t1, t2, t3, t4,t5,t6;
String i;
String k;
String i1;
String k1;
String i2;
String k2;
String a, b, c, d, y, f;
ghbdzprf handler = new ghbdzprf();


public Rider1(String s){
	super(s);
	setLayout(new FlowLayout());
	b1 = new JButton("ОЧИСТИТЬ");
	b2 = new JButton("ВНЕСТИ");
	l1 = new JLabel("Полных лет");
	l2 = new JLabel("Город");
	l3 = new JLabel("Фамилия");
	l4 = new JLabel("Имя ");
	l5 = new JLabel("Отчество");
	l6 = new JLabel("Телефон ");
	l7 = new JLabel("");
	l8 = new JLabel("");
	l9 = new JLabel("");
	l10 = new JLabel("");
	l11 = new JLabel("");
	l12 = new JLabel("");
	t1 = new JTextField(2);
	t2 = new JTextField(9);
	t3 = new JTextField(8);
	t4 = new JTextField(8);
	t5 = new JTextField(8);
	t6 = new JTextField(8);
	add(b1);
	add(b2);
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(l4);
	add(t4);
	add(l5);
	add(t5);
	add(l6);
	add(t6);
	add(l7);
	add(l8);
	add(l9);
	add(l10);
	add(l11);
	add(l12);
	b2.addActionListener(handler);
	b1.addActionListener(handler);
}
public class ghbdzprf implements ActionListener{
		public void actionPerformed(ActionEvent e) {
	
		
		if(e.getSource()==b2){	
		i = (t1.getText());
		k = (t2.getText());
		i1 = (t3.getText());
		k1 = (t4.getText());
		i2 = (t5.getText());
		k2 = (t6.getText());
		
		a = "Возраст  " + i;
		b = "г." + k;
		c = "Ф.И.О. " + i1;
		d = "" + k1;
		y = "" + i2;
		f = "тел." + k2;
		l7.setText(a);
		l8.setText(b);
		l9.setText(c);
		l10.setText(d);
		l11.setText(y);
		l12.setText(f);
		
	}
	if(e.getSource()==b1){
	t1.setText("");
	t2.setText("");
	t3.setText("");
	t4.setText("");
	t5.setText("");
	t6.setText("");
	l7.setText("");
	l8.setText("");
	l9.setText("");
	l10.setText("");
	l11.setText("");
	l12.setText("");
	}
	
	}}}