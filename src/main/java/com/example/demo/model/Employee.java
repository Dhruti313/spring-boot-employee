package com.example.demo.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private  String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name= "email_id")
    private String emailId;
    @Column(name= "created_at")
    @CreatedDate
    @CreationTimestamp
    private long createdAt;
    @Column(name= "updated_at")
    @LastModifiedDate
    @UpdateTimestamp
    private long updatedAt;


}
