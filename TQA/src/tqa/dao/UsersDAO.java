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
import tqa.dbutil.DBConnection;
import tqa.pojo.Users;

/**
 *
 * @author lenovo
 */
public class UsersDAO {
    public static boolean verify(Users e) throws SQLException{
        ResultSet rs = null;
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? and password = ? and usertype = ? ");
        ps.setString(1, e.getUserId());
        ps.setString(2, e.getPassword());
        ps.setString(3, e.getUserType());
        rs = ps.executeQuery();
        return rs.next();
    }
    public static boolean addUser(Users e) throws SQLException
    {
        ResultSet rs = null;
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? ");
        ps.setString(1, e.getUserId());
        rs = ps.executeQuery();
        if(rs.next())
            return false;
        else{
            ps = conn.prepareStatement("insert into users values(?,?,?)");
            ps.setString(1,e.getUserId());
            ps.setString(2,e.getPassword());
            ps.setString(3,e.getUserType());
            int ans= ps.executeUpdate();
            if(ans != 0)
                return true;
            else
                return false;
        }
    }
    public static boolean updateUser(Users e) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("update users set password=? where userid = ?");
        ps.setString(1, e.getPassword());
        ps.setString(2, e.getUserId());
        int ans = ps.executeUpdate();
        if(ans ==0)
        {
            return false;
        }
        else
            return true;
    }
}
