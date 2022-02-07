package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.StudentEvaluation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface StudentEvaluationService {

    List<StudentEvaluation> getAllStudentEvaluations();

    StudentEvaluation getStudentEvaluationById(String id);

    void deleteStudentEvaluationById(String id);

    void insertStudentEvaluation(StudentEvaluation studentEvaluation);

    void updateStudentEvaluation(StudentEvaluation studentEvaluation);


}
