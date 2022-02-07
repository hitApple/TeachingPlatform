package edu.sdjzu.controller.database;

import edu.sdjzu.Service.TcDifficultyService;
import edu.sdjzu.model.TcDifficulty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/tcDifficulty")
public class TcDifficultyController {

    private final TcDifficultyService tcDifficultyService;

    @Autowired
    public TcDifficultyController(TcDifficultyService tcDifficultyService) {
        this.tcDifficultyService = tcDifficultyService;
    }

    @RequestMapping("queryById")
    public TcDifficulty queryById(String teacherId, String courseId){
        return tcDifficultyService.getTcDifficultyById(teacherId, courseId);
    }

    @RequestMapping("queryAll")
    public List<TcDifficulty> queryAll(){
        return tcDifficultyService.getAllTcDifficulty();
    }

    @RequestMapping("delete")
    public String delete(String teacherId, String courseId){
        tcDifficultyService.deleteTcDifficultyById(teacherId, courseId);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(TcDifficulty tcDifficulty){
        tcDifficultyService.insertTcDifficulty(tcDifficulty);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(TcDifficulty tcDifficulty){
        tcDifficultyService.updateTcDifficulty(tcDifficulty);
        return "Operation successful!";
    }
}
