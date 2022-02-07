package edu.sdjzu.controller.database;

import edu.sdjzu.Service.KnowledgeService;
import edu.sdjzu.model.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/knowledge")
public class KnowledgeController {

    private final KnowledgeService knowledgeService;

    @Autowired
    public KnowledgeController(KnowledgeService knowledgeService) {
        this.knowledgeService = knowledgeService;
    }

    @RequestMapping("queryById")
    public Knowledge queryById(String id){
        return knowledgeService.getKnowledgeById(id);
    }

    @RequestMapping("queryAll")
    public List<Knowledge> queryAll(){
        return knowledgeService.getAllKnowledge();
    }

    @RequestMapping("delete")
    public String delete(String id){
        knowledgeService.deleteKnowledgeById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(Knowledge knowledge){
        knowledgeService.insertKnowledge(knowledge);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(Knowledge knowledge){
        knowledgeService.updateKnowledge(knowledge);
        return "Operation successful!";
    }
}
