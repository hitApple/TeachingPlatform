package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class TeacherInfo {

    private String id;
    private String dept;
    private String gender;
    private String duty;
    private String direction;

}
