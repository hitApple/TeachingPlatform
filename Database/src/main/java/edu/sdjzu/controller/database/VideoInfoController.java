package edu.sdjzu.controller.database;

import edu.sdjzu.Service.VideoInfoService;
import edu.sdjzu.model.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("database/videoInfo")
public class VideoInfoController {

    private final VideoInfoService videoInfoService;

    @Autowired
    public VideoInfoController(VideoInfoService videoInfoService) {
        this.videoInfoService = videoInfoService;
    }

    @RequestMapping("queryById")
    public VideoInfo queryById(String id){
        return videoInfoService.getVideoInfoById(id);
    }

    @RequestMapping("queryAll")
    public List<VideoInfo> queryAll(){
        return videoInfoService.getAllVideoInfos();
    }

    @RequestMapping("delete")
    public String delete(String id){
        videoInfoService.deleteVideoInfoById(id);
        return "Operation successful!";
    }

    @RequestMapping("insert")
    public String insert(VideoInfo videoInfo){
        videoInfoService.insertVideoInfo(videoInfo);
        return "Operation successful!";
    }

    @RequestMapping("update")
    public String update(VideoInfo videoInfo){
        videoInfoService.updateVideoInfo(videoInfo);
        return "Operation successful!";
    }
}
