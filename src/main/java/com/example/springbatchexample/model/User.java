package com.example.springbatchexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="userA")
public class User {

    @Id
    private Long id;
    private String name;
    private String dept;
    private Integer salary;
    private Date timestamp;
}
