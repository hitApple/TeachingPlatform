package edu.sdjzu.mapper;

import edu.sdjzu.model.StudentInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentInfoMapper {

    List<StudentInfo> getAllStudentInfos();

    StudentInfo getStudentInfoById(String id);

    void deleteStudentInfoById(String id);

    void insertStudentInfo(StudentInfo studentInfo);

    void updateStudentInfo(StudentInfo studentInfo);

}