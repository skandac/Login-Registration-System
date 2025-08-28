package com.example.demo.security.config;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AuditLogService {
    // If using JPA, inject AuditLogRepository here

    public void log(String username, String action, String details) {
        // For database: save to repository
        // For now, just print to console
        System.out.printf("[%s] User: %s | Action: %s | Details: %s%n",
                LocalDateTime.now(), username, action, details);
    }
}