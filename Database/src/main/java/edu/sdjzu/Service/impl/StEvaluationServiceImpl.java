package edu.sdjzu.Service.impl;

import edu.sdjzu.Service.StEvaluationService;
import edu.sdjzu.mapper.StEvaluationMapper;
import edu.sdjzu.model.StEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StEvaluationServiceImpl implements StEvaluationService {

    private final StEvaluationMapper stEvaluationMapper;

    @Autowired
    public StEvaluationServiceImpl(StEvaluationMapper stEvaluationMapper) {
        this.stEvaluationMapper = stEvaluationMapper;
    }

    @Override
    public List<StEvaluation> getAllStEvaluations() {
        return stEvaluationMapper.getAllStEvaluations();
    }

    @Override
    public StEvaluation getStEvaluationById(String stuId, String teacherId) {
        return stEvaluationMapper.getStEvaluationById(stuId, teacherId);
    }

    @Override
    public void deleteStEvaluationById(String stuId, String teacherId) {
        stEvaluationMapper.deleteStEvaluationById(stuId, teacherId);
    }

    @Override
    public void insertStEvaluation(StEvaluation stEvaluation) {
        stEvaluationMapper.insertStEvaluation(stEvaluation);
    }

    @Override
    public void updateStEvaluation(StEvaluation stEvaluation) {
        stEvaluationMapper.updateStEvaluation(stEvaluation);
    }


}
