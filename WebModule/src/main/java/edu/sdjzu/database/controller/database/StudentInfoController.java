package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.StudentInfoService;
import edu.sdjzu.database.model.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/studentInfo")
public class StudentInfoController {

    private final StudentInfoService studentInfoService;

    @Autowired
    public StudentInfoController(StudentInfoService studentInfoService) {
        this.studentInfoService = studentInfoService;
    }

    @RequestMapping("queryById")
    public StudentInfo queryById(String id){
        return studentInfoService.getStudentInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<StudentInfo> queryAll(){
        return studentInfoService.getAllStudentInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        studentInfoService.deleteStudentInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(StudentInfo studentInfo){
        studentInfoService.insertStudentInfo(studentInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(StudentInfo studentInfo){
        studentInfoService.updateStudentInfo(studentInfo);
        return "Operation successful!";
    }
}
