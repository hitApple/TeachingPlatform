package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.Knowledge;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface KnowledgeService {

    List<Knowledge> getAllKnowledge();

    Knowledge getKnowledgeById(String id);

    void deleteKnowledgeById(String id);

    void insertKnowledge(Knowledge knowledge);

    void updateKnowledge(Knowledge knowledge);


}
