package com.rs.controller;

import com.rs.domain.FileDomain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @Description TODO
 * @createTime 2020年06月28日
 */
@Controller
public class FileUploadController {
    @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request){
        String uploadfiles = request.getSession().getServletContext().getRealPath("uploadfiles");
        String originalFilename = fileDomain.getMyfile().getOriginalFilename();
        assert originalFilename != null;
        File file = new File(uploadfiles, originalFilename);
        try {
            fileDomain.getMyfile().transferTo(file);
            System.out.println("下载成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "showOne";
    }
}
