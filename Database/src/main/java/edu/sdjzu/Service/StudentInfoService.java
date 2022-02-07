package edu.sdjzu.Service;

import edu.sdjzu.model.StudentInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface StudentInfoService {

    List<StudentInfo> getAllStudentInfos();

    StudentInfo getStudentInfoById(String id);

    void deleteStudentInfoById(String id);

    void insertStudentInfo(StudentInfo studentInfo);

    void updateStudentInfo(StudentInfo studentInfo);


}
