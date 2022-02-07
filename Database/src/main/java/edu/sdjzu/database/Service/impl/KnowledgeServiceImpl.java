package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.KnowledgeService;
import edu.sdjzu.database.mapper.KnowledgeMapper;
import edu.sdjzu.database.model.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeServiceImpl implements KnowledgeService {

    private final KnowledgeMapper knowledgeMapper;

    @Autowired
    public KnowledgeServiceImpl(KnowledgeMapper knowledgeMapper) {
        this.knowledgeMapper = knowledgeMapper;
    }

    @Override
    public List<Knowledge> getAllKnowledge() {
        return knowledgeMapper.getAllKnowledge();
    }

    @Override
    public Knowledge getKnowledgeById(String id) {
        return knowledgeMapper.getKnowledgeById(id);
    }

    @Override
    public void deleteKnowledgeById(String id) {
        knowledgeMapper.deleteKnowledgeById(id);
    }

    @Override
    public void insertKnowledge(Knowledge knowledge) {
        knowledgeMapper.insertKnowledge(knowledge);
    }

    @Override
    public void updateKnowledge(Knowledge knowledge) {
        knowledgeMapper.updateKnowledge(knowledge);
    }


}
