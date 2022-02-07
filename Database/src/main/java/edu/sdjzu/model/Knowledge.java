package edu.sdjzu.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Knowledge {

    private String id;
    private String category;
    private String title;
    private String description;

}
