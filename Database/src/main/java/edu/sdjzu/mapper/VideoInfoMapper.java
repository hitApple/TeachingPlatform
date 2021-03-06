package edu.sdjzu.mapper;

import edu.sdjzu.model.VideoInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VideoInfoMapper {

    List<VideoInfo> getAllVideoInfos();

    VideoInfo getVideoInfoById(String id);

    void deleteVideoInfoById(String id);

    void insertVideoInfo(VideoInfo videoInfo);

    void updateVideoInfo(VideoInfo videoInfo);

}