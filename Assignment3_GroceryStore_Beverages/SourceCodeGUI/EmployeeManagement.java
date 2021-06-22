package GroceryStore_Beverages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeManagement {

	protected JFrame em;
	private JTextField txtKeyInID;
	private JTextField txtKeyInName;
	private JTextField txtKeyInPhoneNumber;
	private JTextField txtKeyInAge;
	private JTextField txtKeyInSalary;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement window = new EmployeeManagement();
					window.em.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EmployeeManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		em = new JFrame();
		em.setBounds(100, 100, 1294, 737);
		em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		em.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(148, 0, 211)));
		panel.setBackground(new Color(255, 204, 255));
		panel.setBounds(10, 11, 1260, 678);
		em.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Employee_ManagementLabel = new JLabel("Employee Management");
		Employee_ManagementLabel.setForeground(new Color(148, 0, 211));
		Employee_ManagementLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		Employee_ManagementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Employee_ManagementLabel.setBounds(453, 26, 516, 50);
		panel.add(Employee_ManagementLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_1.setBackground(new Color(255, 204, 255));
		panel_1.setBounds(176, 108, 385, 424);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Employee_ManagementLabel_1 = new JLabel("Employee Registration");
		Employee_ManagementLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Employee_ManagementLabel_1.setForeground(new Color(148, 0, 211));
		Employee_ManagementLabel_1.setFont(new Font("Rockwell", Font.BOLD, 30));
		Employee_ManagementLabel_1.setBounds(10, 11, 365, 50);
		panel_1.add(Employee_ManagementLabel_1);
		
		JLabel EmployeeIDLabel_1_1 = new JLabel("EmployeeID");
		EmployeeIDLabel_1_1.setBounds(10, 72, 100, 34);
		panel_1.add(EmployeeIDLabel_1_1);
		EmployeeIDLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeeIDLabel_1_1.setForeground(new Color(148, 0, 211));
		EmployeeIDLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel NameLabel_1_1 = new JLabel("Name");
		NameLabel_1_1.setBounds(10, 117, 100, 21);
		panel_1.add(NameLabel_1_1);
		NameLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		NameLabel_1_1.setForeground(new Color(148, 0, 211));
		NameLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel TelLabel_1_3 = new JLabel("Tel");
		TelLabel_1_3.setBounds(10, 162, 52, 21);
		panel_1.add(TelLabel_1_3);
		TelLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		TelLabel_1_3.setForeground(new Color(148, 0, 211));
		TelLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel PositionLabel_1_1_1 = new JLabel("Position");
		PositionLabel_1_1_1.setBounds(10, 286, 76, 37);
		panel_1.add(PositionLabel_1_1_1);
		PositionLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		PositionLabel_1_1_1.setForeground(new Color(148, 0, 211));
		PositionLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel SalaryLabel_1_2 = new JLabel("Salary");
		SalaryLabel_1_2.setBounds(10, 328, 66, 39);
		panel_1.add(SalaryLabel_1_2);
		SalaryLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		SalaryLabel_1_2.setForeground(new Color(148, 0, 211));
		SalaryLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel AgeLabel_1_3_1 = new JLabel("Age");
		AgeLabel_1_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		AgeLabel_1_3_1.setForeground(new Color(148, 0, 211));
		AgeLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		AgeLabel_1_3_1.setBounds(10, 206, 52, 21);
		panel_1.add(AgeLabel_1_3_1);
		
		JLabel GenderLabel_1_3_2 = new JLabel("Gender");
		GenderLabel_1_3_2.setHorizontalAlignment(SwingConstants.LEFT);
		GenderLabel_1_3_2.setForeground(new Color(148, 0, 211));
		GenderLabel_1_3_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GenderLabel_1_3_2.setBounds(10, 246, 76, 29);
		panel_1.add(GenderLabel_1_3_2);
		
		txtKeyInID = new JTextField();
		txtKeyInID.setForeground(Color.BLACK);
		txtKeyInID.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInID.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInID.setText("key in ID");
		txtKeyInID.setBounds(144, 72, 231, 29);
		panel_1.add(txtKeyInID);
		txtKeyInID.setColumns(10);
		
		txtKeyInName = new JTextField();
		txtKeyInName.setForeground(Color.BLACK);
		txtKeyInName.setText("key in Name");
		txtKeyInName.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInName.setColumns(10);
		txtKeyInName.setBounds(144, 113, 231, 29);
		panel_1.add(txtKeyInName);
		
		txtKeyInPhoneNumber = new JTextField();
		txtKeyInPhoneNumber.setForeground(Color.BLACK);
		txtKeyInPhoneNumber.setText("key in phone number");
		txtKeyInPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInPhoneNumber.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInPhoneNumber.setColumns(10);
		txtKeyInPhoneNumber.setBounds(144, 158, 231, 29);
		panel_1.add(txtKeyInPhoneNumber);
		
		txtKeyInAge = new JTextField();
		txtKeyInAge.setForeground(Color.BLACK);
		txtKeyInAge.setText("key in Age");
		txtKeyInAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInAge.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInAge.setColumns(10);
		txtKeyInAge.setBounds(144, 198, 231, 29);
		panel_1.add(txtKeyInAge);
		
		JComboBox GendercomboBox = new JComboBox();
		GendercomboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		GendercomboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Female", "Male"}));
		GendercomboBox.setBounds(144, 246, 231, 27);
		panel_1.add(GendercomboBox);
		
		JComboBox PositioncomboBox_1 = new JComboBox();
		PositioncomboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Position", "Admin", "Stocker", "Cashier", "Accountants"}));
		PositioncomboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		PositioncomboBox_1.setBounds(144, 286, 231, 27);
		panel_1.add(PositioncomboBox_1);
		
		txtKeyInSalary = new JTextField();
		txtKeyInSalary.setText("key in Salary");
		txtKeyInSalary.setHorizontalAlignment(SwingConstants.CENTER);
		txtKeyInSalary.setForeground(Color.BLACK);
		txtKeyInSalary.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtKeyInSalary.setColumns(10);
		txtKeyInSalary.setBounds(144, 328, 231, 29);
		panel_1.add(txtKeyInSalary);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_2.setBackground(new Color(255, 204, 255));
		panel_2.setBounds(571, 108, 679, 424);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\user\\Desktop\\Asg3-P2\\Employee Management System.txt");
					if(!file.exists()) {
						file.createNewFile();
						}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					for (int i=0; i<table.getRowCount(); i++) {
						for (int j=0; j<table.getColumnCount(); j++) {
							bw.write(table.getModel().getValueAt(i, j) + "  ");
							}
						bw.write("\n\t\n");
						}
						bw.close();
						fw.close();
						JOptionPane.showMessageDialog(null, "Data Exported");
					}
					catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnUpload.setBackground(new Color(148, 0, 211));
		btnUpload.setBounds(504, 361, 165, 52);
		panel_2.add(btnUpload);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 659, 334);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "NAME", "TEL", "AGE", "GENDER", "POSITION", "SALARY"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(148, 0, 211)));
		panel_3.setBackground(new Color(255, 204, 255));
		panel_3.setBounds(179, 560, 1068, 107);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				txtKeyInID.getText(),
				txtKeyInName.getText(),
				txtKeyInPhoneNumber.getText(),
				txtKeyInAge.getText(),
				txtKeyInSalary.getText(),
				GendercomboBox.getSelectedItem(),
				PositioncomboBox_1.getSelectedItem(),
				});
					
					if (table.getSelectedRow() == -1) {
						if (table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Employee Update confirmed", "Employee Management System",
									JOptionPane.OK_OPTION);
						}
					}
					}
				});
		btnAdd.setBackground(new Color(148, 0, 211));
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnAdd.setBounds(272, 31, 165, 52);
		panel_3.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Employee Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnDelete.setBackground(new Color(148, 0, 211));
		btnDelete.setBounds(476, 31, 165, 52);
		panel_3.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnPrint.setBackground(new Color(148, 0, 211));
		btnPrint.setBounds(888, 31, 165, 52);
		panel_3.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				em = new JFrame();
				if (JOptionPane.showConfirmDialog(em, "Confirm if you want to exit", "Add Drop System", 
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 29));
		btnExit.setBackground(new Color(148, 0, 211));
		btnExit.setBounds(679, 31, 165, 52);
		panel_3.add(btnExit);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(148, 0, 211));
		panel_4.setBounds(0, 0, 172, 678);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel EmployeeManagementPage = new JLabel("Employee");
		EmployeeManagementPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new EmployeeManagement().em.setVisible(true);
				em.dispose();
			}
		});
		EmployeeManagementPage.setHorizontalAlignment(SwingConstants.LEFT);
		EmployeeManagementPage.setForeground(new Color(255, 204, 255));
		EmployeeManagementPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		EmployeeManagementPage.setBounds(10, 11, 156, 27);
		panel_4.add(EmployeeManagementPage);
		
		JLabel lblInventory1_1 = new JLabel("Inventory");
		lblInventory1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Inventory().Inventory.setVisible(true);
				em.dispose();
			}
		});
		lblInventory1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblInventory1_1.setForeground(new Color(255, 204, 255));
		lblInventory1_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		lblInventory1_1.setBounds(10, 49, 111, 27);
		panel_4.add(lblInventory1_1);
		
		JLabel BeveragesDescriptionPage = new JLabel("Beverages");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				em.dispose();
			}
		});
		BeveragesDescriptionPage.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage.setBounds(10, 93, 111, 27);
		panel_4.add(BeveragesDescriptionPage);
		
		JLabel BeveragesDescriptionPage_1 = new JLabel("Description");
		BeveragesDescriptionPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new BeveragesDescription().bd.setVisible(true);
				em.dispose();
			}
		});
		BeveragesDescriptionPage_1.setHorizontalAlignment(SwingConstants.LEFT);
		BeveragesDescriptionPage_1.setForeground(new Color(255, 204, 255));
		BeveragesDescriptionPage_1.setFont(new Font("STXinwei", Font.BOLD, 18));
		BeveragesDescriptionPage_1.setBounds(10, 113, 111, 27);
		panel_4.add(BeveragesDescriptionPage_1);
		
		JLabel FinancialPage = new JLabel("Financial");
		FinancialPage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Finance().finance.setVisible(true);
				em.dispose();
			}
		});
		FinancialPage.setHorizontalAlignment(SwingConstants.LEFT);
		FinancialPage.setForeground(new Color(255, 204, 255));
		FinancialPage.setFont(new Font("STXinwei", Font.BOLD, 18));
		FinancialPage.setBounds(10, 151, 111, 27);
		panel_4.add(FinancialPage);
		
		JLabel AdsAndMarketing = new JLabel("Ads and Marketing");
		AdsAndMarketing.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Ads_and_Marketing ().ads.setVisible(true);
				em.dispose();
			}
		});
		
		AdsAndMarketing.setHorizontalAlignment(SwingConstants.LEFT);
		AdsAndMarketing.setForeground(new Color(255, 204, 255));
		AdsAndMarketing.setFont(new Font("STXinwei", Font.BOLD, 18));
		AdsAndMarketing.setBounds(10, 189, 156, 27);
		panel_4.add(AdsAndMarketing);
		
		JLabel HomePage = new JLabel("HomePage");
		HomePage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Cover().cover.setVisible(true);
				em.dispose();
			}
		});
		HomePage.setHorizontalAlignment(SwingConstants.LEFT);
		HomePage.setForeground(new Color(255, 204, 255));
		HomePage.setFont(new Font("STXinwei", Font.BOLD, 18));
		HomePage.setBounds(10, 528, 156, 27);
		panel_4.add(HomePage);
	}
}
