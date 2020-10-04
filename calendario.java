package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.GridBagConstraints;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class calendario extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
					calendario frame = new calendario();
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
	public calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 465);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), new Integer(2), new Integer(3), new Integer(4), new Integer(5), new Integer(6), new Integer(7)},
				{new Integer(8), new Integer(9), new Integer(10), new Integer(11), new Integer(12), new Integer(13), new Integer(14)},
				{new Integer(15), new Integer(16), new Integer(17), new Integer(18), new Integer(19), new Integer(20), new Integer(21)},
				{new Integer(22), new Integer(23), new Integer(24), new Integer(25), new Integer(26), new Integer(27), new Integer(28)},
				{new Integer(29), new Integer(30), new Integer(21), null, null, null, null},
			},
			new String[] {
				"", "", "", "", "", "", ""
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(0).setMinWidth(80);
		table.getColumnModel().getColumn(0).setMaxWidth(80);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setMinWidth(80);
		table.getColumnModel().getColumn(1).setMaxWidth(80);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.getColumnModel().getColumn(2).setMinWidth(80);
		table.getColumnModel().getColumn(2).setMaxWidth(80);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(80);
		table.getColumnModel().getColumn(3).setMinWidth(80);
		table.getColumnModel().getColumn(3).setMaxWidth(80);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(4).setMinWidth(80);
		table.getColumnModel().getColumn(4).setMaxWidth(80);
		table.getColumnModel().getColumn(5).setResizable(false);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setMinWidth(80);
		table.getColumnModel().getColumn(5).setMaxWidth(80);
		table.getColumnModel().getColumn(6).setResizable(false);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setMinWidth(80);
		table.getColumnModel().getColumn(6).setMaxWidth(80);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.weighty = 1.0;
		gbc_table.weightx = 1.0;
		gbc_table.gridx = 1;
		gbc_table.gridy = 1;
		contentPane.add(table, gbc_table);
	}

}
