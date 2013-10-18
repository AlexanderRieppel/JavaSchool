package test;

import javax.swing.JOptionPane;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0;i<args.length;i++){
			JOptionPane.showMessageDialog(null, args[i],"Error",JOptionPane.ERROR_MESSAGE);
		}
	}

}
