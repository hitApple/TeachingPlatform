package edu.sdjzu.controller.database;

import edu.sdjzu.Service.TeacherInfoService;
import edu.sdjzu.model.TeacherInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/teacherInfo")
public class TeacherInfoController {

    private final TeacherInfoService teacherInfoService;

    @Autowired
    public TeacherInfoController(TeacherInfoService teacherInfoService) {
        this.teacherInfoService = teacherInfoService;
    }

    @RequestMapping("queryById")
    public TeacherInfo queryById(String id){
        return teacherInfoService.getTeacherInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<TeacherInfo> queryAll(){
        return teacherInfoService.getAllTeacherInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        teacherInfoService.deleteTeacherInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(TeacherInfo teacherInfo){
        teacherInfoService.insertTeacherInfo(teacherInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(TeacherInfo teacherInfo){
        teacherInfoService.updateTeacherInfo(teacherInfo);
        return "Operation successful!";
    }
}
