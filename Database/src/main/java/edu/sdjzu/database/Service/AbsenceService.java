package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.Absence;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AbsenceService {

    List<Absence> getAllAbsences();

    Absence getAbsenceById(String stuId, String courseId, String teacherId);

    void deleteAbsenceById(String stuId, String courseId, String teacherId);

    void insertAbsence(Absence absence);

    void updateAbsence(Absence absence);


}
