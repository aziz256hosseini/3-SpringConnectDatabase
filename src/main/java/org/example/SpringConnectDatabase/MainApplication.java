package org.example.SpringConnectDatabase;


import org.example.SpringConnectDatabase.student.Student;
import org.example.SpringConnectDatabase.student.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class MainApplication implements ApplicationRunner {

    @Autowired
    StudentRepository studentRepository;


    public static void main(String[] args) {

        SpringApplication.run(MainApplication.class);


    }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Student student = new Student();
        student.setFullName("Aziz Hosseini");
        student.setNationalCode("222");
        student.setStudentCode("111");


        Student savedStudent = studentRepository.save(student);

        List<Student> studentList = (List<Student>) studentRepository.findAll();

        Optional <Student> optionalStudent = studentRepository.findById(1l);


        System.out.println();

    }
}
