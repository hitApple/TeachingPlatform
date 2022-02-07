package edu.sdjzu.controller.database;

import edu.sdjzu.Service.CourseInfoService;
import edu.sdjzu.model.CourseInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/courseInfo")
public class CourseInfoController {

    private final CourseInfoService courseInfoService;

    @Autowired
    public CourseInfoController(CourseInfoService courseInfoService) {
        this.courseInfoService = courseInfoService;
    }

    @RequestMapping("queryById")
    public CourseInfo queryById(String id){
        return courseInfoService.getCourseInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<CourseInfo> queryAll(){
        return courseInfoService.getAllCourseInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        courseInfoService.deleteCourseInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(CourseInfo courseInfo){
        courseInfoService.insertCourseInfo(courseInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(CourseInfo courseInfo){
        courseInfoService.updateCourseInfo(courseInfo);
        return "Operation successful!";
    }
}
