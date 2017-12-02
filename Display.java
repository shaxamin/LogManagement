import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class Display extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField keyword;
	private JTextField filepath;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e){
			
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display frame = new Display();
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
	public Display() {
		setTitle("Log Management Application");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 981, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogManagement = new JLabel("LOG MANAGEMENT APPLICATION");
		lblLogManagement.setBounds(162, 15, 292, 30);
		lblLogManagement.setFont(new Font("Bookman Old Style", Font.BOLD, 15));
		contentPane.add(lblLogManagement);
		
		JScrollPane displayLogPanel = new JScrollPane();
		displayLogPanel.setBounds(162, 180, 776, 462);
		contentPane.add(displayLogPanel);
		
		JTextArea textArea = new JTextArea();
		displayLogPanel.setViewportView(textArea);
		try {
			String filename = "C:/Users/Sha Amin/Documents/IPPI/log4j2/logs/isoConf.log";
			FileReader reader = new FileReader(filename);
			BufferedReader br = new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
			textArea.requestFocus();
		}
		catch (Exception e) {
			//logger.error("Exception : ", e);
		}
		
		table = new JTable();
		table.setBounds(0, 0, 1, 1);
		contentPane.add(table);
		
		JPanel fileInfoPanel = new JPanel();
		fileInfoPanel.setBounds(10, 56, 955, 56);
		contentPane.add(fileInfoPanel);
		fileInfoPanel.setLayout(null);
		
		JButton btnImport = new JButton("Import");
		btnImport.setForeground(new Color(0, 0, 0));
		btnImport.setBackground(new Color(255, 192, 203));
		btnImport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
	            chooser.showOpenDialog(null);
	            File f = chooser.getSelectedFile();
	            String filename = f.getAbsolutePath();
			}
		});
		btnImport.setBounds(754, 0, 85, 23);
		fileInfoPanel.add(btnImport);
		
		JButton btnExport = new JButton("Export");
		btnExport.setForeground(new Color(0, 0, 0));
		btnExport.setBackground(new Color(255, 255, 0));
		btnExport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExport.setBounds(849, 0, 80, 23);
		fileInfoPanel.add(btnExport);
		
		filepath = new JTextField();
		filepath.setBounds(218, 27, 711, 23);
		fileInfoPanel.add(filepath);
		filepath.setColumns(10);
		
		JLabel lblFilePath = new JLabel("File Path :");
		lblFilePath.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFilePath.setBounds(152, 31, 85, 14);
		fileInfoPanel.add(lblFilePath);
		
		JLabel lblLogInformation = new JLabel("Log Information");
		lblLogInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLogInformation.setBackground(new Color(204, 255, 204));
		lblLogInformation.setForeground(new Color(0, 0, 205));
		lblLogInformation.setBounds(152, 3, 289, 14);
		fileInfoPanel.add(lblLogInformation);
		
		JPanel keyword_sortPanel = new JPanel();
		keyword_sortPanel.setBounds(10, 113, 955, 24);
		contentPane.add(keyword_sortPanel);
		keyword_sortPanel.setLayout(null);
		
		JLabel lblKeyword = new JLabel("Keyword : ");
		lblKeyword.setBounds(151, 3, 71, 14);
		keyword_sortPanel.add(lblKeyword);
		lblKeyword.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		keyword = new JTextField();
		keyword.setBounds(219, 0, 320, 21);
		keyword_sortPanel.add(keyword);
		keyword.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(549, 0, 89, 23);
		keyword_sortPanel.add(btnSearch);
		
		JLabel lblSort = new JLabel("Sort :");
		lblSort.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSort.setBounds(718, 4, 37, 14);
		keyword_sortPanel.add(lblSort);
		
		JComboBox sortBox = new JComboBox();
		sortBox.setBounds(758, 1, 173, 20);
		keyword_sortPanel.add(sortBox);
		sortBox.setModel(new DefaultComboBoxModel(new String[] {"Time", "Date"}));
		
		JPanel levelsPanel = new JPanel();
		levelsPanel.setBounds(10, 157, 142, 226);
		contentPane.add(levelsPanel);
		levelsPanel.setLayout(null);
		
		JLabel lblLevels = new JLabel("Levels");
		lblLevels.setBounds(50, 3, 37, 15);
		levelsPanel.add(lblLevels);
		lblLevels.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLevels.setBackground(Color.YELLOW);
		
		JButton btnAll = new JButton("All");
		btnAll.setBounds(10, 21, 122, 23);
		levelsPanel.add(btnAll);
		btnAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAll.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnTrace = new JButton("Trace");
		btnTrace.setBounds(10, 49, 122, 23);
		levelsPanel.add(btnTrace);
		btnTrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTrace.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnDebug = new JButton("Debug");
		btnDebug.setBounds(10, 76, 122, 23);
		levelsPanel.add(btnDebug);
		btnDebug.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnInfo = new JButton("Info");
		btnInfo.setBounds(10, 106, 122, 23);
		levelsPanel.add(btnInfo);
		btnInfo.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnWarn = new JButton("Warn");
		btnWarn.setBounds(10, 135, 122, 23);
		levelsPanel.add(btnWarn);
		btnWarn.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnError = new JButton("Error");
		btnError.setBounds(10, 164, 122, 23);
		levelsPanel.add(btnError);
		btnError.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnFatal = new JButton("Fatal");
		btnFatal.setBounds(10, 192, 122, 23);
		levelsPanel.add(btnFatal);
		btnFatal.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel refreshPanel = new JPanel();
		refreshPanel.setBounds(10, 405, 142, 73);
		contentPane.add(refreshPanel);
		refreshPanel.setLayout(null);
		
		JLabel lblRefreshEvery = new JLabel("Refresh every :");
		lblRefreshEvery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRefreshEvery.setBounds(10, 11, 99, 14);
		refreshPanel.add(lblRefreshEvery);
		
		JComboBox refreshBox = new JComboBox();
		refreshBox.setBounds(10, 30, 122, 20);
		refreshPanel.add(refreshBox);
		refreshBox.setModel(new DefaultComboBoxModel(new String[] {"30 seconds", "1 minute", "5 minutes"}));
	}
}
