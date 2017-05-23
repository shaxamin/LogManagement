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
import javax.swing.JFileChooser;

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
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setResizable(false);
		setType(Type.POPUP);
		setTitle("Log Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(544, 11, 90, 23);
		btnLogin.setBackground(new Color(255, 204, 51));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnLogin);
		
		JLabel lblKeyword = new JLabel("Keyword:");
		lblKeyword.setBounds(37, 84, 65, 14);
		contentPane.add(lblKeyword);
		
		txtEnterKeywordHere = new JTextField();
		txtEnterKeywordHere.setToolTipText("Enter Keyword Here");
		txtEnterKeywordHere.setBackground(UIManager.getColor("menu"));
		txtEnterKeywordHere.setBounds(94, 81, 213, 20);
		contentPane.add(txtEnterKeywordHere);
		txtEnterKeywordHere.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(325, 80, 81, 23);
		contentPane.add(btnSearch);
		
		JLabel lblSort = new JLabel("Sort:");
		lblSort.setBounds(416, 84, 42, 14);
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
		lblFilePath.setBounds(54, 156, 71, 14);
		contentPane.add(lblFilePath);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBackground(UIManager.getColor("menu"));
		textField_1.setBounds(128, 153, 481, 20);
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
		btnAll.setBounds(42, 226, 89, 23);
		contentPane.add(btnAll);
		
		JButton btnTrace = new JButton("Trace");
		btnTrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrace.setHorizontalAlignment(SwingConstants.LEFT);
		btnTrace.setBounds(42, 251, 89, 23);
		contentPane.add(btnTrace);
		
		JButton btnDebug = new JButton("Debug");
		btnDebug.setHorizontalAlignment(SwingConstants.LEFT);
		btnDebug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDebug.setBounds(42, 276, 89, 23);
		contentPane.add(btnDebug);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setHorizontalAlignment(SwingConstants.LEFT);
		btnInfo.setBounds(42, 301, 89, 23);
		contentPane.add(btnInfo);
		
		JButton btnWarn = new JButton("Warn");
		btnWarn.setHorizontalAlignment(SwingConstants.LEFT);
		btnWarn.setBounds(42, 326, 89, 23);
		contentPane.add(btnWarn);
		
		JButton btnError = new JButton("Error");
		btnError.setHorizontalAlignment(SwingConstants.LEFT);
		btnError.setBounds(42, 350, 89, 23);
		contentPane.add(btnError);
		
		JButton btnFatal = new JButton("Fatal");
		btnFatal.setHorizontalAlignment(SwingConstants.LEFT);
		btnFatal.setBounds(42, 374, 89, 23);
		contentPane.add(btnFatal);
		
		JButton btnOff = new JButton("Off");
		btnOff.setHorizontalAlignment(SwingConstants.LEFT);
		btnOff.setBounds(42, 399, 89, 23);
		contentPane.add(btnOff);
		
		JLabel lblNewLabel_1 = new JLabel("Levels");
		lblNewLabel_1.setBackground(SystemColor.controlDkShadow);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(42, 208, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(SystemColor.textInactiveText);
		scrollBar.setBounds(605, 204, 17, 232);
		contentPane.add(scrollBar);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(SystemColor.activeCaptionBorder);
		editorPane.setBounds(147, 204, 474, 232);
		contentPane.add(editorPane);
		
		JButton btnImport = new JButton("Import");
		btnImport.setBackground(Color.ORANGE);
		btnImport.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser _fileChooser=null;
				_fileChooser.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY); 
			}
		});
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImport.setBounds(440, 127, 80, 23);
		contentPane.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setBackground(Color.YELLOW);
		btnExport.setBounds(528, 127, 80, 23);
		contentPane.add(btnExport);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(37, 119, 584, 63);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(37, 204, 100, 223);
		contentPane.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 33, 624, 443);
		contentPane.add(tabbedPane);
		
		JTabbedPane ISOConfigurations = new JTabbedPane(JTabbedPane.TOP);
		ISOConfigurations.setBackground(Color.WHITE);
		tabbedPane.addTab("ISO Configurations", null, ISOConfigurations, null);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnLogin, lblKeyword, txtEnterKeywordHere, btnSearch, lblSort, sortChoice, lblNewLabel, lblFilePath, textField_1, lblRefreshEvery, refreshTime, btnAll, btnTrace, btnDebug, btnInfo, btnWarn, btnError, btnFatal, btnOff, lblNewLabel_1, scrollBar, editorPane, btnImport, btnExport, panel}));
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{contentPane, btnLogin, lblKeyword, txtEnterKeywordHere, btnSearch, lblSort, sortChoice, lblNewLabel, lblFilePath, textField_1, lblRefreshEvery, refreshTime, btnAll, btnTrace, btnDebug, btnInfo, btnWarn, btnError, btnFatal, btnOff, lblNewLabel_1, scrollBar, editorPane, btnImport, btnExport, panel, ISOConfigurations, tabbedPane}));
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
	protected JTable getDisplay() {
		return getDisplay();
	}
}
