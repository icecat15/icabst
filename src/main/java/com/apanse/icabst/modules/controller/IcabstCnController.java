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
        return "/page/cn/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/cn/index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/cn/about.html";
    }

    @RequestMapping("/organization")
    public String organization() {
        return "/page/cn/organization.html";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/cn/speakers.html";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/cn/program.html";
    }

    @RequestMapping("/cfp")
    public String cfp() {
        return "/page/cn/cfp.html";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/cn/registration.html";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/cn/venue.html";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/cn/submit.html";
    }

    @RequestMapping("/article")
    public String article() {
        return "/page/cn/article.html";
    }

    @RequestMapping("/sci1")
    public String sci1() {
        return "/page/cn/sci1.html";
    }

    @RequestMapping("/sci2")
    public String sci2() {
        return "/page/cn/sci2.html";
    }

    @RequestMapping("/sci3")
    public String sci3() {
        return "/page/cn/sci3.html";
    }

    @RequestMapping("/sciabstract")
    public String sciabstract() {
        return "/page/cn/sciabstract.html";
    }

    @RequestMapping("/cpci")
    public String cpci() {
        return "/page/cn/cpci.html";
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
