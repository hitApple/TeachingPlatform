package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.StudentEvaluationService;
import edu.sdjzu.database.model.StudentEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/studentEvaluation")
public class StudentEvaluationController {

    private final StudentEvaluationService studentEvaluationService;

    @Autowired
    public StudentEvaluationController(StudentEvaluationService studentEvaluationService) {
        this.studentEvaluationService = studentEvaluationService;
    }

    @RequestMapping("queryById")
    public StudentEvaluation queryById(String id){
        return studentEvaluationService.getStudentEvaluationById(id);
    }

    @RequestMapping("queryAll")
    public List<StudentEvaluation> queryAll(){
        return studentEvaluationService.getAllStudentEvaluations();
    }

    @RequestMapping("delete")
    public String delete(String id){
        studentEvaluationService.deleteStudentEvaluationById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(StudentEvaluation studentEvaluation){
        studentEvaluationService.insertStudentEvaluation(studentEvaluation);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(StudentEvaluation studentEvaluation){
        studentEvaluationService.updateStudentEvaluation(studentEvaluation);
        return "Operation successful!";
    }
}
