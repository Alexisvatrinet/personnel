package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JLabel lbl_Pwd_AdminJFrm;
	private JTextField Jtxt_lbl_Pwd_AdminJFrm;
	private JButton btnValider_Jtxt_lbl_Pwd_AdminJFrm;
	private JTextField txtApplicationGestionDu;

	/**
	 * Launch the application. 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 304);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLbl_Pwd_AdminJFrm());
		contentPane.add(getJtxt_lbl_Pwd_AdminJFrm());
		contentPane.add(getBtnValider_Jtxt_lbl_Pwd_AdminJFrm());
		contentPane.add(getTxtApplicationGestionDu());
	}
	private JLabel getLbl_Pwd_AdminJFrm() {
		if (lbl_Pwd_AdminJFrm == null) {
			lbl_Pwd_AdminJFrm = new JLabel("Pwd_Admin");
			lbl_Pwd_AdminJFrm.setFont(new Font("Tahoma", Font.BOLD, 12));
			lbl_Pwd_AdminJFrm.setForeground(new Color(0, 0, 0));
			lbl_Pwd_AdminJFrm.setBounds(10, 90, 88, 21);
		}
		return lbl_Pwd_AdminJFrm;
	}
	private JTextField getJtxt_lbl_Pwd_AdminJFrm() {
		if (Jtxt_lbl_Pwd_AdminJFrm == null) {
			Jtxt_lbl_Pwd_AdminJFrm = new JTextField();
			Jtxt_lbl_Pwd_AdminJFrm.setHorizontalAlignment(SwingConstants.CENTER);
			Jtxt_lbl_Pwd_AdminJFrm.setText("Entrer le mot de passe admin");
			Jtxt_lbl_Pwd_AdminJFrm.setBounds(108, 90, 233, 23);
			Jtxt_lbl_Pwd_AdminJFrm.setColumns(10);
		}
		return Jtxt_lbl_Pwd_AdminJFrm;
	}
	private JButton getBtnValider_Jtxt_lbl_Pwd_AdminJFrm() {
		if (btnValider_Jtxt_lbl_Pwd_AdminJFrm == null) {
			btnValider_Jtxt_lbl_Pwd_AdminJFrm = new JButton("Valider");
			btnValider_Jtxt_lbl_Pwd_AdminJFrm.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnValider_Jtxt_lbl_Pwd_AdminJFrm.setBounds(108, 174, 89, 23);
		}
		return btnValider_Jtxt_lbl_Pwd_AdminJFrm;
	}
	private JTextField getTxtApplicationGestionDu() {
		if (txtApplicationGestionDu == null) {
			txtApplicationGestionDu = new JTextField();
			txtApplicationGestionDu.setForeground(SystemColor.textHighlight);
			txtApplicationGestionDu.setHorizontalAlignment(SwingConstants.CENTER);
			txtApplicationGestionDu.setFont(new Font("Arial Black", Font.PLAIN, 12));
			txtApplicationGestionDu.setText("Application Gestion du Personnels des Ligues");
			txtApplicationGestionDu.setBounds(108, 22, 330, 23);
			txtApplicationGestionDu.setColumns(10);
		}
		return txtApplicationGestionDu;
	}
}
