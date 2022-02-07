package edu.sdjzu.mapper;

import edu.sdjzu.model.TeacherInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherInfoMapper {

    List<TeacherInfo> getAllTeacherInfos();

    TeacherInfo getTeacherInfoById(String id);

    void deleteTeacherInfoById(String id);

    void insertTeacherInfo(TeacherInfo teacherInfo);

    void updateTeacherInfo(TeacherInfo teacherInfo);

}