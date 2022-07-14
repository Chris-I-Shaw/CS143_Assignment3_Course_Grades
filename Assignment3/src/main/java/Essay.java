/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class Essay extends GradedActivity {
	//Fields to set a total score
	private int grammer;
	private int spelling;
	private int length;
	private int content;
	
        /**
         * No Argument Constructor
         */
	public Essay() {
		super();
		this.grammer=0;
		this.spelling = 0;
		this.length=0;
		this.content = 0;
	}
        /**
         * Constructor that takes an integer for each of the fields, validates their formatting and sets them respectively
         * @param grammer integer value
         * @param spelling integer value
         * @param length integer value
         * @param content integer value
         */
	public Essay(int grammer, int spelling, int length, int content) {
		
		super();
		this.grammer=grammer;
		this.spelling = spelling;
		this.length=length;
		this.content = content;
		checkParameters();
                
	}
	/**
         * Method to Check parameters 
         * @throws IllegalArgumentException if numbers don't fit in their respective limits
         */
	private void checkParameters() throws IllegalArgumentException {
		if (grammer>30 || grammer<0 || spelling >20 || spelling<0 || length >20 || length<0 || content>30 || content<0)throw new IllegalArgumentException("Invalid Scores");
		
	}
        /**
         * Setter for score
         */
	public void setTotalScore() {
		double totalScore = grammer + spelling + length + content;
		 setScore(totalScore);
	}
	/**
         * Prints Score
         */
	public void printScore() {
		System.out.println(getGrade());
	}
        //Gets Essay Score from GradedActivity
	public double getEssayScore(){
            return grammer + spelling + length + content;
        }
        /**
         * Overridden toString() method for Essay
         * @return StringBuilder
         */
        @Override public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("Essay your score was: ");
            sb.append(getScore());
            sb.append(" and the corresponding grade was: ");
            sb.append(getGrade());
            sb.append("\n");
            return sb.toString();
        }
}
