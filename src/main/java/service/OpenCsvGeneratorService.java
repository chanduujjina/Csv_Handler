package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import entity.Employee;

public class OpenCsvGeneratorService {
	
	public static void generateCSV(List<Employee> employee, String path) throws IOException {
		try(FileWriter writer = new FileWriter(path);
				
				CSVPrinter csvPrinter = new CSVPrinter(writer, 
						CSVFormat.DEFAULT.withHeader("Name", "Age", "Email", "ContactNumber","Address"))){
			
			for(Employee emp: employee) {
				csvPrinter.printRecord(emp.getName(), emp.getAge(), emp.getEmail(), emp.getPhoneNumber(), emp.getAddress());
			}
			System.out.println("CSV generated: "+ path);
		}catch(IOException ex) {
			ex.getStackTrace();
		}
	}



}
