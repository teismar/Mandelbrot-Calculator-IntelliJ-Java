import java.awt.event.*;
import javax.swing.*;

public class ButtonTest {

	public static void main(String[] args) {
		JFrame f = new JFrame("ButtonTest");
		ImageIcon img = new ImageIcon("C:\\Users\\eisma\\OneDrive - Wirteltor Gymnasium\\Projektkurs-PH-IF\\Eclipse-Workspace\\Mandel\\src\\res\\unnamed.gif");
		f.setIconImage(img.getImage());
		JSlider s = new JSlider();
		
		final JTextField tf = new JTextField("Test");
		tf.setBounds(50, 50, 250, 50);
		JButton b = new JButton("Tes");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.out.println(tf.getText());
			}
		
		
		
		});
		f.add(b);
		f.add(tf);
		f.add(s);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

}
