package edu.sdjzu.controller.database;

import edu.sdjzu.Service.ScSelectService;
import edu.sdjzu.model.ScSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/scSelect")
public class ScSelectController {

    private final ScSelectService scSelectService;

    @Autowired
    public ScSelectController(ScSelectService scSelectService) {
        this.scSelectService = scSelectService;
    }

    @RequestMapping("queryById")
    public ScSelect queryById(String stuId, String courseId){
        return scSelectService.getScSelectById(stuId, courseId);
    }

    @RequestMapping("queryAll")
    public List<ScSelect> queryAll(){
        return scSelectService.getAllScSelects();
    }

    @RequestMapping("delete")
    public String delete(String stuId, String courseId){
        scSelectService.deleteScSelectById(stuId, courseId);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(ScSelect scSelect){
        scSelectService.insertScSelect(scSelect);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(ScSelect scSelect){
        scSelectService.updateScSelect(scSelect);
        return "Operation successful!";
    }
}
