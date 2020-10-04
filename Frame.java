package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JDesktopPane;

public class Frame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btncadastro;
	private JButton btnCalendar;
	private JButton btnMgmt;
	private JButton btnSair;
	private JButton btnOrganograma;
	
	calendario janelacalendar = new calendario();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Configurando LookandFeel para Nimbus
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
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}//Fim configura��o Nimbus

	/**
	 * Create the frame.
	 */
	public Frame()
	{//Criando Bot�es da tela principal
		setResizable(false);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btncadastro = new JButton("Cadastrar");
		btncadastro.addActionListener(this);
		btncadastro.setBounds(0, 100, 200, 50);
		contentPane.add(btncadastro);
		
		btnCalendar = new JButton("Calendario");
		btnCalendar.addActionListener(this);
		btnCalendar.setBounds(0, 146, 200, 50);
		contentPane.add(btnCalendar);
		
		btnMgmt = new JButton("Gerenciamento");
		btnMgmt.setBounds(0, 192, 200, 50);
		contentPane.add(btnMgmt);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(0, 495, 200, 50);
		contentPane.add(btnSair);
		
		btnOrganograma = new JButton("Organograma");
		btnOrganograma.setBackground(new Color(255, 255, 255));
		btnOrganograma.setBounds(0, 238, 200, 50);
		contentPane.add(btnOrganograma);
	}//Fim bot�es da tela principal
	
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnCalendar) {
			do_btnCalendar_actionPerformed(e);
		}
		if (e.getSource() == btncadastro) {
			do_btncadastro_actionPerformed(e);
		}
	}
	protected void do_btncadastro_actionPerformed(ActionEvent e)
	{
		
	}
	
	
	
	protected void do_btnCalendar_actionPerformed(ActionEvent e)
	{//Navega��o para calendario
		if(janelacalendar == null)
		{
			janelacalendar = new calendario();
			janelacalendar.setLocationRelativeTo(null);
			janelacalendar.setVisible(true);
			janelacalendar.setResizable(false);
		}else
		{
			janelacalendar.setLocationRelativeTo(null);
			janelacalendar.setVisible(true);
			janelacalendar.setResizable(false);
		}
	}
}
