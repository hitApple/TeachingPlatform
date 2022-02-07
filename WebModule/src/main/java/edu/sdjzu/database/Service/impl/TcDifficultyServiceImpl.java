package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.TcDifficultyService;
import edu.sdjzu.database.mapper.TcDifficultyMapper;
import edu.sdjzu.database.model.TcDifficulty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TcDifficultyServiceImpl implements TcDifficultyService {

    private final TcDifficultyMapper tcDifficultyMapper;

    @Autowired
    public TcDifficultyServiceImpl(TcDifficultyMapper tcDifficultyMapper) {
        this.tcDifficultyMapper = tcDifficultyMapper;
    }

    @Override
    public List<TcDifficulty> getAllTcDifficulty() {
        return tcDifficultyMapper.getAllTcDifficultys();
    }

    @Override
    public TcDifficulty getTcDifficultyById(String teacherId, String courseId) {
        return tcDifficultyMapper.getTcDifficultyById(teacherId, courseId);
    }

    @Override
    public void deleteTcDifficultyById(String teacherId, String courseId) {
        tcDifficultyMapper.deleteTcDifficultyById(teacherId, courseId);
    }

    @Override
    public void insertTcDifficulty(TcDifficulty tcDifficulty) {
        tcDifficultyMapper.insertTcDifficulty(tcDifficulty);
    }

    @Override
    public void updateTcDifficulty(TcDifficulty tcDifficulty) {
        tcDifficultyMapper.updateTcDifficulty(tcDifficulty);
    }


}
