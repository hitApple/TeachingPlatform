package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.TeacherInfoService;
import edu.sdjzu.database.mapper.TeacherInfoMapper;
import edu.sdjzu.database.model.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherInfoServiceImpl implements TeacherInfoService {

    private final TeacherInfoMapper teacherInfoMapper;

    @Autowired
    public TeacherInfoServiceImpl(TeacherInfoMapper teacherInfoMapper) {
        this.teacherInfoMapper = teacherInfoMapper;
    }

    @Override
    public List<TeacherInfo> getAllTeacherInfos() {
        return teacherInfoMapper.getAllTeacherInfos();
    }

    @Override
    public TeacherInfo getTeacherInfoById(String id) {
        return teacherInfoMapper.getTeacherInfoById(id);
    }

    @Override
    public void deleteTeacherInfoById(String id) {
        teacherInfoMapper.deleteTeacherInfoById(id);
    }

    @Override
    public void insertTeacherInfo(TeacherInfo teacherInfo) {
        teacherInfoMapper.insertTeacherInfo(teacherInfo);
    }

    @Override
    public void updateTeacherInfo(TeacherInfo teacherInfo) {
        teacherInfoMapper.updateTeacherInfo(teacherInfo);
    }


}
