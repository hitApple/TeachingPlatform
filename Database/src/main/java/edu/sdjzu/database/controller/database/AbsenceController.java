package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.AbsenceService;
import edu.sdjzu.database.model.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/absence")
public class AbsenceController {

    private final AbsenceService absenceService;

    @Autowired
    public AbsenceController(AbsenceService absenceService) {
        this.absenceService = absenceService;
    }

    @RequestMapping("queryById")
    public Absence queryById(String stuId, String courseId, String teacherId){
        return absenceService.getAbsenceById(stuId, courseId, teacherId);
    }

    @RequestMapping("queryAll")
    public List<Absence> queryAll(){
        return absenceService.getAllAbsences();
    }

    @RequestMapping("delete")
    public String delete(String stuId, String courseId, String teacherId){
        absenceService.deleteAbsenceById(stuId, courseId, teacherId);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(Absence absence){
        absenceService.insertAbsence(absence);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(Absence absence){
        absenceService.updateAbsence(absence);
        return "Operation successful!";
    }
}
