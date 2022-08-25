package org.example.SpringConnectDatabase.student;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

// baraye taamol ba database
public interface StudentRepository extends PagingAndSortingRepository <Student,Long> {

    List<Student> findAllByFullNameContaining (String fillName);
    List<Student> findAllByFullNameEquals (String name);
    List<Student> findAllByNationalCode(String nationalCode);






}
