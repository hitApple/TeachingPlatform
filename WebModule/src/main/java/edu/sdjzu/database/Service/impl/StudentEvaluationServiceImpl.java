package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.StudentEvaluationService;
import edu.sdjzu.database.mapper.StudentEvaluationMapper;
import edu.sdjzu.database.model.StudentEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentEvaluationServiceImpl implements StudentEvaluationService {

    private final StudentEvaluationMapper studentEvaluationMapper;

    @Autowired
    public StudentEvaluationServiceImpl(StudentEvaluationMapper studentEvaluationMapper) {
        this.studentEvaluationMapper = studentEvaluationMapper;
    }

    @Override
    public List<StudentEvaluation> getAllStudentEvaluations() {
        return studentEvaluationMapper.getAllStudentEvaluations();
    }

    @Override
    public StudentEvaluation getStudentEvaluationById(String id) {
        return studentEvaluationMapper.getStudentEvaluationById(id);
    }

    @Override
    public void deleteStudentEvaluationById(String id) {
        studentEvaluationMapper.deleteStudentEvaluationById(id);
    }

    @Override
    public void insertStudentEvaluation(StudentEvaluation studentEvaluation) {
        studentEvaluationMapper.insertStudentEvaluation(studentEvaluation);
    }

    @Override
    public void updateStudentEvaluation(StudentEvaluation studentEvaluation) {
        studentEvaluationMapper.updateStudentEvaluation(studentEvaluation);
    }


}
