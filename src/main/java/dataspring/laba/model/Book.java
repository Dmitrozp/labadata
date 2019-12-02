package dataspring.laba.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "pages", nullable = false)
    private Integer pagesCount;

//    @Column
//    private Year releaseDate;

    @Column
    private String booking;

}
