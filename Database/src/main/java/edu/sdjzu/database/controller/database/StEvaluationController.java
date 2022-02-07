package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.StEvaluationService;
import edu.sdjzu.database.model.StEvaluation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/stEvaluation")
public class StEvaluationController {

    private final StEvaluationService stEvaluationService;

    @Autowired
    public StEvaluationController(StEvaluationService stEvaluationService) {
        this.stEvaluationService = stEvaluationService;
    }

    @RequestMapping("queryById")
    public StEvaluation queryById(String stuId, String teacherId){
        return stEvaluationService.getStEvaluationById(stuId, teacherId);
    }

    @RequestMapping("queryAll")
    public List<StEvaluation> queryAll(){
        return stEvaluationService.getAllStEvaluations();
    }

    @RequestMapping("delete")
    public String delete(String stuId, String teacherId){
        stEvaluationService.deleteStEvaluationById(stuId, teacherId);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(StEvaluation stEvaluation){
        stEvaluationService.insertStEvaluation(stEvaluation);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(StEvaluation stEvaluation){
        stEvaluationService.updateStEvaluation(stEvaluation);
        return "Operation successful!";
    }
}
