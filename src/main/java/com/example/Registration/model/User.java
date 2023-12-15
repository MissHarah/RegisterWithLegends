package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.Setter;

@Entity
@Setter
@Table(name = "User")

public class User {
    @Id

    private long id;
    private String name;
    private String Email;
    private String password;
}
