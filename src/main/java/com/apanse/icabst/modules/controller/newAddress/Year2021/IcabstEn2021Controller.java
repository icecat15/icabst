package com.apanse.icabst.modules.controller.newAddress.Year2021;


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
 * @Date: 2019/5/26 7:19 AM
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
@RequestMapping("/")
public class IcabstEn2021Controller {

    @Autowired
    private IcabstService icabstService;

    @RequestMapping("/")
    public String welcome() {
        return "/page/2021/en/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/2021/en/index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/2021/en/about.html";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/2021/en/speakers.html";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/2021/en/program.html";
    }

    @RequestMapping("/organization")
    public String organizer() {
        return "/page/2021/en/organizer.html";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/2021/en/registration.html";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/2021/en/venue.html";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/2021/en/submit.html";
    }

    @RequestMapping("/submission")
    public String article() {
        return "/page/2021/en/submission.html";
    }

    @RequestMapping("/sitemap.xml")
    public String sitemap() {
        return "/page/2021/en/sitemap.xml";
    }

    @RequestMapping("/achieve")
    public String achieve () {
        return "/page/2021/en/achieve.html";
    }

    @RequestMapping("/proposal")
    public String proposal() {
        return "/page/2021/en/proposal.html";
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
