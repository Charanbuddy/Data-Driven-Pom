package org.test1;

import java.io.IOException;

public class DataDriven01 extends BaseMethods {

	public static void main(String[] args) throws IOException {

		//Create excel sheet with details of  10 students name and  courses.

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 1, 0, "charan");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 1, 1, "Java");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 2, 0, "RamKumar");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 2, 1, "Selenium");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 3, 0, "KuttyPayan");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 3, 1, "Junit");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 4, 0, "Manmadhan");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 4, 1, "Robot");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 5, 0, "Manmadhan");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 5, 1, "Robot");
		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 6, 0, "Udesh");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 6, 1, "Action");
		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 7, 0, "Ajay");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 7, 1, "Python");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 8, 0, "Aravind");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 8, 1, "C++");
		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 9, 0, "Praveen");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 9, 1, "POM");
		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 10, 0, "Priya");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 10, 1, "Inheritance");

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 11, 0, "Moorthy");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 11, 1, "Maven");
		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 11, 2, "Maven");

		// QUESTION 1
		// -----------
		// NOTE: Find the Total number of Rows and Total number of cells in excel sheet.

		getRowAndCellCount("C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails");

		// QUESTION 2
		// ----------
		// NOTE: Print all the data present in excel sheet.

		printAllValues("C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails");

		// QUESTION 3
		// ----------
		// NOTE: Insert one new row in the excel sheet.

		writeDataToParticularCell(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 12, 0, "jagan");

		writeDataToParticularCellWithoutNewRow(
				"C:\\Users\\acer\\eclipse-workspace\\DataDrivenFrameWork\\Excel Folder\\StudentDetails.xlsx",
				"StDetails", 12, 1, "c");

	}

}
