/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class FinalExam extends GradedActivity{
    private int score;
    
    /**
     * No Argument constructor 
     */
    public FinalExam(){
        super();
    }
    
    /**
     * Constructor for FinalExam Which takes an integer as a parameter
     * @param score passed to set score of the Final Exam
     * @throws IllegalArgumentException if number is less than 0 and more than 50
     */
    public FinalExam(int score)throws IllegalArgumentException{
        super();
        if(score<0||score>50)throw new IllegalArgumentException("Incorrect Paramater");
        this.score = score*2;
        setScore(this.score);
    }
    /**
     * Getter for FinalExam Score
     * @return integer of score
     */
    public int getFinalExam(){
        return score;
    }
    /**
     * Overridden toString() method for FinalExam
     * @return StringBuilder
     */
    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Final Exam your score was: ");
        sb.append(getScore());
        sb.append(" and the corresponding grade was: ");
        sb.append(getGrade());
        sb.append("\n");
        return sb.toString();
  }
}
