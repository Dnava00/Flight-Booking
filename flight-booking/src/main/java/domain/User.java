package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "Email", length = 100, nullable = false)
    private String email;

    @Column(name = "Pwd", nullable = false)
    private String pwd;

    @Column(name = "Event_timestamp")
    private LocalDateTime eventTime; 

    @Column(name = "Birth")
    private LocalDate birth;

    @Column(name = "Name")
    private String name;



}
