package edu.sdjzu.mapper;

import edu.sdjzu.model.TcDifficulty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TcDifficultyMapper {

    List<TcDifficulty> getAllTcDifficultys();

    TcDifficulty getTcDifficultyById(String teacherId, String courseId);

    void deleteTcDifficultyById(String teacherId, String courseId);

    void insertTcDifficulty(TcDifficulty tcDifficulty);

    void updateTcDifficulty(TcDifficulty tcDifficulty);

}