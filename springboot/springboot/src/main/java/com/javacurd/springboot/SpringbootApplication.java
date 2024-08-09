package com.javacurd.springboot;

import com.javacurd.springboot.model.Employee;
import com.javacurd.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Shubham");
		employee.setLastName("Wasade");
		employee.setEmailId("shubhamwasade@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Joy");
		employee1.setLastName("Roy");
		employee1.setEmailId("joyroy@gmail.com");
		employeeRepository.save(employee1);
	}
}
