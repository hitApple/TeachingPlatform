package edu.sdjzu.web.unit;

import edu.sdjzu.database.Service.VideoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class VideoUnit {

    private static VideoInfoService videoInfoService;

    @Autowired
    public VideoUnit(VideoInfoService videoInfoService2) {
        videoInfoService = videoInfoService2;
    }

    public static String getVideoUrl(String id, boolean format){
        if (format){
            return formatFilePath(videoInfoService.getVideoInfoById(id).getUrl());
        } else {
            return videoInfoService.getVideoInfoById(id).getUrl();
        }

    }

    public static String getContentType(Path filePath) throws IOException {
        //获得文件的网页资源类型
        return Files.probeContentType(filePath);
    }

    public static String formatFilePath(String url){
        return url.replaceAll("\\\\", "\\\\\\\\");
    }

}
