package com.example.demo.security.config;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String action;
    private String details;
    private LocalDateTime timestamp;

    // getters and setters
}