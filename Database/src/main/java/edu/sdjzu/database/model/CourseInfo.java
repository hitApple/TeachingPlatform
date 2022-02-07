package edu.sdjzu.database.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CourseInfo {

    private String id;
    private String name;
    private String teacher;
    private int classHour;
    private int credit;
    private String category;
    private String classroom;
    private char isOptional;

}
