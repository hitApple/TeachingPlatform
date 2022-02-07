package edu.sdjzu.Service;

import edu.sdjzu.model.TeacherInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TeacherInfoService {

    List<TeacherInfo> getAllTeacherInfos();

    TeacherInfo getTeacherInfoById(String id);

    void deleteTeacherInfoById(String id);

    void insertTeacherInfo(TeacherInfo teacherInfo);

    void updateTeacherInfo(TeacherInfo teacherInfo);


}
