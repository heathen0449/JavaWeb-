package com.winter.controller;


import com.winter.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/addQuestionnaire")
public class AddQuesController {

    @Autowired
    private QuestionnaireService questionnaireService;



}
