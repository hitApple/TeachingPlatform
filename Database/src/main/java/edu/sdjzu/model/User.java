package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {

    private String id;
    private String username;
    private String password;
    private String role;


}
