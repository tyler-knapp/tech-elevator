package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    //private String letterGrade;

    //constructor
    public HomeworkAssignment(int possibleMarks, String submitterName){
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return this.earnedMarks;
    }

    public int getPossibleMarks() {
        return this.possibleMarks;
    }

    public String getSubmitterName() {
        return this.submitterName;
    }

    public String getLetterGrade() {
        if(  (double) earnedMarks / possibleMarks * 100 >= 90 ){
            return "A";
        } else if ( (double) earnedMarks / possibleMarks * 100 >= 80 ){
            return "B";
        } else if ( (double) earnedMarks / possibleMarks * 100 >= 70 ){
            return "C";
        } else if ( (double) earnedMarks / possibleMarks * 100 >= 60 ){
            return "D";
        } else {
            return "F";
        }
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }
}
