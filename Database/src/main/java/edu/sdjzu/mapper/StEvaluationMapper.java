package edu.sdjzu.mapper;

import edu.sdjzu.model.StEvaluation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StEvaluationMapper {

    List<StEvaluation> getAllStEvaluations();

    StEvaluation getStEvaluationById(String stuId, String teacherId);

    void deleteStEvaluationById(String stuId, String teacherId);

    void insertStEvaluation(StEvaluation stEvaluation);

    void updateStEvaluation(StEvaluation stEvaluation);

}