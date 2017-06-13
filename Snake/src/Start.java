import java.awt.EventQueue;

import javax.swing.JFrame;

import gui.StartGui;

public class Start {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGui window = new StartGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
