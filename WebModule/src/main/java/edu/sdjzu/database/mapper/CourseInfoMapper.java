package edu.sdjzu.database.mapper;

import edu.sdjzu.database.model.CourseInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseInfoMapper {

    List<CourseInfo> getAllCourseInfos();

    CourseInfo getCourseInfoById(String id);

    void deleteCourseInfoById(String id);

    void insertCourseInfo(CourseInfo courseInfo);

    void updateCourseInfo(CourseInfo courseInfo);

}