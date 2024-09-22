package org.jsp.SpringJdbc1;

import org.jsp.SpringJdbc1.model.Student;
import org.jsp.SpringJdbc1.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbc1Application.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(106);
		s.setName("shubham");
		s.setMarks(69);

		StudentService service = context.getBean(StudentService.class);
		service.addStudents(s);

		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
