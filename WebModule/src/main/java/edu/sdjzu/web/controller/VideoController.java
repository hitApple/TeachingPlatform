package edu.sdjzu.web.controller;

import edu.sdjzu.web.video.VideoResourceHttpRequestHandler;
import lombok.AllArgsConstructor;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("videoModule")
@AllArgsConstructor
public class VideoController {

    private final VideoResourceHttpRequestHandler videoResourceHttpRequestHandler;


    @RequestMapping("video/{id}")
    public void videoPreview(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id) throws Exception {
        //sourcePath 是获取resources文件夹的绝对地址
        //realPath 即是视频所在的磁盘地址
//        String sourcePath = ClassUtils.getDefaultClassLoader().getResource("").getPath().substring(1);
//        String realPath = sourcePath + "static/a.mp4";
//        String realPath = "D:\\素材\\动态壁纸\\" + "随机刀痕光效.mp4";
        String realPath = "D:\\素材\\动态壁纸\\" + id;

        Path filePath = Paths.get(realPath );
        if (Files.exists(filePath)) {
            //获得文件的网页资源类型
            String mimeType = Files.probeContentType(filePath);
            if (!StringUtils.isEmpty(mimeType)) {
                response.setContentType(mimeType);
            }
            request.setAttribute(VideoResourceHttpRequestHandler.ATTR_FILE, filePath);
            videoResourceHttpRequestHandler.handleRequest(request, response);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            response.setCharacterEncoding(StandardCharsets.UTF_8.toString());
        }
    }

}