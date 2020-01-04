package com.apanse.icabst.modules.controller.old;


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
@RequestMapping("/2019/cn")
public class IcabstCn2019Controller {

    @Autowired
    private IcabstService icabstService;

    @RequestMapping("")
    public String welcome() {
        return "/page/2019/cn/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/2019/cn/index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/2019/cn/about.html";
    }

    @RequestMapping("/organization")
    public String organization() {
        return "/page/2019/cn/organization.html";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/2019/cn/speakers.html";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/2019/cn/program.html";
    }

    @RequestMapping("/cfp")
    public String cfp() {
        return "/page/2019/cn/cfp.html";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/2019/cn/registration.html";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/2019/cn/venue.html";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/2019/cn/submit.html";
    }

    @RequestMapping("/article")
    public String article() {
        return "/page/2019/cn/article.html";
    }

    @RequestMapping("/sci1")
    public String sci1() {
        return "/page/2019/cn/sci1.html";
    }

    @RequestMapping("/sci2")
    public String sci2() {
        return "/page/2019/cn/sci2.html";
    }

    @RequestMapping("/sci3")
    public String sci3() {
        return "/page/2019/cn/sci3.html";
    }

    @RequestMapping("/sciabstract")
    public String sciabstract() {
        return "/page/2019/cn/sciabstract.html";
    }

    @RequestMapping("/cpci")
    public String cpci() {
        return "/page/2019/cn/cpci.html";
    }

    @RequestMapping("/achieve")
    public String achieve() {
        return "/page/2019/cn/achieve.html";
    }

    @RequestMapping("/proposal")
    public String proposal() {
        return "/page/2019/cn/proposal.html";
    }


}