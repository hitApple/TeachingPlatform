package edu.sdjzu.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Absence {

    private String stuId;
    private String courseId;
    private String teacherId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String reason;

}
