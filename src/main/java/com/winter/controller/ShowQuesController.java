package com.winter.controller;

import com.winter.beans.ResultResponse;
import com.winter.service.impl.QuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/show")
public class ShowQuesController {
    @Autowired
    private QuestServiceImpl questService;

    @ResponseBody
    @RequestMapping(value="/noPage",method= RequestMethod.POST,  produces={"application/json;charset=UTF-8"})
    public ResultResponse showNoPage(@RequestBody String id){
        return null;
    }
}
