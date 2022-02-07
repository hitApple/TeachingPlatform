package edu.sdjzu.mapper;

import edu.sdjzu.model.StudentEvaluation;
import edu.sdjzu.model.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentEvaluationMapper {

    List<StudentEvaluation> getAllStudentEvaluations();

    StudentEvaluation getStudentEvaluationById(String id);

    void deleteStudentEvaluationById(String id);

    void insertStudentEvaluation(StudentEvaluation studentEvaluation);

    void updateStudentEvaluation(StudentEvaluation studentEvaluation);

}