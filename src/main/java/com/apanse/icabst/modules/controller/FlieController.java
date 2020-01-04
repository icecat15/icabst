package com.apanse.icabst.modules.controller;

import com.apanse.icabst.modules.common.Messages;
import com.apanse.icabst.modules.dto.EnSignUoDTO;
import com.apanse.icabst.modules.dto.NameAndPhoneVO;
import com.apanse.icabst.modules.dto.SignUpDTO;
import com.apanse.icabst.modules.service.IcabstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: icabst
 * @description:
 * @author: sunguolu
 * @create: 2020-01-04 14:46
 **/
@Controller
public class FlieController {
    @Autowired
    private IcabstService icabstService;

    @RequestMapping("/cn/saveEXC")
    @ResponseBody
    public Messages cnSave(@RequestBody SignUpDTO signUpDTO) {
        Messages messages;
        try {
            messages = icabstService.save(signUpDTO, true);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

    @RequestMapping("/cn//saveArticleEXC")
    @ResponseBody
    public Messages cnSaveArticleEXC(@RequestBody SignUpDTO signUpDTO) {
        Messages messages;
        try {
            messages = icabstService.save(signUpDTO, false);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

    @RequestMapping("/cn//download/{name}")
    @ResponseBody
    public Messages cnDownload(HttpServletRequest request, HttpServletResponse response, @PathVariable("name") String name){
        Messages messages;
        try {
            messages = icabstService.downloadFile(request,response,name);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }



    @RequestMapping("/uploadFile")
    @ResponseBody
    public Messages uploadFile(@RequestParam("file") MultipartFile file, NameAndPhoneVO nameAndPhoneVO) {
        Messages messages;
        try {
            messages = icabstService.uploadFile(file);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

    @RequestMapping("/enSaveEXC")
    @ResponseBody
    public Messages save(@RequestBody EnSignUoDTO signUpDTO) {
        Messages messages;
        try {
            messages = icabstService.enSave(signUpDTO, true);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

    @RequestMapping("/saveArticleEXC")
    @ResponseBody
    public Messages saveArticleEXC(@RequestBody SignUpDTO signUpDTO) {
        Messages messages;
        try {
            messages = icabstService.save(signUpDTO, false);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

    @RequestMapping("/download{name}")
    @ResponseBody
    public Messages download(HttpServletRequest request, HttpServletResponse response,@PathVariable("name") String name){
        Messages messages;
        try {
            messages = icabstService.downloadFile(request,response,name);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

}
