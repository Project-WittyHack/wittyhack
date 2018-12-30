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
import tqa.pojo.Performance;
import tqa.pojo.StudentScore;

/**
 *
 * @author lenovo
 */
public class PerformanceDAO {
    public static ArrayList<String> getAllStudentId() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select distinct userid from performance");
        ArrayList<String> idList = new ArrayList<String>();
        while(rs.next())
        {
            idList.add(rs.getString(1));
        }
        return idList;
    }
    public static ArrayList<String> getAllExamId(String studentId) throws SQLException
    {
        String qry = "select examid from performance where userid = ?";
        ArrayList<String> examIdList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, studentId);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
            examIdList.add(rs.getString(1));
        return examIdList;
    }
    public static StudentScore getStudentScore(String studentid, String examid) throws SQLException
    {
        String qry = "select language, per from Performance where userid = ? and examid = ?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, studentid);
        ps.setString(2, examid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        StudentScore scoreObj = new StudentScore();
        scoreObj.setLanguage(rs.getString(1));
        scoreObj.setPer(rs.getDouble(2));
        return scoreObj;
    }
    public static ArrayList<Performance> getAllData() throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from performance");
        ArrayList<Performance> pList = new ArrayList<>();
        while(rs.next())
        {
            String userid = rs.getString(1);
            String examid = rs.getString(2);
            int right = rs.getInt(3);
            int wrong = rs.getInt(4);
            int unattempted = rs.getInt(5);
            double per = rs.getDouble(6);
            String language = rs.getString(7);
            Performance p = new Performance(userid,examid,right,wrong,unattempted,per,language);
            pList.add(p);
        }
        return pList;
    }
    public static void addPerformance(Performance p) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
        ps.setString(1,p.getUserid());
        ps.setString(2,p.getExamid());
        ps.setInt(3, p.getRight());
        ps.setInt(4, p.getWrong());
        ps.setInt(5, p.getUnattempted());
        ps.setDouble(6, p.getPer());
        ps.setString(7, p.getLanguage());
        ps.executeUpdate();
    }
}
