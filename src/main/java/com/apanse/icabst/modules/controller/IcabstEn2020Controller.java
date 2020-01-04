package com.apanse.icabst.modules.controller;


import com.apanse.icabst.modules.service.IcabstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @program: icabst
 * @Date: 2019/5/26 7:19 AM
 * @Author: Mr.Deng
 * @Description:
 */
@Controller
@RequestMapping("/")
public class IcabstEn2020Controller {

    @Autowired
    private IcabstService icabstService;

    @RequestMapping("/")
    public String welcome() {
        return "/page/2020/en/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/2020/en/index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/2020/en/about.html";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/2020/en/speakers.html";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/2020/en/program.html";
    }

    @RequestMapping("/organization")
    public String organizer() {
        return "/page/2020/en/organizer.html";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/2020/en/registration.html";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/2020/en/venue.html";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/2020/en/submit.html";
    }

    @RequestMapping("/submission")
    public String article() {
        return "/page/2020/en/submission.html";
    }

    @RequestMapping("/sitemap.xml")
    public String sitemap() {
        return "/page/2020/en/sitemap.xml";
    }

    @RequestMapping("/achieve")
    public String achieve () {
        return "/page/2020/en/achieve.html";
    }

    @RequestMapping("/proposal")
    public String proposal() {
        return "/page/2020/en/proposal.html";
    }

}
