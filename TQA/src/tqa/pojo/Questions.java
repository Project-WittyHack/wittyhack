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
public class Questions {
    

        @Override
        public String toString() {
            return "Question{" + "examid=" + examid + ", eno=" + qno + ", language=" + language + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", questions=" + questions + '}';
        }
        
        public boolean equals(Object obj)
        {
            Questions other = (Questions)obj;
            if(this.examid.equals(other.examid))
                return false;
            if(this.qno !=other.qno)
                return false;
            if(this.language.equals(other.language) == false)
                return false;
            if(this.examid.equals(other.examid) == false)
                return false;
            return true;
        }

    public Questions(String examid, int qno, String language, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String questions) {
        this.examid = examid;
        this.qno = qno;
        this.language = language;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.questions = questions;
    }

        public String getExamid() {
            return examid;
        }

        public void setExamid(String examid) {
            this.examid = examid;
        }

        public int getQno() {
            return qno;
        }

        public void setQno(int qno) {
            this.qno = qno;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getAnswer1() {
            return answer1;
        }

        public void setAnswer1(String answer1) {
            this.answer1 = answer1;
        }

        public String getAnswer2() {
            return answer2;
        }

        public void setAnswer2(String answer2) {
            this.answer2 = answer2;
        }

        public String getAnswer3() {
            return answer3;
        }

        public void setAnswer3(String answer3) {
            this.answer3 = answer3;
        }

        public String getAnswer4() {
            return answer4;
        }

        public void setAnswer4(String answer4) {
            this.answer4 = answer4;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
        }

        public String getQuestions() {
            return questions;
        }

        public void setQuestions(String questions) {
            this.questions = questions;
        }
     private String examid;
     private int qno;
     private String language;
     private String answer1, answer2, answer3, answer4;
     private String correctAnswer;
     private String questions;
}
