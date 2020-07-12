package com.winter.model;


import lombok.Data;

import java.util.List;

@Data
public class ProblemPlus extends ProblemInfo {
    private List<ProblemOption> optionLists;
}
