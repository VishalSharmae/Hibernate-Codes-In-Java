package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_id")
    private int answerID;
    private String answer;

    public Answer() {
        super();
    }

    public Answer(int answerID, String answer) {
        this.answerID = answerID;
        this.answer = answer;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
