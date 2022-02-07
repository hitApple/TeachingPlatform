package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class VideoInfo {

    private String id;
    private String name;
    private String category;
    private int time;
    private String introduction;
    private String isNecessarily;
    private String url;

}
