package org.example.SpringConnectDatabase.student;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Student {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String fullName;

    @Column(unique = true)
    private String studentCode;

    @Column(unique = true)
    private String nationalCode;


}
