package edu.sdjzu.Service;

import edu.sdjzu.model.CourseInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CourseInfoService {

    List<CourseInfo> getAllCourseInfos();

    CourseInfo getCourseInfoById(String id);

    void deleteCourseInfoById(String id);

    void insertCourseInfo(CourseInfo courseInfo);

    void updateCourseInfo(CourseInfo courseInfo);


}
