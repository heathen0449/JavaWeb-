package com.winter.model;

public class ProblemOption extends ProblemOptionKey {
    private String optionWord;

    public String getOptionWord() {
        return optionWord;
    }

    public void setOptionWord(String optionWord) {
        this.optionWord = optionWord == null ? null : optionWord.trim();
    }
}