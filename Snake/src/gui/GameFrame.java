package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GameFrame {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the application.
	 */
	
	JLabel NameLabel = new JLabel();

	
	public GameFrame() {
		initialize();
	}
	
	
	public void setLabelName(String x) {
		NameLabel.setText(x);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 665, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 30));
		panel.setBackground(new Color(204, 204, 204));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.add(NameLabel);
		
		
	}
	


}
