package com.winter.controller;



import com.winter.beans.ResultResponse;
import com.winter.model.QuestionnairePlus;
import com.winter.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/add")
public class AddQuesController {

    @Autowired
    private QuestionnaireService questionnaireService;

    @ResponseBody
    @RequestMapping(value="/addQuestionnaire",method= RequestMethod.POST,  produces={"application/json;charset=UTF-8"})
    public ResultResponse addquestionnaire (@RequestBody QuestionnairePlus quest){
        return questionnaireService.addQues(quest);
    }


}
