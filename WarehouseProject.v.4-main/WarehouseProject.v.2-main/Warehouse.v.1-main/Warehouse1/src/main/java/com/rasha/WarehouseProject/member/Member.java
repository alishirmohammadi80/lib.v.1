package com.rasha.WarehouseProject.member;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rasha.WarehouseProject.book.Book;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Member_tbl")
public class Member implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
private Long id;

 private  String firstName;

 private String lastName;

 private Date dateOfBirth;
@Column(unique = true)
 private Long nationalCode;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
      @JsonIgnore

    private List<Book> books;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Long getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Long nationalCode) {
        this.nationalCode = nationalCode;
    }
}
