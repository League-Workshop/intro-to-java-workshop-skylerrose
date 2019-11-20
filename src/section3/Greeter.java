package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello");
	String name =JOptionPane.showInputDialog("Who are you?");
	JOptionPane.showMessageDialog(null, "Hello" + name);
}
}
