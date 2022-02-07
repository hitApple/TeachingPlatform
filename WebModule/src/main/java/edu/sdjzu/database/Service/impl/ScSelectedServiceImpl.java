package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.ScSelectedService;
import edu.sdjzu.database.mapper.ScSelectedMapper;
import edu.sdjzu.database.model.ScSelected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScSelectedServiceImpl implements ScSelectedService {

    private final ScSelectedMapper scSelectedMapper;

    @Autowired
    public ScSelectedServiceImpl(ScSelectedMapper scSelectedMapper) {
        this.scSelectedMapper = scSelectedMapper;
    }

    @Override
    public List<ScSelected> getAllScSelected() {
        return scSelectedMapper.getAllScSelected();
    }

    @Override
    public ScSelected getScSelectedById(String stuId, String courseId) {
        return scSelectedMapper.getScSelectedById(stuId, courseId);
    }

    @Override
    public void deleteScSelectedById(String stuId, String courseId) {
        scSelectedMapper.deleteScSelectedById(stuId, courseId);
    }

    @Override
    public void insertScSelected(ScSelected scSelected) {
        scSelectedMapper.insertScSelected(scSelected);
    }

    @Override
    public void updateScSelected(ScSelected scSelected) {
        scSelectedMapper.updateScSelected(scSelected);
    }


}
