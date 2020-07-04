package com.winter.model;

public class ProblemOption extends ProblemOptionKey {
    private String lineTitle;

    private String optionWord;

    private Integer optionGrade;

    public String getLineTitle() {
        return lineTitle;
    }

    public void setLineTitle(String lineTitle) {
        this.lineTitle = lineTitle == null ? null : lineTitle.trim();
    }

    public String getOptionWord() {
        return optionWord;
    }

    public void setOptionWord(String optionWord) {
        this.optionWord = optionWord == null ? null : optionWord.trim();
    }

    public Integer getOptionGrade() {
        return optionGrade;
    }

    public void setOptionGrade(Integer optionGrade) {
        this.optionGrade = optionGrade;
    }
}