package edu.sdjzu.database.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StEvaluation {

    private String stuId;
    private String teacherId;
    private String during;
    private char rank;
    private String evaluation;

}
