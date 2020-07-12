package com.winter.model;

import lombok.Data;

import java.util.List;

@Data
public class QuestionnairePlus extends QuestionnaireInfo {
    private List<ProblemPlus> problemLists;
}
