package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by winsion on 2017/4/12.
 */

@Controller
@RequestMapping("/")
public class HellowWord {

    @RequestMapping(method = RequestMethod.GET)
    public String pringtWelcome(ModelMap modelMap){

        modelMap.addAttribute("message","hellow world");
        return "hellow";
    }


    @RequestMapping("pringtHellow")
    public String pringtHellow(ModelMap modelMap){


        modelMap.addAttribute("message","可以了");
        return "hellow";
    }

}
