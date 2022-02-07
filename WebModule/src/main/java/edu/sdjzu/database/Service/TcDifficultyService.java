package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.TcDifficulty;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface TcDifficultyService {

    List<TcDifficulty> getAllTcDifficulty();

    TcDifficulty getTcDifficultyById(String teacherId, String courseId);

    void deleteTcDifficultyById(String teacherId, String courseId);

    void insertTcDifficulty(TcDifficulty tcDifficulty);

    void updateTcDifficulty(TcDifficulty tcDifficulty);


}
