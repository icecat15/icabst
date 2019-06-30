package com.apanse.icabst.modules.controller;

import com.apanse.icabst.modules.common.Messages;
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
 * @Date: 2019/5/26 7:19 AM
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
@RequestMapping("/cn")
public class IcabstCnController {

    @Autowired
    private IcabstService icabstService;

    @RequestMapping("")
    public String welcome() {
        return "/page/cn/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/cn/index";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/cn/about";
    }

    @RequestMapping("/organization")
    public String organization() {
        return "/page/cn/organization";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/cn/speakers";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/cn/program";
    }

    @RequestMapping("/cfp")
    public String cfp() {
        return "/page/cn/cfp";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/cn/registration";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/cn/venue";
    }

    // @RequestMapping("/save")
    // public String save() {
    // return "/page/cn/save";
    // }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/cn/submit";
    }

    @RequestMapping("/article")
    public String article() {
        return "/page/cn/article";
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

    @RequestMapping("/saveEXC")
    @ResponseBody
    public Messages save(@RequestBody SignUpDTO signUpDTO) {
        Messages messages;
        try {
            messages = icabstService.save(signUpDTO, true);
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

    @RequestMapping("/download/{name}")
    @ResponseBody
    public Messages download(HttpServletRequest request, HttpServletResponse response, @PathVariable("name") String name){
        Messages messages;
        try {
            messages = icabstService.downloadFile(request,response,name);
        } catch (Exception e) {
            messages = Messages.getException(e.getMessage(), null);
        }
        return messages;
    }

}
