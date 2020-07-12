package com.winter.service.impl;

import com.winter.beans.ResultResponse;
import com.winter.mapper.ProblemInfoMapper;
import com.winter.mapper.ProblemOptionMapper;
import com.winter.mapper.QuestionnaireInfoMapper;
import com.winter.model.ProblemInfo;
import com.winter.model.ProblemPlus;
import com.winter.model.QuestionnaireInfo;
import com.winter.model.QuestionnairePlus;
import com.winter.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value="SearchService")
public class SearchSericeImpl implements SearchService {
    @Autowired
    private ProblemInfoMapper problemInfoMapper;
    @Autowired
    private QuestionnaireInfoMapper questionnaireInfoMapper;
    @Autowired
    private ProblemOptionMapper problemOptionMapper;


    @Override //法1 传递新对象，传统json 未分页版本
    public ResultResponse findQues(String id) {
        try{
            if(questionnaireInfoMapper.selectByPrimaryKey(id)==null){
                return ResultResponse.error(0,"查无此id,请重新输入");
            }
            else{
                QuestionnaireInfo questionnaire = questionnaireInfoMapper.selectByPrimaryKey(id);
                QuestionnairePlus questionnairePlus = new QuestionnairePlus();
                questionnairePlus.setId(questionnaire.getId());
                questionnairePlus.setQuestionContent(questionnaire.getQuestionContent());
                questionnairePlus.setQuestionTitle(questionnaire.getQuestionTitle());
                questionnairePlus.setQuestionName(questionnaire.getQuestionName());
                questionnairePlus.setTypeId(questionnaire.getTypeId());
                List<ProblemPlus> problemLists = new ArrayList<>();
                List<ProblemInfo> problemSecond = problemInfoMapper.selectByQuesId(id);
                for(ProblemInfo plus:problemSecond){
                    ProblemPlus hana = new ProblemPlus();
                    hana.setId(plus.getId());
                    hana.setKindId(plus.getKindId());
                    hana.setProblemName(plus.getProblemName());
                    hana.setQuestionnaireId(plus.getQuestionnaireId());
                    hana.setOptionLists(problemOptionMapper.selectByProId(hana.getId()));
                    problemLists.add(hana);
                }
                questionnairePlus.setProblemLists(problemLists);
                return ResultResponse.success(questionnairePlus);
            }
        }catch(Exception e){
                return ResultResponse.error(0,e.getMessage());
        }

    }
}
