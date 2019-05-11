package com.mjh.mzz.fileupload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * spring-boot 文件上传
 * Author mzz
 * Create Date 2019/5/11 0011
 **/
//@Controller
@RestController    //表示该类下的所有方法会自动返回json格式的数据类型
public class FileUploadController {
    /**
     * 文件处理
     */
    @RequestMapping("/fileUploadController")
    public Map<String,Object> fileUpload(MultipartFile filename){
        Logger logger = Logger.getLogger("=======");
        logger.info(filename.getOriginalFilename());

        try {
            filename.transferTo(new File("E:/tmp/" + filename.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,Object> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }
}
