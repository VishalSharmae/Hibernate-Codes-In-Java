package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapRun {

    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();

        Question ques1 = new Question();
        ques1.setQuestionId(1212);
        ques1.setQuestion("What is java?");

        //creating answer
        Answer ans1 = new Answer();
        ans1.setAnswerID(343);
        ans1.setAnswer("Java is a Programming language.");
        ans1.setQuestion(ques1);
//        ques1.setAnswer(ans1);


        Answer ans2 =new Answer();
        ans2.setAnswerID(635);
        ans2.setAnswer("With the help of java we can build software!");
        ans2.setQuestion(ques1);

        Answer ans3 =new Answer();
        ans3.setAnswerID(638);
        ans3.setAnswer("Java has different frameworks");
        ans3.setQuestion(ques1);

        List<Answer> list = new ArrayList<Answer>();
        list.add(ans1);
        list.add(ans2);
        list.add(ans3);

        ques1.setAnswers(list);


//        Question ques2 = new Question();
//        ques2.setQuestionId(242);
//        ques2.setQuestion("What is Collection Framework");
//
//        //creating answer
//        Answer ans2 = new Answer();
//        ans2.setAnswerID(344);
//        ans2.setAnswer("API to work with group of objects!");
//        ques2.setAnswer(ans2);
//
//        Question ques3 = new Question();
//        ques3.setQuestionId(2423);
//        ques3.setQuestion("What is NetBeans?");
//
//        //creating answer
//        Answer ans3 = new Answer();
//        ans3.setAnswerID(3443);
//        ans3.setAnswer("It is a IDE for writing codes.");
//        ques3.setAnswer(ans3);


        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

//        session.save(ques1);
//        session.save(ques2);
//        session.save(ques3);
//        session.save(ans1);
//        session.save(ans2);
//        session.save(ans3);

        session.save(ques1);
        session.save(ans1);
        session.save(ans2);
        session.save(ans3);
        transaction.commit();



        //fetching data

//        Question newQues = (Question)session.get(Question.class, 1212);
//        System.out.println(newQues.getQuestion());
//        System.out.println(newQues.getAnswer().getAnswer());
        session.close();
        factory.close();

    }
}
