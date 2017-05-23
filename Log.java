import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import java.awt.List;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JScrollPane;

public class Log extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterKeywordHere;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnLogOut = new JButton("Logout");
		btnLogOut.setBounds(544, 11, 90, 23);
		btnLogOut.setBackground(new Color(255, 204, 51));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnLogOut);
		
		JLabel lblKeyword = new JLabel("Keyword:");
		lblKeyword.setBounds(37, 84, 46, 14);
		contentPane.add(lblKeyword);
		
		txtEnterKeywordHere = new JTextField();
		txtEnterKeywordHere.setToolTipText("Enter Keyword Here");
		txtEnterKeywordHere.setBackground(UIManager.getColor("menu"));
		txtEnterKeywordHere.setBounds(87, 81, 249, 20);
		contentPane.add(txtEnterKeywordHere);
		txtEnterKeywordHere.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(343, 80, 65, 23);
		contentPane.add(btnSearch);
		
		JLabel lblSort = new JLabel("Sort:");
		lblSort.setBounds(434, 84, 24, 14);
		contentPane.add(lblSort);
		
		JComboBox sortChoice = new JComboBox();
		sortChoice.setModel(new DefaultComboBoxModel(new String[] {"By Time <Ascending>", "By Time <Descending>", "By Date <Ascending>", "By Date <Desceding>", "By Level <Ascending>", "By Level <Descending>"}));
		sortChoice.setBounds(462, 81, 160, 20);
		contentPane.add(sortChoice);
		
		JLabel lblNewLabel = new JLabel("LOG INFORMATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(44, 131, 125, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFilePath = new JLabel("File Path:");
		lblFilePath.setBounds(54, 156, 46, 14);
		contentPane.add(lblFilePath);
		
		textField_1 = new JTextField();
		textField_1.setBackground(UIManager.getColor("menu"));
		textField_1.setBounds(103, 153, 506, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblRefreshEvery = new JLabel("Refresh every:");
		lblRefreshEvery.setBounds(41, 450, 82, 14);
		contentPane.add(lblRefreshEvery);
		
		JComboBox refreshTime = new JComboBox();
		refreshTime.setModel(new DefaultComboBoxModel(new String[] {"30 Seconds", "1 minute", "5 minutes", "10 minutes"}));
		refreshTime.setBounds(128, 447, 100, 20);
		contentPane.add(refreshTime);
		
		JButton btnAll = new JButton("All");
		btnAll.setHorizontalAlignment(SwingConstants.LEFT);
		btnAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAll.setBounds(37, 222, 89, 23);
		contentPane.add(btnAll);
		
		JButton btnTrace = new JButton("Trace");
		btnTrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrace.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrace.setBounds(37, 247, 89, 23);
		contentPane.add(btnTrace);
		
		JButton btnDebug = new JButton("Debug");
		btnDebug.setHorizontalAlignment(SwingConstants.LEFT);
		btnDebug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDebug.setBounds(37, 272, 89, 23);
		contentPane.add(btnDebug);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setHorizontalAlignment(SwingConstants.LEFT);
		btnInfo.setBounds(37, 297, 89, 23);
		contentPane.add(btnInfo);
		
		JButton btnWarn = new JButton("Warn");
		btnWarn.setHorizontalAlignment(SwingConstants.LEFT);
		btnWarn.setBounds(37, 322, 89, 23);
		contentPane.add(btnWarn);
		
		JButton btnError = new JButton("Error");
		btnError.setHorizontalAlignment(SwingConstants.LEFT);
		btnError.setBounds(37, 346, 89, 23);
		contentPane.add(btnError);
		
		JButton btnFatal = new JButton("Fatal");
		btnFatal.setHorizontalAlignment(SwingConstants.LEFT);
		btnFatal.setBounds(37, 370, 89, 23);
		contentPane.add(btnFatal);
		
		JButton btnOff = new JButton("Off");
		btnOff.setHorizontalAlignment(SwingConstants.LEFT);
		btnOff.setBounds(37, 395, 89, 23);
		contentPane.add(btnOff);
		
		JLabel lblNewLabel_1 = new JLabel("Levels");
		lblNewLabel_1.setBackground(SystemColor.controlDkShadow);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(37, 204, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(SystemColor.textInactiveText);
		scrollBar.setBounds(605, 204, 17, 232);
		contentPane.add(scrollBar);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.activeCaptionBorder);
		editorPane.setBounds(147, 204, 474, 232);
		contentPane.add(editorPane);
		
		JButton btnImport = new JButton("Import");
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImport.setBounds(474, 127, 65, 23);
		contentPane.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBounds(544, 127, 65, 23);
		contentPane.add(btnExport);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.text);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(32, 123, 589, 59);
		contentPane.add(panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 33, 624, 443);
		contentPane.add(tabbedPane);
		
		JTabbedPane ISOConfigurations = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("ISO Configurations", null, ISOConfigurations, null);
		
		JTabbedPane MonitoringApplicatin = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Monitoring Application", null, MonitoringApplicatin, null);
				
		JTabbedPane Settings = new JTabbedPane(JTabbedPane.TOP);
		Settings.setEnabled(true);
				tabbedPane.addTab("Settings", null, Settings, null);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnLogOut, lblKeyword, txtEnterKeywordHere, btnSearch, lblSort, sortChoice, lblNewLabel, lblFilePath, textField_1, lblRefreshEvery, refreshTime, btnAll, btnTrace, btnDebug, btnInfo, btnWarn, btnError, btnFatal, btnOff, lblNewLabel_1, scrollBar, editorPane, btnImport, btnExport, panel}));
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
	protected JTable getDisplay() {
		return Display;
	}
}
