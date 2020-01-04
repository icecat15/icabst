package com.apanse.icabst.modules.controller.old;

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
@RequestMapping("/2019")
public class IcabstEn2019Controller {

    @Autowired
    private IcabstService icabstService;

    @RequestMapping("")
    public String welcome() {
        return "/page/2019/en/index.html";
    }

    @RequestMapping("/index")
    public String index() {
        return "/page/2019/en/index.html";
    }

    @RequestMapping("/about")
    public String about() {
        return "/page/2019/en/about.html";
    }

    @RequestMapping("/speakers")
    public String speakers() {
        return "/page/2019/en/speakers.html";
    }

    @RequestMapping("/program")
    public String program() {
        return "/page/2019/en/program.html";
    }

    @RequestMapping("/organization")
    public String organizer() {
        return "/page/2019/en/organizer.html";
    }

    @RequestMapping("/registration")
    public String registration() {
        return "/page/2019/en/registration.html";
    }

    @RequestMapping("/venue")
    public String venue() {
        return "/page/2019/en/venue.html";
    }

    @RequestMapping("/submit")
    public String submit() {
        return "/page/2019/en/submit.html";
    }

    @RequestMapping("/submission")
    public String article() {
        return "/page/2019/en/submission.html";
    }

    @RequestMapping("/sitemap.xml")
    public String sitemap() {
        return "/page/2019/en/sitemap.xml";
    }

    @RequestMapping("/achieve")
    public String achieve () {
        return "/page/2019/en/achieve.html";
    }

    @RequestMapping("/proposal")
    public String proposal() {
        return "/page/2019/en/proposal.html";
    }


}
