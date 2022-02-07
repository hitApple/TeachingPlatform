package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.ScSelectService;
import edu.sdjzu.database.mapper.ScSelectMapper;
import edu.sdjzu.database.model.ScSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScSelectServiceImpl implements ScSelectService {

    private final ScSelectMapper scSelectMapper;

    @Autowired
    public ScSelectServiceImpl(ScSelectMapper scSelectMapper) {
        this.scSelectMapper = scSelectMapper;
    }

    @Override
    public List<ScSelect> getAllScSelects() {
        return scSelectMapper.getAllScSelects();
    }

    @Override
    public ScSelect getScSelectById(String stuId, String courseId) {
        return scSelectMapper.getScSelectById(stuId, courseId);
    }

    @Override
    public void deleteScSelectById(String stuId, String courseId) {
        scSelectMapper.deleteScSelectById(stuId, courseId);
    }

    @Override
    public void insertScSelect(ScSelect scSelect) {
        scSelectMapper.insertScSelect(scSelect);
    }

    @Override
    public void updateScSelect(ScSelect scSelect) {
        scSelectMapper.updateScSelect(scSelect);
    }


}
