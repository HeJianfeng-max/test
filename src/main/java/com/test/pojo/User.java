package com.test.pojo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TEST_USER")
@Data
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_AGE")
    private Integer userAge;

}
