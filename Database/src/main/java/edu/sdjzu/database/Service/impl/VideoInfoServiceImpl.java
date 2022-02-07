package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.VideoInfoService;
import edu.sdjzu.database.mapper.VideoInfoMapper;
import edu.sdjzu.database.model.VideoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoInfoServiceImpl implements VideoInfoService {

    private final VideoInfoMapper videoInfoMapper;

    @Autowired
    public VideoInfoServiceImpl(VideoInfoMapper videoInfoMapper) {
        this.videoInfoMapper = videoInfoMapper;
    }

    @Override
    public List<VideoInfo> getAllVideoInfos() {
        return videoInfoMapper.getAllVideoInfos();
    }

    @Override
    public VideoInfo getVideoInfoById(String id) {
        return videoInfoMapper.getVideoInfoById(id);
    }

    @Override
    public void deleteVideoInfoById(String id) {
        videoInfoMapper.deleteVideoInfoById(id);
    }

    @Override
    public void insertVideoInfo(VideoInfo videoInfo) {
        videoInfoMapper.insertVideoInfo(videoInfo);
    }

    @Override
    public void updateVideoInfo(VideoInfo videoInfo) {
        videoInfoMapper.updateVideoInfo(videoInfo);
    }


}
