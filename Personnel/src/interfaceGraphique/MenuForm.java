package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;

public class MenuForm extends JFrame {

	private JPanel contentPane;
	private JButton btnJFrmMenu_gerer_cpt_root;
	private JButton btnJFrmMenu_gerer_LesLigues;
	private JButton btnRetour_JfrmMenu_Gestion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuForm frame = new MenuForm();
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
	public MenuForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 321);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnJFrmMenu_gerer_cpt_root());
		contentPane.add(getBtnJFrmMenu_gerer_LesLigues());
		contentPane.add(getBtnRetour_JfrmMenu_Gestion());
	}

	private JButton getBtnJFrmMenu_gerer_cpt_root() {
		if (btnJFrmMenu_gerer_cpt_root == null) {
			btnJFrmMenu_gerer_cpt_root = new JButton("Gérer Le Compte root");
			btnJFrmMenu_gerer_cpt_root.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnJFrmMenu_gerer_cpt_root.setForeground(SystemColor.textHighlight);
			btnJFrmMenu_gerer_cpt_root.setBackground(SystemColor.activeCaption);
			btnJFrmMenu_gerer_cpt_root.setBounds(129, 40, 258, 43);
		}
		return btnJFrmMenu_gerer_cpt_root;
	}
	private JButton getBtnJFrmMenu_gerer_LesLigues() {
		if (btnJFrmMenu_gerer_LesLigues == null) {
			btnJFrmMenu_gerer_LesLigues = new JButton("Gérer Les Ligues");
			btnJFrmMenu_gerer_LesLigues.setBackground(SystemColor.activeCaption);
			btnJFrmMenu_gerer_LesLigues.setForeground(SystemColor.textHighlight);
			btnJFrmMenu_gerer_LesLigues.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnJFrmMenu_gerer_LesLigues.setBounds(129, 119, 258, 43);
		}
		return btnJFrmMenu_gerer_LesLigues;
	}
	private JButton getBtnRetour_JfrmMenu_Gestion() {
		if (btnRetour_JfrmMenu_Gestion == null) {
			btnRetour_JfrmMenu_Gestion = new JButton("Retour ");
			btnRetour_JfrmMenu_Gestion.setBackground(SystemColor.activeCaption);
			btnRetour_JfrmMenu_Gestion.setForeground(SystemColor.textHighlight);
			btnRetour_JfrmMenu_Gestion.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnRetour_JfrmMenu_Gestion.setBounds(129, 193, 258, 43);
		}
		return btnRetour_JfrmMenu_Gestion;
	}
}
