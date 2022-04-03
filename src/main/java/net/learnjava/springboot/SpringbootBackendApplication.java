package net.learnjava.springboot;

import net.learnjava.springboot.model.Employee;
import net.learnjava.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Ana");
//		employee.setLastName("Susan");
//		employee.setEmailId("as@mail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Lily");
//		employee1.setLastName("Ana");
//		employee1.setEmailId("ln@mail.com");
//		employeeRepository.save(employee1);
	}
}
