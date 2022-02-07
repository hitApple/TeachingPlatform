package edu.sdjzu.database.Service;

import edu.sdjzu.database.model.LiveInfo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface LiveInfoService {

    List<LiveInfo> getAllLiveInfos();

    LiveInfo getLiveInfoById(String id);

    void deleteLiveInfoById(String id);

    void insertLiveInfo(LiveInfo liveInfo);

    void updateLiveInfo(LiveInfo liveInfo);


}
