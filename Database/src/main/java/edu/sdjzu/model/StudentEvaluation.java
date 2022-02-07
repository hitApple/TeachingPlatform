package edu.sdjzu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class StudentEvaluation {

    private String id;
    private String during;
    private char rank;
    private String evaluation;
    private char isSchool;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;

}
