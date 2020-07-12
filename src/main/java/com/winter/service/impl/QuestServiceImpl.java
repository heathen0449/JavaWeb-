package com.winter.service.impl;


import com.winter.beans.ResultResponse;
import com.winter.mapper.ProblemInfoMapper;
import com.winter.mapper.ProblemOptionMapper;
import com.winter.mapper.QuestionnaireInfoMapper;
import com.winter.model.*;
import com.winter.service.QuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "QuestionnaireService")
public class QuestServiceImpl implements QuestionnaireService {
    @Autowired
    private QuestionnaireInfoMapper quesMapper;
    @Autowired
    private ProblemInfoMapper proMaper;
    @Autowired
    private ProblemOptionMapper optionmapper;



    @Override
    public ResultResponse addQues(QuestionnairePlus quest) {
        if(quesMapper.selectByPrimaryKey(quest.getId())!=null){
            return ResultResponse.error(0,"请重新生成问卷编号");
        }
        else{
            try {
                QuestionnaireInfo question = new QuestionnaireInfo();
                question.setId(quest.getId());
                question.setTypeId(quest.getTypeId());
                question.setQuestionContent(quest.getQuestionContent());
                question.setQuestionName(quest.getQuestionName());
                question.setQuestionTitle(quest.getQuestionTitle());
                quesMapper.insert(question);
                for (ProblemPlus example : quest.getProblemLists()) {
                    ProblemInfo problem = new ProblemInfo();
                    problem.setId(example.getId());
                    problem.setKindId(example.getKindId());
                    problem.setProblemName(example.getProblemName());
                    problem.setQuestionnaireId(example.getQuestionnaireId());
                    proMaper.insert(problem);
                    for (ProblemOption exampleOption : example.getOptionLists()) {
                        optionmapper.insert(exampleOption);
                    }

                }
            }catch(Exception e){
                return ResultResponse.error(0,e.getMessage());
            }

            return ResultResponse.success("插入成功");
        }


    }
}
