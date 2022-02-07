package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TcDifficulty {

    private String teacherId;
    private String courseId;
    private int score;
    private String advice;

}
