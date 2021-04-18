package com.tek.studentManager.model;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Student implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name ;
    private String email;
    private String className;
    private String phone;
    private String imageUrl;
    @Column(nullable = false,updatable = false)
    private String studentCode;
}
