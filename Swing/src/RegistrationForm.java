import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegistrationForm {

	public static void main(String[] args) {
		
		JFrame j1 = new JFrame();
		j1.setSize(500, 700);
		j1.setLayout(null);
		j1.setTitle("Registration Form");
		j1.setVisible(true);
		
		JLabel l1 = new JLabel("REGISTERATION");
		l1.setBounds(150, 50, 100, 20);
		
		JLabel l2 = new JLabel("First Name");
		l2.setBounds(100, 100, 200 , 20);
		
		JTextField f1 = new JTextField();
		f1.setBounds(200, 100, 200, 20);
		
		JLabel l3 = new JLabel("Email");
		l3.setBounds(100, 130, 200, 20);
		JTextField f2 = new JTextField();
		f2.setBounds(200, 130, 200, 20);
		
		JLabel l4 = new JLabel("Password");
		l4.setBounds(100, 160, 200, 20);
		JPasswordField f3 = new JPasswordField();
		f3.setBounds(200, 160, 200, 20);
		
		JLabel l5 = new JLabel("Gender");
		l5.setBounds(100, 190, 100, 20);
		JRadioButton b1 = new JRadioButton("Male");
		JRadioButton b2 = new JRadioButton("FeMale");
		b1.setBounds(200,190,100,20);
		b2.setBounds(300,190,100,20);
		ButtonGroup group = new ButtonGroup();
		group.add(b1);
		group.add(b2);

		JLabel l6 = new JLabel("Languages");
		l6.setBounds(100, 220, 100, 20);
		JCheckBox ch1 = new JCheckBox("Guj");
		JCheckBox ch2 = new JCheckBox("Hin");
		JCheckBox ch3 = new JCheckBox("Eng");
		JCheckBox ch4 = new JCheckBox("San");
		ch1.setBounds(200, 220, 100, 20);
		ch2.setBounds(300, 220, 100, 20);
		ch3.setBounds(200, 250, 100, 20);
		ch4.setBounds(300, 250, 100, 20);
		
		JLabel l7  = new JLabel("Country");
		l7.setBounds(100, 280, 100, 20);
		
		String country[]={"India","USA","UK"}; 
		JList<String> count=new JList<String>(country);
		count.setBounds(200, 280, 200, 50);
		
		JLabel l8 = new JLabel("Address");
		l8.setBounds(100, 350, 200, 20);
		JTextArea t1 = new JTextArea();
		t1.setBounds(200, 350, 200, 40);
		
		JButton submit = new JButton("SUBMIT");
		submit.setBounds(100, 450, 300, 20);
		
		
		j1.add(l1);
		j1.add(l2);
		j1.add(l3);
		j1.add(l4);
		j1.add(l5);
		j1.add(l6);
		j1.add(l7);
		j1.add(l8);
		j1.add(b1);
		j1.add(b2);
		j1.add(f1);
		j1.add(f2);
		j1.add(f3);
		j1.add(ch1);
		j1.add(ch2);
		j1.add(ch3);
		j1.add(ch4);
		j1.add(count);
		j1.add(t1);
		j1.add(submit);
		
	}
}
