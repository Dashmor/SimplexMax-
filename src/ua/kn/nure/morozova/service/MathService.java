package ua.kn.nure.morozova.service;

import java.util.HashMap;
import java.util.Map;

public class MathService {

	public String calculateResult(double[][] matrix) {

		Map<Integer, Integer> indexes = new HashMap<>();

		double[][] converteMatrix = matrix;

		int counter = 0;

		do {
			converteMatrix[0] = convertRowToNegative(converteMatrix[0]);

			Integer columnIndex = getBaseColumnIndex(converteMatrix[0]); // inspect aim function

//			checkMatrix(converteMatrix);

			Integer rowIndex = getBaseRowIndex(converteMatrix, columnIndex);

			converteMatrix[rowIndex] = convertRowByDivisionByBaseElement(converteMatrix[rowIndex], columnIndex);

//			checkMatrix(converteMatrix);

			converteMatrix = getConvertedMetrixWithRowsDevidedOnBaseElement(converteMatrix, rowIndex, columnIndex);

//			checkMatrix(converteMatrix);

			indexes.put(columnIndex, rowIndex);

			counter++;
		} while (allElementsNotOverZero(converteMatrix[0]) && counter < 5);

		for (int i = 0; i < 5; i++) {
			if( indexes.get(i)!=null ) {
				System.out.println("x*i = " + i + " and has value " + matrix[indexes.get(i)][matrix[indexes.get(i)].length-1]);
			}
		}
		return "";
	}

	private boolean allElementsNotOverZero(double[] row) {
		for (double element : row) {
			if (element < 0.0) {
				return true;
			}
		}
		return false;
	}

	private double[][] getConvertedMetrixWithRowsDevidedOnBaseElement(double[][] matrix, Integer rowIndex,
			Integer columnIndex) {

		double[][] convertedMatrix = new double[matrix.length][];

		for (int i = 0; i < matrix.length; i++) { // inspect rows
			double[] baseRow = new double[matrix[rowIndex].length];

			if (i != rowIndex) {

				// inspected row
				double[] row = matrix[i];

				for (int j = 0; j < baseRow.length; j++) { // modify elements in row
					baseRow[j] = -1 * matrix[rowIndex][j];
					baseRow[j] *= row[columnIndex];
					baseRow[j] += row[j];
				}

				convertedMatrix[i] = baseRow;
			} else {
				convertedMatrix[i] = matrix[rowIndex];
			}
		}
		return convertedMatrix;
	}

	private double[] convertRowByDivisionByBaseElement(double[] row, Integer index) {
		double[] convertedRow = new double[row.length];
		for (int i = 0; i < convertedRow.length; i++) {
			convertedRow[i] = row[i] / row[index];

		}
		return convertedRow;
	}

	private Integer getBaseRowIndex(double[][] converteMatrix, Integer columnIndex) {
		Integer index = null;

		Double minValue = Double.MAX_VALUE;
		for (int i = 1; i < converteMatrix.length; i++) {
			double[] row = converteMatrix[i];
			double baseRowElement = row[columnIndex];
			if (minValue > (row[row.length - 1] / baseRowElement)) {
				minValue = row[row.length - 1] / baseRowElement;
				index = i;
			}
		}
		return index;
	}

	private Integer getBaseColumnIndex(double[] row) {
		Integer index = null;
		Double minValue = Double.MAX_VALUE;
		for (int i = 0; i < row.length; i++) {
			if (minValue > row[i]) {
				minValue = row[i];
				index = new Integer(i);
			}
		}
		return index;
	}

	private void checkMatrix(double[][] matrix) {
		for (double[] row : matrix) {
			for (double element : row) {
				System.out.print(element + ", ");
			}
			System.out.println();
		}
		System.out.println("------------------//------------------");
	}

	private double[] convertRowToNegative(double[] row) {
		
		for (int i = 0; i < row.length; i++) {
			if (row[i] != 0.0) {
				row[i] = -1 * row[i];
			}
		}
		return row;
	}

}
