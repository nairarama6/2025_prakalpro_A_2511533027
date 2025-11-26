package PEKAN8_2511533027;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		setTitle("OperatorAritmatika ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operator Aritmatika");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(45, 11, 346, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 51, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(10, 74, 71, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 123, 71, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(10, 169, 71, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setBackground(new Color(64, 128, 128));
		txtBil1.setForeground(new Color(0, 0, 0));
		txtBil1.setBounds(140, 48, 84, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setForeground(Color.BLACK);
		txtBil2.setColumns(10);
		txtBil2.setBackground(new Color(64, 128, 128));
		txtBil2.setBounds(140, 71, 84, 20);
		contentPane.add(txtBil2);
				
		txtHasil = new JTextField();
		txtHasil.setBackground(new Color(255, 255, 255));
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEditable(false);
		txtHasil.setBounds(140, 166, 84, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox<String> cbOperator = new JComboBox<>();
		cbOperator.setModel(new DefaultComboBoxModel<String>(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBackground(new Color(64, 128, 128));
		cbOperator.setBounds(140, 120, 84, 22);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				}else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diinput");
				}else {
					try {
				int a= Integer.valueOf(txtBil1.getText());
				int b= Integer.valueOf(txtBil2.getText());
				int c= cbOperator.getSelectedIndex();
				if (c==0) {hasil= a+b;}
				if (c==1) {hasil= a-b;}
				if (c==2) {hasil= a*b;}
				if (c==3) {hasil= a/b;}
				if (c==4) {hasil= a%b;}
				txtHasil.setText(String.valueOf(hasil));
			}catch (NumberFormatException ex) {
				pesanError("Bilangan 1 dan Bilangan 2 harus angka!");
			}
		}
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(266, 120, 94, 22);
		contentPane.add(btnNewButton);
		
	}
}
