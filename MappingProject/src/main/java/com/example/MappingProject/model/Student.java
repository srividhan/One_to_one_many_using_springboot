package com.example.MappingProject.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "student_id")
    private Long studId;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    public Student() {
    }
    
    public Student(String name, int age, List<Address> address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public Long getStudId() {
        return studId;
    }

    public void setStudId(Long studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Student [studId=" + studId + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "addressId")
    // private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",referencedColumnName = "student_id")
    private List<Address> address;
}
