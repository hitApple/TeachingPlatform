package edu.sdjzu.database.Service.impl;

import edu.sdjzu.database.Service.LiveInfoService;
import edu.sdjzu.database.mapper.LiveInfoMapper;
import edu.sdjzu.database.model.LiveInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiveInfoServiceImpl implements LiveInfoService {

    private final LiveInfoMapper liveInfoMapper;

    @Autowired
    public LiveInfoServiceImpl(LiveInfoMapper liveInfoMapper) {
        this.liveInfoMapper = liveInfoMapper;
    }

    @Override
    public List<LiveInfo> getAllLiveInfos() {
        return liveInfoMapper.getAllLiveInfos();
    }

    @Override
    public LiveInfo getLiveInfoById(String id) {
        return liveInfoMapper.getLiveInfoById(id);
    }

    @Override
    public void deleteLiveInfoById(String id) {
        liveInfoMapper.deleteLiveInfoById(id);
    }

    @Override
    public void insertLiveInfo(LiveInfo liveInfo) {
        liveInfoMapper.insertLiveInfo(liveInfo);
    }

    @Override
    public void updateLiveInfo(LiveInfo liveInfo) {
        liveInfoMapper.updateLiveInfo(liveInfo);
    }


}
