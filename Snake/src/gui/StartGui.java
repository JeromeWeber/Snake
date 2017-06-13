package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGui implements ActionListener {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public StartGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(173, 165, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblSnake = new JLabel("Snake");
		lblSnake.setFont(new Font("Arial", Font.BOLD, 30));
		lblSnake.setForeground(Color.LIGHT_GRAY);
		lblSnake.setBackground(Color.LIGHT_GRAY);
		lblSnake.setBounds(195, 94, 91, 26);
		frame.getContentPane().add(lblSnake);
		
		JButton btnGo = new JButton("GO!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameFrame window = new GameFrame();
				window.setLabelName(textField.getText());
				window.frame.setVisible(true);
			}
		});
		btnGo.setBackground(new Color(255, 102, 0));
		btnGo.setForeground(new Color(255, 102, 0));
		btnGo.setFont(new Font("Arial", Font.BOLD, 18));
		btnGo.setBounds(186, 214, 117, 29);
		frame.getContentPane().add(btnGo);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
