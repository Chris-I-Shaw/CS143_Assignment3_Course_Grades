/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class PassFailExam extends GradedActivity{

    /**
     * No Argument Constructor
     */
    public PassFailExam(){
        super();
    }
    /**
     * Argument Constructor with a String 
     * if String is "pass" Score is set to 100
     * if anything else is entered score is set to 0
     * @param passFail 
     */
    public PassFailExam(String passFail)throws IllegalArgumentException {
        if("pass".equals(passFail))setScore(100);
        else setScore(0); 
    }
    /**
     * Overridden toString() method 
     * @return StringBuilder
     */
    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pass Fail Exam your score was: ");
        sb.append(getScore());
        sb.append(" and the corresponding grade was: ");
        sb.append(getGrade());
        sb.append("\n");
        return sb.toString();
  }
}
