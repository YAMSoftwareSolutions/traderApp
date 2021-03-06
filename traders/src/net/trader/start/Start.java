package net.trader.start;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import net.trader.daofactory.TradersDaofactory;
import net.trader.dbConfig.HibernateUtil;
import net.trader.services.AmountToWordConverter;
import net.trader.services.AutoGeneratedCode;
import net.traders.to.MeterialDescriptionTO;
import net.traders.to.TraderTo;

import org.dyno.visual.swing.layouts.Bilateral;
import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class Start extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel objARtradersLabel;
	private JLabel objNameLabel;
	private JTextField objNameTextField;
	private JTextField objTINnoTextField;
	private JLabel objPhoneNoLable;
	private JLabel objInvoiceNoLabel;
	private JTextField objInvoiceNumberTextField;
	private JLabel objDateLabel;
	private JLabel objAddressLable;
	private JLabel objPartyTINNoLabel;
	private JLabel objVechicleNoLable;
	private JTextField objVechicleNoTextField;
	private JTextField objPhoneNumberTextFields;
	private JTable objMeterialdetailsTable;
	private JScrollPane objMaterialdetailsTable;
	private DefaultTableModel objDefaultTableModel;
	private JButton objAddbutton;
	private JButton objDeleteButton;
	private JTextArea objAddressTextArea;
	private JScrollPane jAddressScrollPane;
	private JButton objCreateButton;
	private JButton objSaveButton;
	private JLabel jCreateLabel;
	private JLabel jSearchLabel;
	private JButton jSearchButton;
	private JTextField jInvocieSearchTextField;
	private JLabel objTotalAmountLabel;
	private JLabel objTotalLabel;
	private JLabel objTaxLabel;
	private JFormattedTextField objTaxTextField;
	private JLabel objTotalAmoutLabel;
	private JLabel objLabelTotalAmountLabel;
	private AutoGeneratedCode autoGeneratedCode;
	private JLabel jTaxAmountLabel;
	private JLabel jTaxAmountValue;
	private JButton jPrintButton;
	private JFormattedTextField objFormatedDateField;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public Start() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getObjNameLabel(), new Constraints(new Leading(34, 10, 10), new Leading(56, 10, 10)));
		add(getObjAddressLable(), new Constraints(new Leading(34, 12, 12), new Leading(77, 12, 12)));
		add(getObjNameTextField(), new Constraints(new Leading(138, 234, 12, 12), new Leading(56, 12, 12)));
		add(getObjDateLabel(), new Constraints(new Leading(390, 59, 12, 12), new Leading(58, 12, 12)));
		add(getObjInvoiceNoLabel(), new Constraints(new Leading(390, 12, 12), new Leading(77, 12, 12)));
		add(getObjVechicleNoLable(), new Constraints(new Leading(390, 12, 12), new Leading(96, 10, 10)));
		add(getObjPartyTINNoLabel(), new Constraints(new Leading(390, 12, 12), new Leading(117, 12, 12)));
		add(getObjInvoiceNumberTextField(), new Constraints(new Leading(489, 214, 12, 12), new Leading(74, 12, 12)));
		add(getObjVechicleNoTextField(), new Constraints(new Leading(489, 214, 12, 12), new Leading(96, 12, 12)));
		add(getObjTINnoTextField(), new Constraints(new Leading(489, 214, 12, 12), new Leading(119, 12, 12)));
		add(getObjPhoneNumberTextFields(), new Constraints(new Leading(138, 234, 12, 12), new Leading(162, 12, 12)));
		add(getObjPhoneNoLable(), new Constraints(new Leading(34, 12, 12), new Leading(162, 12, 12)));
		add(getObjDeleteButton(), new Constraints(new Leading(622, 12, 12), new Leading(146, 10, 10)));
		add(getObjAddbutton(), new Constraints(new Leading(532, 84, 12, 12), new Leading(146, 12, 12)));
		add(getObjMaterialdetailScrolPance(), new Constraints(new Leading(30, 673, 12, 12), new Leading(195, 177, 12, 12)));
		add(getAddressJScrollPane(), new Constraints(new Leading(139, 232, 12, 12), new Leading(78, 80, 12, 12)));
		add(getObjTotalLabel(), new Constraints(new Leading(602, 103, 12, 12), new Leading(393, 25, 12, 12)));
		add(getObjTotalAmountLabel(), new Constraints(new Leading(492, 10, 10), new Leading(393, 25, 12, 12)));
		add(getObjTaxLabel(), new Constraints(new Leading(492, 12, 12), new Leading(424, 12, 12)));
		add(getObjTaxTextField(), new Constraints(new Leading(602, 102, 12, 12), new Leading(428, 10, 10)));
		add(getJsearchLabel(), new Constraints(new Leading(34, 291, 12, 12), new Leading(396, 65, 10, 10)));
		add(getJSearchButton(), new Constraints(new Leading(56, 10, 10), new Leading(419, 12, 12)));
		add(getJInvocieSearchTextField(), new Constraints(new Leading(168, 139, 10, 10), new Leading(419, 25, 12, 12)));
		add(getCreateLabel(), new Constraints(new Leading(36, 286, 12, 12), new Leading(479, 61, 12, 12)));
		add(getObjCreateButton(), new Constraints(new Leading(56, 12, 12), new Leading(503, 10, 10)));
		add(getObjSaveButton(), new Constraints(new Leading(227, 75, 10, 10), new Leading(501, 10, 10)));
		add(getJTaxAmountLabel(), new Constraints(new Leading(494, 69, 10, 10), new Leading(453, 12, 12)));
		add(getJTaxAmountValue(), new Constraints(new Leading(602, 98, 12, 12), new Leading(453, 17, 12, 12)));
		add(getObjLabelTotalAmountLabel(), new Constraints(new Leading(600, 102, 12, 12), new Leading(482, 18, 12, 12)));
		add(getObjTotalAmoutLabel(), new Constraints(new Leading(497, 12, 12), new Leading(483, 12, 12)));
		add(getJPrintButton(), new Constraints(new Leading(606, 12, 12), new Leading(527, 10, 10)));
		add(getJFormattedTextField0(), new Constraints(new Leading(489, 215, 12, 12), new Leading(52, 12, 12)));
		add(getObjARtradersLabel(), new Constraints(new Bilateral(4, 0, 10), new Leading(2, 594, 10, 10)));
		setSize(719, 602);
	}

	private JFormattedTextField getJFormattedTextField0() {
		if (objFormatedDateField == null) {
			Date objdate=new Date();
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			objFormatedDateField = new JFormattedTextField(dateFormat.format(objdate));
		}
		return objFormatedDateField;
	}

	private JButton getJPrintButton() {
		if (jPrintButton == null) {
			jPrintButton = new JButton();
			jPrintButton.setText("Print");
			jPrintButton.setVisible(false);
			jPrintButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jPrintButtonActionPerformed(event);
				}
			});
		}
		return jPrintButton;
	}

	private JLabel getJTaxAmountValue() {
		if (jTaxAmountValue == null) {
			jTaxAmountValue = new JLabel();
			jTaxAmountValue.setText("0.0");
		}
		return jTaxAmountValue;
	}

	private JLabel getJTaxAmountLabel() {
		if (jTaxAmountLabel == null) {
			jTaxAmountLabel = new JLabel();
			jTaxAmountLabel.setText("Tax Amt:");
		}
		return jTaxAmountLabel;
	}

	private JLabel getObjLabelTotalAmountLabel() {
		if (objLabelTotalAmountLabel == null) {
			objLabelTotalAmountLabel = new JLabel();
			objLabelTotalAmountLabel.setText("0.0");
		}
		return objLabelTotalAmountLabel;
	}

	private JLabel getObjTotalAmoutLabel() {
		if (objTotalAmoutLabel == null) {
			objTotalAmoutLabel = new JLabel();
			objTotalAmoutLabel.setText("Total:");
		}
		return objTotalAmoutLabel;
	}

	private JFormattedTextField getObjTaxTextField() {
		if (objTaxTextField == null) {
			objTaxTextField = new JFormattedTextField();
			objTaxTextField.setText("5.0");
			objTaxTextField.addFocusListener(new FocusAdapter() {

				public void focusLost(FocusEvent event) {
					objTaxTextFieldFocusFocusLost();
				}
			});
			objTaxTextField.addKeyListener(new KeyAdapter() {

				public void keyTyped(KeyEvent event) {
					objAllowDecimalValue(event);
				}
			});
		}
		return objTaxTextField;
	}

	private JLabel getObjTaxLabel() {
		if (objTaxLabel == null) {
			objTaxLabel = new JLabel();
			objTaxLabel.setText("Tax(%):");
		}
		return objTaxLabel;
	}

	private JLabel getObjTotalLabel() {
		if (objTotalLabel == null) {
			objTotalLabel = new JLabel();
			objTotalLabel.setText("0.0");
		}
		return objTotalLabel;
	}

	private JLabel getObjTotalAmountLabel() {
		if (objTotalAmountLabel == null) {
			objTotalAmountLabel = new JLabel();
			objTotalAmountLabel.setText("Total Amount:");
		}
		return objTotalAmountLabel;
	}

	private JTextField getJInvocieSearchTextField() {
		if (jInvocieSearchTextField == null) {
			jInvocieSearchTextField = new JTextField();
			// jInvocieSearchTextField.setEditable(false);
		}
		return jInvocieSearchTextField;
	}

	private JButton getJSearchButton() {
		if (jSearchButton == null) {
			jSearchButton = new JButton();
			jSearchButton.setText("Search");
			jSearchButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					jSearchButtonActionActionPerformed(event);
				}
			});
		}
		return jSearchButton;
	}

	private JLabel getJsearchLabel() {
		if (jSearchLabel == null) {
			jSearchLabel = new JLabel();
			jSearchLabel.setBorder(BorderFactory
					.createTitledBorder(null, "Search", TitledBorder.CENTER,
							TitledBorder.TOP, null, null));
		}
		return jSearchLabel;
	}

	private JLabel getCreateLabel() {
		if (jCreateLabel == null) {
			jCreateLabel = new JLabel();
			jCreateLabel.setBorder(BorderFactory.createTitledBorder(null,
					"Create", TitledBorder.CENTER,
					TitledBorder.DEFAULT_POSITION, null, null));
		}
		return jCreateLabel;
	}

	private JButton getObjSaveButton() {
		if (objSaveButton == null) {
			objSaveButton = new JButton();
			objSaveButton.setText("Save");
			objSaveButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					objSaveButtonActionActionPerformed(event);
				}
			});
		}
		return objSaveButton;
	}

	private JButton getObjCreateButton() {
		if (objCreateButton == null) {
			objCreateButton = new JButton();
			objCreateButton.setText("Create");
			objCreateButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					objCreateButtonActionActionPerformed(event);
				}
			});
		}
		return objCreateButton;
	}

	private JScrollPane getAddressJScrollPane() {
		if (jAddressScrollPane == null) {
			jAddressScrollPane = new JScrollPane();
			jAddressScrollPane.setViewportView(getJAddressTextArea());
		}
		return jAddressScrollPane;
	}

	private JTextArea getJAddressTextArea() {
		if (objAddressTextArea == null) {
			objAddressTextArea = new JTextArea();
		}
		return objAddressTextArea;
	}

	private JButton getObjDeleteButton() {
		if (objDeleteButton == null) {
			objDeleteButton = new JButton();
			objDeleteButton.setText("Delete");
			objDeleteButton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					objDeleteButtonActionActionPerformed(event);
				}
			});
		}
		return objDeleteButton;
	}

	private JButton getObjAddbutton() {
		if (objAddbutton == null) {
			objAddbutton = new JButton();
			objAddbutton.setText("Add");
			objAddbutton.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent event) {
					objAddbuttonActionActionPerformed(event);
				}
			});
		}
		return objAddbutton;
	}

	private JScrollPane getObjMaterialdetailScrolPance() {
		if (objMaterialdetailsTable == null) {
			objMaterialdetailsTable = new JScrollPane();
			objMaterialdetailsTable
			.setViewportView(getObjMaterialdetailsTable());
		}
		return objMaterialdetailsTable;
	}

	private JTable getObjMaterialdetailsTable() {
		if (objMeterialdetailsTable == null) {
			objMeterialdetailsTable = new JTable();
			objMeterialdetailsTable.updateUI();
			objMeterialdetailsTable
			.setModel(objDefaultTableModel = new DefaultTableModel(
					new Object[][][] {}, new String[] {
							"Material Description", "Quantity",
							"Unit Rate", "Amount" }) {
				private static final long serialVersionUID = 1L;
				Class<?>[] types = new Class<?>[] { Object.class,
						Object.class, Object.class, Object.class };
				private boolean[][] editable_cells;

				public Class<?> getColumnClass(int columnIndex) {
					return types[columnIndex];
				}
				public boolean isCellEditable(int row, int column)
				{
					return true;
				}
			});
			JTableHeader jTHeader = objMeterialdetailsTable.getTableHeader();
			jTHeader.setFont(new Font("Sans", Font.BOLD, 11));
			objMeterialdetailsTable.setAlignmentX(1.0f);
			objMeterialdetailsTable.setAlignmentY(1.0f);
			objMeterialdetailsTable.setRowHeight(35);
			objMeterialdetailsTable.getColumnModel().getColumn(0)
			.setPreferredWidth(700);
			objMeterialdetailsTable.getColumnModel().getColumn(1)
			.setPreferredWidth(100);
			objMeterialdetailsTable.getColumnModel().getColumn(2)
			.setPreferredWidth(100);
			objMeterialdetailsTable.getColumnModel().getColumn(3)
			.setPreferredWidth(100);
			objMeterialdetailsTable.getColumnModel().getColumn(3)
			.setCellRenderer(new DecimalFormatRenderer());

		}
		return objMeterialdetailsTable;
	}

	private JTextField getObjPhoneNumberTextFields() {
		if (objPhoneNumberTextFields == null) {
			objPhoneNumberTextFields = new JTextField();
		}
		return objPhoneNumberTextFields;
	}

	private JTextField getObjVechicleNoTextField() {
		if (objVechicleNoTextField == null) {
			objVechicleNoTextField = new JTextField();
		}
		return objVechicleNoTextField;
	}

	private JLabel getObjVechicleNoLable() {
		if (objVechicleNoLable == null) {
			objVechicleNoLable = new JLabel();
			objVechicleNoLable.setText("Vehicle No :");
		}
		return objVechicleNoLable;
	}

	private JLabel getObjPartyTINNoLabel() {
		if (objPartyTINNoLabel == null) {
			objPartyTINNoLabel = new JLabel();
			objPartyTINNoLabel.setText("Party TIN No:");
		}
		return objPartyTINNoLabel;
	}

	private JLabel getObjAddressLable() {
		if (objAddressLable == null) {
			objAddressLable = new JLabel();
			objAddressLable.setText("Address :");
		}
		return objAddressLable;
	}

	private JLabel getObjDateLabel() {
		if (objDateLabel == null) {
			objDateLabel = new JLabel();
			objDateLabel.setText("Date :");
		}
		return objDateLabel;
	}

	private JTextField getObjInvoiceNumberTextField() {
		if (objInvoiceNumberTextField == null) {
			objInvoiceNumberTextField = new JTextField();
			objInvoiceNumberTextField.setEditable(false);
		}
		return objInvoiceNumberTextField;
	}

	private JLabel getObjInvoiceNoLabel() {
		if (objInvoiceNoLabel == null) {
			objInvoiceNoLabel = new JLabel();
			objInvoiceNoLabel.setText("Invoice No :");
		}
		return objInvoiceNoLabel;
	}

	private JTextField getObjTINnoTextField() {
		if (objTINnoTextField == null) {
			objTINnoTextField = new JTextField();
		}
		return objTINnoTextField;
	}

	private JLabel getObjPhoneNoLable() {
		if (objPhoneNoLable == null) {
			objPhoneNoLable = new JLabel();
			objPhoneNoLable.setText("Phone No :");
		}
		return objPhoneNoLable;
	}

	private JTextField getObjNameTextField() {
		if (objNameTextField == null) {
			objNameTextField = new JTextField();
		}
		return objNameTextField;
	}

	private JLabel getObjNameLabel() {
		if (objNameLabel == null) {
			objNameLabel = new JLabel();
			objNameLabel.setText("Name :");
		}
		return objNameLabel;
	}

	private JLabel getObjARtradersLabel() {
		if (objARtradersLabel == null) {
			objARtradersLabel = new JLabel();
			objARtradersLabel.setBorder(BorderFactory.createTitledBorder(
					new LineBorder(Color.black, 1, true), "A.R.TRADERS",
					TitledBorder.CENTER, TitledBorder.TOP, new Font("Dialog",
							Font.BOLD, 20), Color.blue));
		}
		return objARtradersLabel;
	}

	@SuppressWarnings("unused")
	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class. Note: This class is only created so that you can
	 * easily preview the result at runtime. It is not expected to be managed by
	 * the designer. You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Start frame = new Start();
				frame.setDefaultCloseOperation(Start.EXIT_ON_CLOSE);
				frame.setTitle("Start");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

	private void objAddbuttonActionActionPerformed(ActionEvent event) {
		boolean statu = true;
		for (int i = 0; i < objDefaultTableModel.getRowCount(); i++) {
			if (objMeterialdetailsTable.getModel().getValueAt(i, 1).toString()
					.length() == 0) {
				statu = false;
				break;
			}
		}
		if (statu != false) {
			String[] data = { "", "", "", "0.00" };
			objDefaultTableModel.addRow(data);
		}
	}

	private void objDeleteButtonActionActionPerformed(ActionEvent event) {
	}

	private void objCreateButtonActionActionPerformed(ActionEvent event) {
		jSearchButton.setEnabled(true);
		objMeterialdetailsTable.updateUI();
		objDefaultTableModel=null;
		objMeterialdetailsTable
		.setModel(objDefaultTableModel = new DefaultTableModel(
				new Object[][][] {}, new String[] {
						"Material Description", "Quantity",
						"Unit Rate", "Amount" }) {
			private static final long serialVersionUID = 1L;
			Class<?>[] types = new Class<?>[] { Object.class,
					Object.class, Object.class, Object.class };
			private boolean[][] editable_cells;

			public Class<?> getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
			public boolean isCellEditable(int row, int column)
			{
				return true;
			}
		});
		objAddbutton.setEnabled(true);
		objDeleteButton.setEnabled(true);
		objNameTextField.setEditable(true);
		objNameTextField.setText("");
		objAddressTextArea.setEditable(true);
		objAddressTextArea.setText("");
		objPhoneNumberTextFields.setEditable(true);
		objPhoneNumberTextFields.setText("");
		objVechicleNoTextField.setEditable(true);
		objVechicleNoTextField.setText("");
		objTINnoTextField.setEditable(true);
		objTINnoTextField.setText("");
		objInvoiceNumberTextField.setText("");
		objTotalLabel.setText("");
		objLabelTotalAmountLabel.setText("");
		objTaxTextField.setText("5.0");
		jPrintButton.setVisible(false);
		
		// jInvocieSearchTextField.setEditable(false);
		jInvocieSearchTextField.setText("");
		jInvocieSearchTextField.setEditable(true);
		objTaxTextField.setEditable(true);
		objTaxTextField.setText("5.0");
		objSaveButton.setVisible(true);
		objMaterialdetailsTable.setEnabled(true);
		// delte the rows of table
		int rowCount = objDefaultTableModel.getRowCount();
		for (int i = rowCount - 1; i >= 0; i--) {
			objDefaultTableModel.removeRow(i);
		}
	}

	private void jSearchButtonActionActionPerformed(ActionEvent event) {
		objAddbutton.setEnabled(false);
		objDeleteButton.setEnabled(false);
		objNameTextField.setEditable(false);
		objAddressTextArea.setEditable(false);
		objPhoneNumberTextFields.setEditable(false);
		objVechicleNoTextField.setEditable(false);
		objTINnoTextField.setEditable(false);
		jInvocieSearchTextField.setEditable(false);
		objTaxTextField.setEditable(false);
		objMaterialdetailsTable.setEnabled(false);
		//
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TraderTo traderTo = TradersDaofactory.getTraderDao().search(
						jInvocieSearchTextField.getText().trim());
				objMeterialdetailsTable.updateUI();
				objDefaultTableModel=null;
				objMeterialdetailsTable
				.setModel(objDefaultTableModel = new DefaultTableModel(
						new Object[][][] {}, new String[] {
								"Material Description", "Quantity",
								"Unit Rate", "Amount" }) {
					private static final long serialVersionUID = 1L;
					Class<?>[] types = new Class<?>[] { Object.class,
							Object.class, Object.class, Object.class };
					private boolean[][] editable_cells;

					public Class<?> getColumnClass(int columnIndex) {
						return types[columnIndex];
					}
					public boolean isCellEditable(int row, int column)
					{
						return false;
					}
				});
				if(traderTo!=null){
					objNameTextField.setText(traderTo.getName());
					objAddressTextArea.setText(traderTo.getAddress());
					objVechicleNoTextField.setText(traderTo.getVehicleNumber());
					objPhoneNumberTextFields.setText(traderTo.getPhoneNumber());
					objInvoiceNumberTextField.setText(traderTo.getInvoiceNumber());
					objTINnoTextField.setText(traderTo.getPartyTINNo());
					objTaxTextField.setText(traderTo.getTax().toString());
					objTotalLabel.setText(traderTo.getTotalAmount().toString());
					objLabelTotalAmountLabel
					.setText(traderTo.getTotal().toString());
					for (MeterialDescriptionTO meterialDescriptionTO : traderTo
							.getobjMeterialDescriptionTo()) {
						String[] data = {
								meterialDescriptionTO.getMeterialDescription(),
								meterialDescriptionTO.getQuantity(),
								meterialDescriptionTO.getUnit(),
								meterialDescriptionTO.getAmount().toString() };
						objDefaultTableModel.addRow(data);
					}
					jPrintButton.setVisible(true);
					objSaveButton.setVisible(false);
				}
			}
		});
	}

	private void objSaveButtonActionActionPerformed(ActionEvent event) {
		objNameTextField.setEditable(false);
		objAddressTextArea.setEditable(false);
		objPhoneNumberTextFields.setEditable(false);
		objVechicleNoTextField.setEditable(false);
		objTINnoTextField.setEditable(false);
		jInvocieSearchTextField.setEditable(false);
		objTaxTextField.setEditable(false);
		objMaterialdetailsTable.setEnabled(false);
		objAddbutton.setEnabled(false);
		objDeleteButton.setEnabled(false);
		jSearchButton.setEnabled(false);
		//
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				TraderTo traderTo = new TraderTo();
				traderTo.setName(objNameTextField.getText().trim().toString());
				traderTo.setAddress(objAddressTextArea.getText().toString());
				traderTo.setVehicleNumber(objVechicleNoTextField.getText()
						.trim().toString());
				traderTo.setPhoneNumber(objPhoneNumberTextFields.getText()
						.trim().toString());
				// traderTo.setInvoiceNumber(objInvoiceNumberTextField.getText().trim().toString());
				// Get Invoice Number
				autoGeneratedCode = new AutoGeneratedCode();
				String generatedNumber = autoGeneratedCode.getPerviousnumber();
				traderTo.setInvoiceNumber(generatedNumber);
				objInvoiceNumberTextField.setText(generatedNumber);
				//
				traderTo.setPartyTINNo(objTINnoTextField.getText().trim()
						.toString());
				traderTo.setTax(Double.parseDouble(objTaxTextField.getText()
						.trim()));
				traderTo.setTotalAmount(Double.parseDouble(objTotalLabel
						.getText().trim()));
				traderTo.setTotal(Double.parseDouble(objLabelTotalAmountLabel
						.getText().trim()));
				traderTo.setDate(objFormatedDateField.getText().trim());
				
				for (int i = 0; i < objDefaultTableModel.getRowCount(); i++) {
					MeterialDescriptionTO meterialDescriptionTO = new MeterialDescriptionTO();
					meterialDescriptionTO
					.setMeterialDescription(objMeterialdetailsTable
							.getModel().getValueAt(i, 0).toString());
					meterialDescriptionTO.setQuantity(objMeterialdetailsTable
							.getModel().getValueAt(i, 1).toString());
					meterialDescriptionTO.setUnit(objMeterialdetailsTable
							.getModel().getValueAt(i, 2).toString());
					meterialDescriptionTO.setAmount(Double
							.parseDouble(objMeterialdetailsTable.getModel()
									.getValueAt(i, 3).toString()));
					traderTo.getobjMeterialDescriptionTo().add(
							meterialDescriptionTO);
				}
				//
				TradersDaofactory.getTraderDao().insert(traderTo);
				jPrintButton.setVisible(true);
				objSaveButton.setVisible(false);
			}
		});
	}

	class DecimalFormatRenderer extends DefaultTableCellRenderer {
		// private static final DecimalFormat formatter = new DecimalFormat(
		// "#.00" );

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			// First format the cell value as required
			// value = formatter.format((Number)value);
			try {
				value = Double.parseDouble(value.toString());
				Double total = 0.0;
				for (int i = 0; i < objDefaultTableModel.getRowCount(); i++) {
					total = total
							+ Double.parseDouble(objMeterialdetailsTable.getModel()
									.getValueAt(i, 3).toString());
				}
				objTotalLabel.setText(total.toString());
				objTaxTextFieldFocusFocusLost();
				 //And pass it on to parent class
			} catch (Exception e) {
				value = 0.0;
			}
			return super.getTableCellRendererComponent(table, value,
					isSelected, hasFocus, row, column);
		}
	}

	private void jPrintButtonActionPerformed(ActionEvent event) {

		AmountToWordConverter amountToWordConverter = new AmountToWordConverter();
		Map<String, Object> parentMap=new HashMap<String,Object>();
		parentMap.put("invoiceNo", objInvoiceNumberTextField.getText());
		parentMap.put("date", objFormatedDateField.getText());
		parentMap.put("vehicleNo", objVechicleNoTextField.getText());
		parentMap.put("fphoneNo", objPhoneNumberTextFields.getText());
		parentMap.put("partyTIN", objTINnoTextField.getText());
		parentMap.put("ms",objNameTextField.getText());
		parentMap.put("total", objTotalLabel.getText());
		parentMap.put("grandTotal", objLabelTotalAmountLabel.getText());
		try {
			parentMap.put("rupessinwords", amountToWordConverter.converter(objLabelTotalAmountLabel.getText().toString()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		parentMap.put("tax", objTaxTextField.getText());

		List<Map<String,?>> childmaps = new ArrayList<Map<String, ?>> (); 
		for (int i = 0; i < objDefaultTableModel.getRowCount(); i++) {
			Map<String,Object> map = new HashMap<String, Object>();
			map.put("quantity", objMeterialdetailsTable
					.getModel().getValueAt(i, 1).toString());
			map.put("unitRate",objMeterialdetailsTable
					.getModel().getValueAt(i, 2).toString());
			map.put("amount", objMeterialdetailsTable.getModel()
					.getValueAt(i, 3).toString());
			map.put("meterialDescription", objMeterialdetailsTable
					.getModel().getValueAt(i, 0).toString());
			childmaps.add(map);
		}

		try{
			String path=HibernateUtil.getJarFolder();
			String reportSource = path+"traders.jrxml";
			JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(childmaps);
			// compile report
			JasperReport jasperReport = (JasperReport)  JasperCompileManager.compileReport(reportSource);
			JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parentMap, dataSource);
			// view report to UI
			JasperViewer.viewReport(jasperPrint, false);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void objAllowDecimalValue(KeyEvent event) {
		// Getting the Typed Character
		char value = event.getKeyChar();

		// Checking for Alphabets,BackSpace,Delete,Period and Condition for
		// single decimal point
		if (!((Character.isDigit(value) || (value == KeyEvent.VK_BACK_SPACE)
				|| (value == KeyEvent.VK_DELETE) || (value == KeyEvent.VK_PERIOD && (objTaxTextField
						.getText().indexOf(".") < 0))))) {

			event.consume();// Ignoring the Characters
		}
	}

	private void objTaxTextFieldFocusFocusLost() {
		Double taxAmount = 0.0;
		Double taxPercent = 0.0;
		Double totalAmount = 0.0;
		Double finalTotal = 0.0;
		try{
		taxPercent = new Double(objTaxTextField.getText());
		}
		catch(Exception e){
			taxPercent=0.0;
		}
		totalAmount = new Double(objTotalLabel.getText());
		taxAmount = (taxPercent / 100) * totalAmount;
		finalTotal = totalAmount + taxAmount;

		jTaxAmountValue.setText(taxAmount.toString());
		objLabelTotalAmountLabel.setText(finalTotal.toString());

	}

}