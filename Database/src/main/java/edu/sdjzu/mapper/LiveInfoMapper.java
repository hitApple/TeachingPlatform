package edu.sdjzu.mapper;

import edu.sdjzu.model.LiveInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LiveInfoMapper {

    List<LiveInfo> getAllLiveInfos();

    LiveInfo getLiveInfoById(String id);

    void deleteLiveInfoById(String id);

    void insertLiveInfo(LiveInfo liveInfo);

    void updateLiveInfo(LiveInfo liveInfo);

}