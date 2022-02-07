package edu.sdjzu.mapper;

import edu.sdjzu.model.Absence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AbsenceMapper {

    List<Absence> getAllAbsences();

    Absence getAbsenceById(String stuId, String courseId, String teacherId);

    void deleteAbsenceById(String stuId, String courseId, String teacherId);

    void insertAbsence(Absence absence);

    void updateAbsence(Absence absence);

}