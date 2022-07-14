/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class Demo {

	public static void main(String[] args) {
            
                //creates all the activities, sets them, and prints their values
                //Catches Illegal Argument Exeptions
		try {
		Essay e = new Essay();
                PassFailExam pfe = new PassFailExam("pass");
                FinalExam fe = new FinalExam(50);
                GradedActivity ga = new GradedActivity();
                ga.setScore(80);
                e.setScore(90);

         
                CourseGrades grades = new CourseGrades();
                grades.setLab(ga);
                grades.setPassFailExam(pfe);
                grades.setEssay(e);
                grades.setFinalExam(fe);

                System.out.println(grades.toString());
                
                System.out.println("Your average score was " +grades.getAverage());
                System.out.println("Your lowest score was in "+grades.getLowest());
                System.out.println("Your highest score was in "+grades.getHighest());
                
		} catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}

}
