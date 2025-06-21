package service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import entity.Employee;

public class CSVGenerationService {
	
	public static void generateCsv(List<Employee> employee, String path) throws IOException {
		
		try(FileWriter writer = new FileWriter(path)){
			writer.append("Name, Age, Email, ContactNumber,Address\n");
			
			for(Employee emp: employee) {
				writer.append(emp.getName()).append(",");
				writer.append(String.valueOf(emp.getAge())).append(",");
				writer.append(emp.getEmail()).append(",");
				writer.append(emp.getPhoneNumber()).append(",");
				writer.append(emp.getAddress()).append("\n");
			}
			System.out.println("CSV file generated: " + path);
			
		}catch(IOException ex) {
			ex.getStackTrace();
		}
	}


}
