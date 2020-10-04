package Interface;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.UIManager;
import javax.swing.JButton;

public class FrameInterno extends JInternalFrame {
	private JPanel panel;
	private JPanel panel_1;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JButton btnConectar;
	private JLabel lblSemregistro;
	private JLabel lblCadastre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	        	System.err.println(ex);
	        } catch (InstantiationException ex) {
	        	System.err.println(ex);
	        } catch (IllegalAccessException ex) {
	        	System.err.println(ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		 
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameInterno frame = new FrameInterno();
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
	public FrameInterno() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setClosable(true);
		setTitle("Login");
		setBounds(100, 100, 600, 454);
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(UIManager.getBorder("Button.border"));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(92, 80, 400, 300);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setForeground(Color.GRAY);
		txtNome.setHorizontalAlignment(SwingConstants.CENTER);
		txtNome.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
		txtNome.setBackground(Color.LIGHT_GRAY);
		txtNome.setBounds(50, 15, 300, 50);
		txtNome.setText("Nome");
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setForeground(Color.GRAY);
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		txtSenha.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
		txtSenha.setBackground(Color.LIGHT_GRAY);
		txtSenha.setBounds(50, 75, 300, 50);
		txtSenha.setText("Senha");
		panel.add(txtSenha);
		txtSenha.setColumns(10);
		
		btnConectar = new JButton("Conectar");
		//Removendo configura��o do LookAndFeel
		btnConectar.setContentAreaFilled(false);
		btnConectar.setOpaque(true);
		btnConectar.setBackground(Color.ORANGE);
		//Fim remo��o LookAndFeel
		
		//Set automatico do eclipse
		btnConectar.setFont(new Font("Lato Heavy", Font.PLAIN, 25));
		btnConectar.setForeground(new Color(255, 255, 255));
		btnConectar.setBackground(new Color(255, 102, 0));
		btnConectar.setBounds(50, 136, 300, 50);
		panel.add(btnConectar);
		
		lblSemregistro = new JLabel("Sem registro?");
		lblSemregistro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSemregistro.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
		lblSemregistro.setBounds(50, 197, 150, 50);
		panel.add(lblSemregistro);
		
		lblCadastre = new JLabel("  Cadastre-se");
		lblCadastre.setForeground(new Color(255, 102, 0));
		lblCadastre.setFont(new Font("Lato Heavy", Font.PLAIN, 15));
		lblCadastre.setBounds(200, 197, 150, 50);
		panel.add(lblCadastre);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 102, 0));
		panel_1.setBounds(0, 0, 585, 421);
		getContentPane().add(panel_1);

	}
}
