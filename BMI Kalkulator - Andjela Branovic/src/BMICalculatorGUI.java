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
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.UIManager;


public class BMICalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblEnterYourHeight;
	private JLabel lblEnterYourWeight;
	private JTextField txtheight;
	private JTextField txtweight;
	private JButton btnGo;
	private JTextField txtbmi;
	private JTextField txtTypeBmi;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel lblGojaznost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalculatorGUI frame = new BMICalculatorGUI();
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
	public BMICalculatorGUI() {
		setResizable(false);
		setForeground(Color.WHITE);
		setTitle("Calculate your BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 357);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblEnterYourHeight());
		contentPane.add(getLblEnterYourWeight());
		contentPane.add(getTxtheight());
		contentPane.add(getTxtweight());
		contentPane.add(getBtnGo());
		contentPane.add(getTxtbmi());
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getLblGojaznost());
		
	}
	private JLabel getLblEnterYourHeight() {
		if (lblEnterYourHeight == null) {
			lblEnterYourHeight = new JLabel("Enter your height (in cm):");
			lblEnterYourHeight.setBounds(22, 40, 179, 14);
		}
		return lblEnterYourHeight;
	}
	private JLabel getLblEnterYourWeight() {
		if (lblEnterYourWeight == null) {
			lblEnterYourWeight = new JLabel("Enter your weight (in kg):");
			lblEnterYourWeight.setBounds(22, 65, 179, 14);
		}
		return lblEnterYourWeight;
	}
	private JTextField getTxtheight() {
		if (txtheight == null) {
			txtheight = new JTextField();
			txtheight.setBounds(194, 37, 98, 20);
			txtheight.setColumns(10);
		}
		return txtheight;
	}
	private JTextField getTxtweight() {
		if (txtweight == null) {
			txtweight = new JTextField();
			txtweight.setColumns(10);
			txtweight.setBounds(194, 62, 98, 20);
		}
		return txtweight;
	}
	private JButton getBtnGo() {
		if (btnGo == null) {
			btnGo = new JButton("Calculate");
			btnGo.setForeground(Color.BLACK);
			btnGo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					BMICalculator b = new BMICalculator();
					double height = Double.parseDouble(txtheight.getText());
					double weight = Double.parseDouble(txtweight.getText());
					double bmi = b.findBMI(height, weight);
					txtbmi.setText(""+bmi);
				}
			});
			btnGo.setBounds(112, 114, 89, 23);
		}
		return btnGo;
	}
	private JTextField getTxtbmi() {
		if (txtbmi == null) {
			txtbmi = new JTextField();
			txtbmi.setBounds(41, 156, 221, 20);
			txtbmi.setColumns(10);
		}
		return txtbmi;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("< 18.5   underweight");
			label.setBounds(88, 187, 174, 14);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("18.5 - 24.9\t   normal");
			label_1.setBounds(67, 212, 197, 14);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("25 - 29.9   overweight");
			label_2.setBounds(77, 237, 212, 14);
		}
		return label_2;
	}
	private JLabel getLblGojaznost() {
		if (lblGojaznost == null) {
			lblGojaznost = new JLabel("> 30    obese");
			lblGojaznost.setBounds(94, 261, 158, 14);
		}
		return lblGojaznost;
	}
}
