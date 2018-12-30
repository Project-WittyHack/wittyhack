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
import java.sql.Statement;
import java.util.ArrayList;
import tqa.dbutil.DBConnection;
import tqa.pojo.Exam;

/**
 *
 * @author lenovo
 */
public class ExamDAO {
    public static String getExamId()throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        int rowCount = 0;
        ResultSet rs = st.executeQuery("select count(*) as totalrows from exam");
        if(rs.next()){
            rowCount = rs.getInt(1);
        }
        String newId = "EX-"+(rowCount+1);
        return newId;
    }
    public static void addExam(Exam newExam) throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into exam values(?,?,?)");
        ps.setString(1, newExam.getExamid());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3, newExam.getTotalquestions());
        ps.executeUpdate();
    }
    public static ArrayList<String> getExamIdBySubject(String language) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select examid from exam where language = ?");
        ps.setString(1,language);
        ResultSet rs = ps.executeQuery();
        ArrayList<String> examList = new ArrayList<String>();
        while(rs.next())
        {
            examList.add(rs.getString(1));
        }
        return examList;
    }
    public static int getQuestionCountByExamId(String examid) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select totalquestions from exam where examid = ?");
        ps.setString(1,examid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return (rs.getInt(1));
    }
}
