package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentInfo {

    private String id;
    private String className;
    private String faculty;
    private String duty;

}
