package com.akash.SpringJDBCEx;

import com.akash.SpringJDBCEx.model.Student;
import com.akash.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(SpringJdbcExApplication.class, args);

        Student s = context.getBean(Student.class);
        s.setRollNo(104);
        s.setName("Akash");
        s.setMarks(92);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students=service.getStudents();
        System.out.println(students);

    }

}
