package edu.sdjzu.mapper;

import edu.sdjzu.model.ScSelected;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScSelectedMapper {

    List<ScSelected> getAllScSelected();

    ScSelected getScSelectedById(String stuId, String courseId);

    void deleteScSelectedById(String stuId, String courseId);

    void insertScSelected(ScSelected scSelected);

    void updateScSelected(ScSelected scSelected);

}