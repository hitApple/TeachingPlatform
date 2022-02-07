package edu.sdjzu.Service;

import edu.sdjzu.model.ScSelect;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ScSelectService {

    List<ScSelect> getAllScSelects();

    ScSelect getScSelectById(String stuId, String courseId);

    void deleteScSelectById(String stuId, String courseId);

    void insertScSelect(ScSelect scSelect);

    void updateScSelect(ScSelect scSelect);


}
