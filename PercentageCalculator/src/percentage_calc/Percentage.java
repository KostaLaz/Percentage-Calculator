package percentage_calc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Percentage extends JFrame {

	private JPanel contentPane;
	private JTextField txtField1;
	private JTextField txtField2;
	private JTextField txtField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Percentage frame = new Percentage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Percentage() {
		setTitle("Percentage Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtLb1 = new JLabel("What is");
		txtLb1.setBounds(49, 92, 46, 14);
		contentPane.add(txtLb1);
		
		txtField1 = new JTextField();
		txtField1.setBounds(124, 89, 86, 20);
		contentPane.add(txtField1);
		txtField1.setColumns(10);
		
		JLabel txtLb2 = new JLabel("% of");
		txtLb2.setBounds(254, 92, 46, 14);
		contentPane.add(txtLb2);
		
		txtField2 = new JTextField();
		txtField2.setBounds(310, 89, 86, 20);
		contentPane.add(txtField2);
		txtField2.setColumns(10);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float num1, num2, resoult;
				num1 = Float.parseFloat(txtField1.getText());
				num2 = Float.parseFloat(txtField2.getText());
				resoult = (num2 / 100) * num1;
				txtField3.setText(String.valueOf(resoult));
			}
		});
		Calculate.setBounds(124, 143, 89, 23);
		contentPane.add(Calculate);
		
		txtField3 = new JTextField();
		txtField3.setBounds(310, 144, 86, 20);
		contentPane.add(txtField3);
		txtField3.setColumns(10);
		
		JButton Clear = new JButton("Clear");
		Clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtField1.setText("");
				txtField2.setText("");
				txtField3.setText("");
			}
		});
		Clear.setBounds(124, 197, 89, 23);
		contentPane.add(Clear);
		
		JButton Exit = new JButton("Exit");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		Exit.setBounds(310, 197, 89, 23);
		contentPane.add(Exit);
	}
}
