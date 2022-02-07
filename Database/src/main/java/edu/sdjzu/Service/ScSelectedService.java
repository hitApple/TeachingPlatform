package edu.sdjzu.Service;

import edu.sdjzu.model.ScSelected;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ScSelectedService {

    List<ScSelected> getAllScSelected();

    ScSelected getScSelectedById(String stuId, String courseId);

    void deleteScSelectedById(String stuId, String courseId);

    void insertScSelected(ScSelected scSelected);

    void updateScSelected(ScSelected scSelected);


}
