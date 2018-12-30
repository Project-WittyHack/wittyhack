/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import tqa.dbutil.DBConnection;
import tqa.pojo.Exam;
import tqa.pojo.QuestionStore;
import tqa.pojo.Questions;

/**
 *
 * @author lenovo
 */
public class QuestionDAO {
    public static void addQuestions(QuestionStore qstore) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
        ArrayList<Questions> questionList = qstore.getAllQuestion();
        for(Questions que : questionList)
        {
            ps.setString(1,que.getExamid());
            ps.setInt(2,que.getQno());
            ps.setString(3,que.getQuestions());
            ps.setString(4,que.getAnswer1());
            ps.setString(5,que.getAnswer2());
            ps.setString(6,que.getAnswer3());
            ps.setString(7,que.getAnswer4());
            ps.setString(8,que.getCorrectAnswer());
            ps.setString(9,que.getLanguage());
            ps.executeUpdate();            
        }
    }
        public static ArrayList<Questions> getQuestionsByExamId(String examid) throws SQLException
        {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("select * from questions where examid = ? order by qno");
            ps.setString(1, examid);
            ArrayList<Questions> questionList = new ArrayList<Questions>();
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
              int qno = rs.getInt(2);
              String question = rs.getString(3);
              String option1 = rs.getString(4);
              String option2 = rs.getString(5);
              String option3 = rs.getString(6);
              String option4 = rs.getString(7);
              String correctAnswer = rs.getString(8);
              String language = rs.getString(9);
              Questions ques = new Questions(examid,qno,language,option1,option2,option3,option4,correctAnswer,question);
              questionList.add(ques);
            }
            return questionList;
        }
        public static void updateQuestions(QuestionStore qstore) throws SQLException
        {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("update questions set question = ?, answer1 = ?, answer2 = ?, answer3 = ?,answer4 = ?,correct_answer = ?, language = ? where examid = ? and qno = ?");
            ArrayList<Questions> qList = qstore.getAllQuestion();
            for(Questions q : qList)
            {
                ps.setString(1, q.getQuestions());
                ps.setString(2,q.getAnswer1());
                ps.setString(3,q.getAnswer2());
                ps.setString(4,q.getAnswer3());
                ps.setString(5,q.getAnswer4());
                ps.setString(6, q.getCorrectAnswer());
                ps.setString(7,q.getLanguage());
                ps.setString(8,q.getExamid());
                ps.setInt(9,q.getQno() );
                ps.executeUpdate();
            }
            
        }
    }

