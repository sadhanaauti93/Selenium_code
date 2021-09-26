package DilogBox;
import javax.swing.JOptionPane;
public class Basicofbox {
	public void message() {
		JOptionPane.showMessageDialog(null, "See your output in console");
	}
	public static void main(String[] args) {  
		Basicofbox obj = new Basicofbox();
		obj.message();
	}
}
