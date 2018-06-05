package com.liuzhiqiang.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: x
 * @Date: Created in 17:20 2018/6/4
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    ModelAndView index(ModelMap modelMap) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userName","刘志强");
        map.put("时间",new Date());
        modelMap.put("map",map);
        return new ModelAndView("index", modelMap);
    }
}
