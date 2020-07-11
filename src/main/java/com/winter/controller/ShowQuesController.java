package com.winter.controller;

import com.winter.beans.ResultResponse;
import com.winter.service.SearchService;
import com.winter.service.impl.QuestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/show")
public class ShowQuesController {
    @Autowired
    private SearchService searchService;


    @RequestMapping(value="/noPage",method= RequestMethod.POST,  produces={"application/json;charset=UTF-8"})
    public ResultResponse showNoPage( String id){
        return searchService.findQues(id);
    }
}
