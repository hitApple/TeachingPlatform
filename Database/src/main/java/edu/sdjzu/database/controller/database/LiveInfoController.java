package edu.sdjzu.database.controller.database;

import edu.sdjzu.database.Service.LiveInfoService;
import edu.sdjzu.database.model.LiveInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/liveInfo")
public class LiveInfoController {

    private final LiveInfoService liveInfoService;

    @Autowired
    public LiveInfoController(LiveInfoService liveInfoService) {
        this.liveInfoService = liveInfoService;
    }

    @RequestMapping("queryById")
    public LiveInfo queryById(String id){
        return liveInfoService.getLiveInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<LiveInfo> queryAll(){
        return liveInfoService.getAllLiveInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        liveInfoService.deleteLiveInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(LiveInfo liveInfo){
        liveInfoService.insertLiveInfo(liveInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(LiveInfo liveInfo){
        liveInfoService.updateLiveInfo(liveInfo);
        return "Operation successful!";
    }
}
