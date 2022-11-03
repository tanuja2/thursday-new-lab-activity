package com.HqlPractice;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
private String name;
@Id
private int id;
private int salary;


}
