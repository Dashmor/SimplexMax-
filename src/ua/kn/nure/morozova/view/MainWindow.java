package ua.kn.nure.morozova.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.awt.event.ActionEvent;
import java.awt.Color;


import ua.kn.nure.morozova.service.MathService;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MainWindow extends JFrame {
	private JTextField tfResult;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblOptima;
	private JLabel lblDaily;
	private JLabel lblEpsilon;
	private JLabel lblX;
	private JLabel lblX_1;
	private JLabel lblX_4;
	private JLabel lblX_8;
	private JLabel lblX_12;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JLabel lblMax;
	private JLabel label;
	private JLabel label_5;
	private JLabel label_9;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_12;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_13;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_10;
	private JLabel label_11;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;

	public MainWindow() {
		getContentPane().setBackground(new Color(255, 222, 173));
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(976, 775);
		setResizable(false);
		setLocation(100, 100);
		setTitle("SimplexMax");
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Матрасы");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(15, 16, 158, 43);
		getContentPane().add(lblNewLabel);

		JLabel lblFx = new JLabel("Доход F(x) =");
		lblFx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFx.setBounds(15, 78, 158, 43);
		getContentPane().add(lblFx);

		JLabel label_1 = new JLabel("Пружины");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(15, 151, 158, 43);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Ткань");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(15, 224, 158, 43);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Наполнитель");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(15, 302, 158, 43);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Нитки");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(15, 378, 158, 43);
		getContentPane().add(label_4);

		JButton btnCalculate = new JButton("Найти оптимальный план");
		btnCalculate.setForeground(new Color(0, 0, 0));
		btnCalculate.setBackground(new Color(0, 0, 0));
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Map<JTextField, String> inputAimValues = readAimValues();
				for (JTextField key : inputAimValues.keySet()) {
					key.setText(inputAimValues.get(key));
				}

				Map<JTextField, String> inputFirstRowValues = readFirstRowValues();
				for (JTextField key : inputFirstRowValues.keySet()) {
					key.setText(inputFirstRowValues.get(key));
				}

				Map<JTextField, String> inputSecondRowValues = readSecondRowValues();
				for (JTextField key : inputSecondRowValues.keySet()) {
					key.setText(inputSecondRowValues.get(key));
				}

				Map<JTextField, String> inputThirdRowValues = readThirdRowValues();
				for (JTextField key : inputThirdRowValues.keySet()) {
					key.setText(inputThirdRowValues.get(key));
				}

				Map<JTextField, String> inputFourthRowValues = readFourthRowValues();
				for (JTextField key : inputFourthRowValues.keySet()) {
					key.setText(inputFourthRowValues.get(key));
				}
				
				Map<JTextField, String> inputFifthRowValues = readFifthRowValues();
				for (JTextField key : inputFifthRowValues.keySet()) {
					key.setText(inputFifthRowValues.get(key));
				}

				Map<JComboBox, Object> inputComboBoxes = readComboBoxes();
				for (JComboBox key : inputComboBoxes.keySet()) {
					key.setSelectedItem(inputComboBoxes.get(key));
				}

				String outText = getResultAsText(inputAimValues, inputFirstRowValues, inputSecondRowValues,
						inputThirdRowValues, inputFourthRowValues, inputFifthRowValues, inputComboBoxes);
				tfResult.setText(outText);
				getContentPane().repaint();
			}
		});
		btnCalculate.setBounds(313, 505, 280, 29);
		getContentPane().add(btnCalculate);

		tfResult = new JTextField();
		tfResult.setForeground(new Color(255, 165, 0));
		tfResult.setBackground(new Color(255, 255, 255));
		tfResult.setEditable(false);
		tfResult.setBounds(15, 550, 940, 169);
		getContentPane().add(tfResult);
		tfResult.setColumns(10);

		textField = new JTextField();
		textField.setBounds(157, 88, 55, 26);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(266, 88, 55, 26);
		getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(379, 88, 55, 26);
		getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(498, 88, 55, 26);
		getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(608, 88, 55, 26);
		getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(157, 161, 55, 26);
		getContentPane().add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(266, 161, 55, 26);
		getContentPane().add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(379, 161, 55, 26);
		getContentPane().add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(498, 161, 55, 26);
		getContentPane().add(textField_8);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(608, 161, 55, 26);
		getContentPane().add(textField_9);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(157, 234, 55, 26);
		getContentPane().add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(266, 234, 55, 26);
		getContentPane().add(textField_11);

		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(379, 234, 55, 26);
		getContentPane().add(textField_12);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(498, 234, 55, 26);
		getContentPane().add(textField_13);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(608, 234, 55, 26);
		getContentPane().add(textField_14);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(157, 312, 55, 26);
		getContentPane().add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(266, 312, 55, 26);
		getContentPane().add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(379, 312, 55, 26);
		getContentPane().add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(498, 312, 55, 26);
		getContentPane().add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(608, 312, 55, 26);
		getContentPane().add(textField_19);

		lblOptima = new JLabel("Optima");
		lblOptima.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOptima.setBounds(157, 29, 69, 20);
		getContentPane().add(lblOptima);

		lblDaily = new JLabel("Daily");
		lblDaily.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDaily.setBounds(266, 29, 69, 20);
		getContentPane().add(lblDaily);

		lblEpsilon = new JLabel("Epsilon");
		lblEpsilon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEpsilon.setBounds(365, 29, 69, 20);
		getContentPane().add(lblEpsilon);

		lblX = new JLabel("x1 +");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX.setBounds(215, 91, 60, 20);
		getContentPane().add(lblX);

		lblX_1 = new JLabel("x2 +");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_1.setBounds(326, 90, 43, 20);
		getContentPane().add(lblX_1);

		lblX_4 = new JLabel("x3 +");
		lblX_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_4.setBounds(440, 90, 43, 20);
		getContentPane().add(lblX_4);

		lblX_8 = new JLabel("x4 +");
		lblX_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_8.setBounds(556, 90, 51, 20);
		getContentPane().add(lblX_8);

		lblX_12 = new JLabel("x5");
		lblX_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblX_12.setBounds(666, 90, 24, 20);
		getContentPane().add(lblX_12);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(157, 388, 55, 26);
		getContentPane().add(textField_20);

		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(266, 388, 55, 26);
		getContentPane().add(textField_21);

		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(379, 388, 55, 26);
		getContentPane().add(textField_22);

		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(498, 388, 55, 26);
		getContentPane().add(textField_23);

		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(608, 388, 55, 26);
		getContentPane().add(textField_24);

		lblMax = new JLabel("--> MAX");
		lblMax.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMax.setBounds(705, 89, 89, 20);
		getContentPane().add(lblMax);

		label = new JLabel("x1 +");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(215, 164, 60, 20);
		getContentPane().add(label);

		label_5 = new JLabel("x2 +");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(326, 164, 43, 20);
		getContentPane().add(label_5);

		label_9 = new JLabel("x3 +");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_9.setBounds(440, 164, 43, 20);
		getContentPane().add(label_9);

		label_14 = new JLabel("x4 +");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_14.setBounds(556, 164, 51, 20);
		getContentPane().add(label_14);

		label_15 = new JLabel("x5");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_15.setBounds(666, 164, 24, 20);
		getContentPane().add(label_15);

		label_16 = new JLabel("x1 +");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_16.setBounds(215, 236, 60, 20);
		getContentPane().add(label_16);

		label_12 = new JLabel("x2 +");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_12.setBounds(326, 237, 43, 20);
		getContentPane().add(label_12);

		label_17 = new JLabel("x3 +");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_17.setBounds(440, 237, 43, 20);
		getContentPane().add(label_17);

		label_18 = new JLabel("x4 +");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_18.setBounds(556, 237, 51, 20);
		getContentPane().add(label_18);

		label_19 = new JLabel("x5");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_19.setBounds(666, 237, 24, 20);
		getContentPane().add(label_19);

		label_13 = new JLabel("x1 +");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_13.setBounds(215, 315, 60, 20);
		getContentPane().add(label_13);

		label_20 = new JLabel("x2 +");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_20.setBounds(326, 314, 43, 20);
		getContentPane().add(label_20);

		label_21 = new JLabel("x3 +");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_21.setBounds(440, 315, 43, 20);
		getContentPane().add(label_21);

		label_22 = new JLabel("x4 +");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_22.setBounds(556, 315, 51, 20);
		getContentPane().add(label_22);

		label_23 = new JLabel("x5");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_23.setBounds(666, 315, 24, 20);
		getContentPane().add(label_23);

		label_6 = new JLabel("x1 +");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(215, 391, 60, 20);
		getContentPane().add(label_6);

		label_7 = new JLabel("x2 +");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(326, 391, 43, 20);
		getContentPane().add(label_7);

		label_8 = new JLabel("x3 +");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_8.setBounds(440, 391, 43, 20);
		getContentPane().add(label_8);

		label_10 = new JLabel("x4 +");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_10.setBounds(556, 391, 51, 20);
		getContentPane().add(label_10);

		label_11 = new JLabel("x5");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_11.setBounds(666, 391, 24, 20);
		getContentPane().add(label_11);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "<=", ">=", "=" }));
		comboBox.setToolTipText("");
		comboBox.setBounds(705, 161, 60, 26);
		getContentPane().add(comboBox);

		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "<=", ">=", "=" }));
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox_1.setBounds(705, 234, 60, 26);
		getContentPane().add(comboBox_1);

		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "<=", ">=", "=" }));
		comboBox_2.setToolTipText("");
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox_2.setBounds(705, 312, 60, 26);
		getContentPane().add(comboBox_2);

		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "<=", ">=", "=" }));
		comboBox_3.setToolTipText("");
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox_3.setBounds(705, 388, 60, 26);
		getContentPane().add(comboBox_3);

		textField_25 = new JTextField();
		textField_25.setBounds(780, 161, 80, 26);
		getContentPane().add(textField_25);
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(780, 234, 80, 26);
		getContentPane().add(textField_26);

		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(780, 312, 80, 26);
		getContentPane().add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(780, 388, 80, 26);
		getContentPane().add(textField_28);
		getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(157, 450, 55, 26);
		getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(266, 450, 55, 26);
		getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(379, 450, 55, 26);
		getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(498, 450, 55, 26);
		getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(608, 450, 55, 26);
		getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(780, 450, 80, 26);
		getContentPane().add(textField_34);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"<=", ">=", "="}));
		comboBox_4.setToolTipText("");
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		comboBox_4.setBounds(705, 450, 60, 26);
		getContentPane().add(comboBox_4);
		
		JLabel label_24 = new JLabel("x1 +");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_24.setBounds(215, 453, 60, 20);
		getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("x2 +");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_25.setBounds(326, 453, 43, 20);
		getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("x3 +");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_26.setBounds(440, 453, 43, 20);
		getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("x4 +");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_27.setBounds(556, 453, 51, 20);
		getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("x5");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_28.setBounds(666, 453, 24, 20);
		getContentPane().add(label_28);
		setVisible(true);

	}

	private String getResultAsText(Map<JTextField, String> inputAimValues, Map<JTextField, String> inputFirstRowValues,
			Map<JTextField, String> inputSecondRowValues, Map<JTextField, String> inputThirdRowValues,
			Map<JTextField, String> inputFourthRowValues, Map<JTextField, String> inputFifthRowValues, 
			Map<JComboBox, Object> inputComboBoxes) {

		List<Double> aimRow = getListFromMap(inputAimValues);
		
		for (JComboBox key : inputComboBoxes.keySet()) {
			String value = (String)inputComboBoxes.get(key);
			
			if(!value.equals("=")) {
				aimRow.add(0.0);				
			}
		}
		
		List<Double> firstRow = getListFromMap(inputFirstRowValues);
		List<Double> secondRow = getListFromMap(inputSecondRowValues);
		List<Double> thirdRow = getListFromMap(inputThirdRowValues);
		List<Double> fourthRow = getListFromMap(inputFourthRowValues);
		List<Double> fifthRow = getListFromMap(inputFifthRowValues);

		List<Double> additionalValues = getadditionalValues(inputComboBoxes);

		firstRow.add(5, additionalValues.get(0));
		secondRow.add(5, additionalValues.get(1));
		thirdRow.add(5, additionalValues.get(2));
		fourthRow.add(5, additionalValues.get(3));
		fifthRow.add(5, additionalValues.get(4));

		double[] aimRowArray = convertToArray(aimRow);
		double[] firstRowArray = convertToArray(firstRow);
		double[] secondRowArray = convertToArray(secondRow);
		double[] thirdRowArray = convertToArray(thirdRow);
		double[] fourthRowArray = convertToArray(fourthRow);
		double[] fifthRowArray = convertToArray(fifthRow);
		
		double[][] matrix = new double[][] {
			aimRowArray, firstRowArray, secondRowArray, thirdRowArray, fourthRowArray, fifthRowArray
		};
		
		for (double[] row : matrix) {
			for (double element : row) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
		MathService service = new MathService();
		return service.calculateResult(matrix);
	}

	private double[] convertToArray(List<Double> row) {
		double[] rowArray = new double[row.size()];

		for (int i = 0; i < row.size(); i++) {
			rowArray[i] = row.get(i);

		}

		return rowArray;
	}

	private List<Double> getadditionalValues(Map<JComboBox, Object> inputComboBoxes) {

		List<Double> doubleValues = new ArrayList<>();
		for (Entry<JComboBox, Object> entry : inputComboBoxes.entrySet()) { // пройтись по всем значениям Map

			if (!entry.getValue().equals(null)) {
				String value = (String) entry.getValue();
				if (value.equals("<=")) {
					doubleValues.add(1.0);
				} else if (value.equals(">=")) {			
					doubleValues.add(-1.0);
				} else if (value.equals("=")) {
					doubleValues.add(0.0);
				} else {
					doubleValues.add(0.0);
				}
			}
		}
		return doubleValues;
	}

	private List<Double> getListFromMap(Map<JTextField, String> inputValues) {
		List<Double> doubleValues = new ArrayList<>();
		for (Entry<JTextField, String> entry : inputValues.entrySet()) {

			if (!entry.getValue().equals(null) && !entry.getValue().equals("")) {
				doubleValues.add(Double.parseDouble(entry.getValue()));
			} else {
				doubleValues.add(0.0);
			}
		}
		return doubleValues;
	}

	private Map<JTextField, String> readFirstRowValues() {
		Map<JTextField, String> textFields = new LinkedHashMap<>();

		textFields.put(textField_5, textField_5.getText());
		textFields.put(textField_6, textField_6.getText());
		textFields.put(textField_7, textField_7.getText());
		textFields.put(textField_8, textField_8.getText());
		textFields.put(textField_9, textField_9.getText());

		textFields.put(textField_25, textField_25.getText());

		return textFields;
	}

	protected Map<JTextField, String> readSecondRowValues() {
		Map<JTextField, String> textFields = new LinkedHashMap<>();

		textFields.put(textField_10, textField_10.getText());
		textFields.put(textField_11, textField_11.getText());
		textFields.put(textField_12, textField_12.getText());
		textFields.put(textField_13, textField_13.getText());
		textFields.put(textField_14, textField_14.getText());

		textFields.put(textField_26, textField_26.getText());

		return textFields;
	}

	protected Map<JTextField, String> readThirdRowValues() {
		Map<JTextField, String> textFields = new LinkedHashMap<>();

		textFields.put(textField_15, textField_15.getText());
		textFields.put(textField_16, textField_16.getText());
		textFields.put(textField_17, textField_17.getText());
		textFields.put(textField_18, textField_18.getText());
		textFields.put(textField_19, textField_19.getText());

		textFields.put(textField_27, textField_27.getText());

		return textFields;
	}

	protected Map<JTextField, String> readFourthRowValues() {
		Map<JTextField, String> textFields = new LinkedHashMap<>();

		textFields.put(textField_20, textField_20.getText());
		textFields.put(textField_21, textField_21.getText());
		textFields.put(textField_22, textField_22.getText());
		textFields.put(textField_23, textField_23.getText());
		textFields.put(textField_24, textField_24.getText());

		textFields.put(textField_28, textField_28.getText());

		return textFields;
	}
	
	protected Map<JTextField, String> readFifthRowValues() {
		Map<JTextField, String> textFields = new LinkedHashMap<>();

		textFields.put(textField_29, textField_29.getText());
		textFields.put(textField_30, textField_30.getText());
		textFields.put(textField_31, textField_31.getText());
		textFields.put(textField_32, textField_32.getText());
		textFields.put(textField_33, textField_33.getText());

		textFields.put(textField_34, textField_34.getText());

		return textFields;
	}
	

	protected Map<JTextField, String> readAimValues() {

		Map<JTextField, String> textFields = new LinkedHashMap<>();
		textFields.put(textField, textField.getText());
		textFields.put(textField_1, textField_1.getText());
		textFields.put(textField_2, textField_2.getText());
		textFields.put(textField_3, textField_3.getText());
		textFields.put(textField_4, textField_4.getText());
		return textFields;
	}

	protected Map<JComboBox, Object> readComboBoxes() {
		Map<JComboBox, Object> comboBoxes = new LinkedHashMap<>();
		comboBoxes.put(comboBox, comboBox.getSelectedItem());
		comboBoxes.put(comboBox_1, comboBox_1.getSelectedItem());
		comboBoxes.put(comboBox_2, comboBox_2.getSelectedItem());
		comboBoxes.put(comboBox_3, comboBox_3.getSelectedItem());
		comboBoxes.put(comboBox_4, comboBox_4.getSelectedItem());
		return comboBoxes;
	}
}
