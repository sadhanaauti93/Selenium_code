package DilogBox;
import javax.swing.JOptionPane;
public class Perform 
{
	public void add() {
		String num1;
		String num2;
		int ans ;
		num1 = JOptionPane.showInputDialog(null, "Enter your number");
		num2 = JOptionPane.showInputDialog(null,"Enter onther number");
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, " Enter answer is " + result);
	}
	public void sub() {
		String num1;
		String num2;
		int ans ;
		num1 = JOptionPane.showInputDialog(null, "Enter your number");
		num2 = JOptionPane.showInputDialog(null,"Enter onther number");
		int result = Integer.parseInt(num1) - Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, " Enter answer is " + result);	
	}
	public void mul() {
		String num1;
		String num2;
		int ans ;
		num1 = JOptionPane.showInputDialog(null, "Enter your number");
		num2 = JOptionPane.showInputDialog(null,"Enter onther number");
		int result = Integer.parseInt(num1) * Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, " Enter answer is " + result);		
	}
	public void div() {
		String num1;
		String num2;
		int ans ;
		num1 = JOptionPane.showInputDialog(null, "Enter your number");
		num2 = JOptionPane.showInputDialog(null,"Enter onther number");
		int result = Integer.parseInt(num1) / Integer.parseInt(num2);
		JOptionPane.showMessageDialog(null, " Enter answer is " + result);	
	}
	public static void main(String[] args) {
		Perform obj = new Perform();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}
