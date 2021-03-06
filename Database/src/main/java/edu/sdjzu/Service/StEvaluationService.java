package edu.sdjzu.Service;

import edu.sdjzu.model.StEvaluation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface StEvaluationService {

    List<StEvaluation> getAllStEvaluations();

    StEvaluation getStEvaluationById(String stuId, String teacherId);

    void deleteStEvaluationById(String stuId, String teacherId);

    void insertStEvaluation(StEvaluation stEvaluation);

    void updateStEvaluation(StEvaluation stEvaluation);


}
