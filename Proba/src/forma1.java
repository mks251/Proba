
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

	public class forma1 {
		
		int a, b, c, d, e, f;
		
		String n1, n2, n3, n4, n5, n6;
		public void Scan(){
		n1 = JOptionPane.showInputDialog("Сколько вам лет");
		n2 = JOptionPane.showInputDialog("Ваш город");
		n3 = JOptionPane.showInputDialog("Ваша фамилия");
		n4 = JOptionPane.showInputDialog("Ваше имя");
		n5 = JOptionPane.showInputDialog("Ваше отчество");
		n6 = JOptionPane.showInputDialog("Телефон");
		a = Integer.parseInt(n1);
		b = Integer.parseInt(n2);
		c = Integer.parseInt(n3);
		d = Integer.parseInt(n4);
		e = Integer.parseInt(n5);
		f = Integer.parseInt(n6);
		
	}
		
			
					
			public void Scan(int a, int b, int c, int d, int e, int f){
				JOptionPane.showMessageDialog(null,"Возраст: = " + a);
				JOptionPane.showMessageDialog(null,"Город: = " + b);
				JOptionPane.showMessageDialog(null,"Фамилия: = " + c);
				JOptionPane.showMessageDialog(null,"Имя: = " + d);
				JOptionPane.showMessageDialog(null,"Отчество: = " + e);
				JOptionPane.showMessageDialog(null,"Тел: = " + f);
			}
		}


		

					
		
	
	

