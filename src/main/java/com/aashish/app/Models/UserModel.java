package com.aashish.app.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class UserModel extends TestModel {
    @Id
    @GeneratedValue(generator = "id")
    @SequenceGenerator(
            name = "id",
            sequenceName = "id",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String name;

    @Column(columnDefinition = "text")
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
