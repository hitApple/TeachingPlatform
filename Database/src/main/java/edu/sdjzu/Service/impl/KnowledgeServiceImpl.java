package edu.sdjzu.Service.impl;

import edu.sdjzu.Service.KnowledgeService;
import edu.sdjzu.mapper.KnowledgeMapper;
import edu.sdjzu.model.Knowledge;
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
