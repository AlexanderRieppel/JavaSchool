package Observer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Erstellt ein kleines GUI mit einem Button. Bei Drücken des Buttons wird die
 * Zeit ausgegeben
 * 
 * @author Rieppel Alexander
 */
public class Frame {
	JFrame frame;
	Timer t = new Timer();

	public static void main(String[] args) {
		Frame example = new Frame();
		example.go();
	}

	/**
	 * Erstellt das GUI
	 */
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Get Time!");
		button.addActionListener(new ActionHandler());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	/**
	 * Listener für den Button. Für Ausgabe der Zeit zuständig
	 */
	class ActionHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.println(t.getCurrent());
		}
	}
}
