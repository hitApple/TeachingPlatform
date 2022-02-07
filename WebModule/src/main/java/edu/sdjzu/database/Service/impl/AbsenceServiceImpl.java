package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.AbsenceService;
import edu.sdjzu.database.mapper.AbsenceMapper;
import edu.sdjzu.database.model.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbsenceServiceImpl implements AbsenceService {

    private final AbsenceMapper absenceMapper;

    @Autowired
    public AbsenceServiceImpl(AbsenceMapper absenceMapper) {
        this.absenceMapper = absenceMapper;
    }

    @Override
    public List<Absence> getAllAbsences() {
        return absenceMapper.getAllAbsences();
    }

    @Override
    public Absence getAbsenceById(String stuId, String courseId, String teacherId) {
        return absenceMapper.getAbsenceById(stuId, courseId, teacherId);
    }

    @Override
    public void deleteAbsenceById(String stuId, String courseId, String teacherId) {
        absenceMapper.deleteAbsenceById(stuId, courseId, teacherId);
    }

    @Override
    public void insertAbsence(Absence absence) {
        absenceMapper.insertAbsence(absence);
    }

    @Override
    public void updateAbsence(Absence absence) {
        absenceMapper.updateAbsence(absence);
    }


}
