package com.example.demo.controller;

import com.example.demo.utils.SeleniumUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.transform.Result;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/index.html")
    public ModelAndView index() {
//        Result result=userService.login(user);
        ModelAndView mv=new ModelAndView();
        mv.addObject("newText","你好，Thymeleaf！");
        mv.addObject("gender","1");

        Map<String,Object> map = new HashMap<>();
//                <td th:text="${user.id}"></td>
        map.put("id",1);
//        <td th:text="${user.username}"></td>
        map.put("username","小明");
//        <td th:text="${user.password}"></td>
        map.put("password","小明-password");
//        <td th:text="${user.created}"></td>
        map.put("created","小明-created");
//        <td th:text="${user.description}"></td>
        map.put("description","小明-description");

        map.put("username","小明同学");

        mv.addObject("userList",Arrays.asList(map,map,map));
//        if(result.getData()!=null) {
            mv.addObject("loginUser",map);
//        }
        mv.setViewName("index.html");
        return mv;
    }

    @GetMapping("/html5")
    public String html5(){
        return "html5";
    }


    @GetMapping("createImages")
    @ResponseBody
    public String createImages(String url,String imgName){
        boolean isLinux = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
        String savePath;
        if(isLinux){
            savePath="/root/"+imgName;
        }else{
            savePath="D:\\data\\"+imgName;
        }
        SeleniumUtils.createImages(url,savePath);
        return "OK";
    }
}
