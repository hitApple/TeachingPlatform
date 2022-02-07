package edu.sdjzu.database.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ScSelect {

    private String stuId;
    private String courseId;
    private String during;
    private char isNecessary;
    private char isRecommend;
    private String selectReason;

}
