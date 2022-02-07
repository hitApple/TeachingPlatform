package edu.sdjzu.controller.database;

import edu.sdjzu.Service.ScSelectedService;
import edu.sdjzu.model.ScSelected;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/scSelected")
public class ScSelectedController {

    private final ScSelectedService scSelectedService;

    @Autowired
    public ScSelectedController(ScSelectedService scSelectedService) {
        this.scSelectedService = scSelectedService;
    }

    @RequestMapping("queryById")
    public ScSelected queryById(String stuId, String courseId){
        return scSelectedService.getScSelectedById(stuId, courseId);
    }

    @RequestMapping("queryAll")
    public List<ScSelected> queryAll(){
        return scSelectedService.getAllScSelected();
    }

    @RequestMapping("delete")
    public String delete(String stuId, String courseId){
        scSelectedService.deleteScSelectedById(stuId, courseId);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(ScSelected scSelected){
        scSelectedService.insertScSelected(scSelected);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(ScSelected scSelected){
        scSelectedService.updateScSelected(scSelected);
        return "Operation successful!";
    }
}
