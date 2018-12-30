/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tqa.pojo;

/**
 *
 * @author lenovo
 */
public class Exam {

    public Exam(String examid, String language, int totalquestions) {
        this.examid = examid;
        this.language = language;
        this.totalquestions = totalquestions;
    }

    public String getExamid() {
        return examid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalquestions() {
        return totalquestions;
    }

    public void setTotalquestions(int totalquestions) {
        this.totalquestions = totalquestions;
    }
    private String examid;
    private String language;
    private int totalquestions;
}
