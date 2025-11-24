package PEKAN8_2511533027;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533027 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
		}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533027 frame = new OperatorAritmatikaGUI_2511533027();
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
	public OperatorAritmatikaGUI_2511533027() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(152, 11, 164, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBilangan.setBounds(10, 49, 75, 14);
		contentPane.add(lblBilangan);
		
		JLabel lblBilangan_2 = new JLabel("Bilangan 2");
		lblBilangan_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBilangan_2.setBounds(10, 82, 75, 14);
		contentPane.add(lblBilangan_2);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOperator.setBounds(10, 119, 75, 14);
		contentPane.add(lblOperator);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblHasil.setBounds(10, 157, 75, 14);
		contentPane.add(lblHasil);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(129, 47, 96, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(129, 80, 96, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(129, 116, 96, 22);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setBackground(new Color(255, 255, 255));
		txtHasil.setEditable(false);
		txtHasil.setBounds(129, 155, 96, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton Proses = new JButton("Proses");
		Proses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Proses.setBounds(284, 116, 89, 23);
		contentPane.add(Proses);

	}
}
