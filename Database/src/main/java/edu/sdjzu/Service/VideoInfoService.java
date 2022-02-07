package edu.sdjzu.Service;

import edu.sdjzu.model.VideoInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface VideoInfoService {

    List<VideoInfo> getAllVideoInfos();

    VideoInfo getVideoInfoById(String id);

    void deleteVideoInfoById(String id);

    void insertVideoInfo(VideoInfo videoInfo);

    void updateVideoInfo(VideoInfo videoInfo);


}
