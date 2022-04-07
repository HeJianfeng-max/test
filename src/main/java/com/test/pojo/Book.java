package com.test.pojo;

import javax.persistence.*;

@Entity
@Table(name = "TEST_BOOK")
public class Book {

    @Id
    @Column(name = "BOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(name = "BOOK_NAME")
    private String bookName;

    @Column(name = "PRICE")
    private Integer price;
}
