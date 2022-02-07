package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.StudentInfoService;
import edu.sdjzu.database.mapper.StudentInfoMapper;
import edu.sdjzu.database.model.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

    private final StudentInfoMapper studentInfoMapper;

    @Autowired
    public StudentInfoServiceImpl(StudentInfoMapper studentInfoMapper) {
        this.studentInfoMapper = studentInfoMapper;
    }

    @Override
    public List<StudentInfo> getAllStudentInfos() {
        return studentInfoMapper.getAllStudentInfos();
    }

    @Override
    public StudentInfo getStudentInfoById(String id) {
        return studentInfoMapper.getStudentInfoById(id);
    }

    @Override
    public void deleteStudentInfoById(String id) {
        studentInfoMapper.deleteStudentInfoById(id);
    }

    @Override
    public void insertStudentInfo(StudentInfo studentInfo) {
        studentInfoMapper.insertStudentInfo(studentInfo);
    }

    @Override
    public void updateStudentInfo(StudentInfo studentInfo) {
        studentInfoMapper.updateStudentInfo(studentInfo);
    }


}
