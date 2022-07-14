/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class GradedActivity {
	   private double score;  // Numeric score

	   /**
	      The setScore method sets the score field.
	      @param s The value to store in score.
	   */

	   public void setScore(double s)
	   {
	      score = s;
	   }

	   /**
	      The getScore method returns the score.
	      @return The value stored in the score field.
	   */

	   public double getScore()
	   {
	      return score;
	   }

	   /**
	      The getGrade method returns a letter grade
	      determined from the score field.
	      @return The letter grade.
	   */

	   public char getGrade()
	   {
	      char letterGrade;

	      if (score >= 90)
	         letterGrade = 'A';
	      else if (score >= 80)
	         letterGrade = 'B';
	      else if (score >= 70)
	         letterGrade = 'C';
	      else if (score >= 60)
	         letterGrade = 'D';
	      else
	         letterGrade = 'F';

	      return letterGrade;
	   }
           /**
            * Added toString() method for the GradedActivity object in the array
            * @return String built with StringBuilder
            */
           public String toString(){
               StringBuilder sb = new StringBuilder();
               sb.append("Graded Activity your score was: ");
               sb.append(getScore());
               sb.append(" and the corresponding grade was: ");
               sb.append(getGrade());
               sb.append("\n");
               return sb.toString();
           }
}
