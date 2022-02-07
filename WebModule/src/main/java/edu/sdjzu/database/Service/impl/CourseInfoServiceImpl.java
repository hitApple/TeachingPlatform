package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.CourseInfoService;
import edu.sdjzu.database.mapper.CourseInfoMapper;
import edu.sdjzu.database.model.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseInfoServiceImpl implements CourseInfoService {

    private final CourseInfoMapper courseInfoMapper;

    @Autowired
    public CourseInfoServiceImpl(CourseInfoMapper courseInfoMapper) {
        this.courseInfoMapper = courseInfoMapper;
    }

    @Override
    public List<CourseInfo> getAllCourseInfos() {
        return courseInfoMapper.getAllCourseInfos();
    }

    @Override
    public CourseInfo getCourseInfoById(String id) {
        return courseInfoMapper.getCourseInfoById(id);
    }

    @Override
    public void deleteCourseInfoById(String id) {
        courseInfoMapper.deleteCourseInfoById(id);
    }

    @Override
    public void insertCourseInfo(CourseInfo courseInfo) {
        courseInfoMapper.insertCourseInfo(courseInfo);
    }

    @Override
    public void updateCourseInfo(CourseInfo courseInfo) {
        courseInfoMapper.updateCourseInfo(courseInfo);
    }


}
