package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_id")
    private int answerID;
    private String answer;
    @ManyToOne
    private Question question;

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


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
