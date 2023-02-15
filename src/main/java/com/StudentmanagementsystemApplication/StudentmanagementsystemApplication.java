package com.StudentmanagementsystemApplication;

import com.StudentmanagementsystemApplication.entity.student;
import com.StudentmanagementsystemApplication.repository.studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Autowired
	private studentrepository studentrepos;
	@Override
	public void run(String... args) throws Exception {
//		student s1 = new student("sakshi","tiwari","sakashi@gmail.com");
//		studentrepos.save(s1);
//		student s2 = new student("latika","verma","latika@gmail.com");
//		studentrepos.save(s2);
//		student s3 = new student("vishakha","yadav","vishakha@gmail.com");
//		studentrepos.save(s3);
	}
}
