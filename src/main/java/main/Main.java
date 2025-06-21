package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import entity.Employee;
import service.CSVGenerationService;
import service.OpenCsvGeneratorService;

public class Main {

public static void main(String[] args) throws IOException {
		
		List<Employee> employees = Arrays.asList(
				new Employee("Raj kumar", 24, "raju@gmail", "1234567890", "Hyd, 500032"),
				new Employee("Ramu", 24, "ramu@gmail", "1234567890", "wgl"),
				new Employee("Nani", 24, "nani@gmail", "1234567890", "Hyd"),
				new Employee("Pandu", 24, "pandu@gmail", "1234567890", "Hyd"));
		//using java IO
		CSVGenerationService.generateCsv(employees, "employee.csv");
		
		//Using apache commons csv
		OpenCsvGeneratorService.generateCSV(employees, "employees_open_csv.csv");

	}

}
