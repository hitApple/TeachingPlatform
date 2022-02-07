package edu.sdjzu.database.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ScSelected {

    private String stuId;
    private String courseId;
    private String during;
    private float score;
    private String evaluation;
    private char isQualified;

}
