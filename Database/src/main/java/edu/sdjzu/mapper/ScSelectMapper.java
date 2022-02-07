package edu.sdjzu.mapper;

import edu.sdjzu.model.ScSelect;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScSelectMapper {

    List<ScSelect> getAllScSelects();

    ScSelect getScSelectById(String stuId, String courseId);

    void deleteScSelectById(String stuId, String courseId);

    void insertScSelect(ScSelect scSelect);

    void updateScSelect(ScSelect scSelect);

}