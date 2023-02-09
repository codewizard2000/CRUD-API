package net.rishavguides.springboot;

import net.rishavguides.springboot.exception.ResourceNotFoundException;
import net.rishavguides.springboot.model.Employee;
import net.rishavguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("rishav");
		employee.setLastName("raj");
		employee.setEmailId("rishavrajcpr@gmail.com");
		employeeRepository.save(employee);


		Employee employee1 = new Employee();
		employee1.setFirstName("piyush");
		employee1.setLastName("pawar");
		employee1.setEmailId("piyushcpr@gmail.com");
		employeeRepository.save(employee1);

	}

}
