package edu.sdjzu.database.mapper;

import edu.sdjzu.database.model.Knowledge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KnowledgeMapper {

    List<Knowledge> getAllKnowledge();

    Knowledge getKnowledgeById(String id);

    void deleteKnowledgeById(String id);

    void insertKnowledge(Knowledge knowledge);

    void updateKnowledge(Knowledge knowledge);

}