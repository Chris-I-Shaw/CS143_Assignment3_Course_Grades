/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

public class CourseGrades implements Analyzable{
    //field for the array of grades
    private GradedActivity [] grades;
    
    /**
     * No argument Constructor
     */
    public CourseGrades() {
        super();
        grades = new GradedActivity[4];
    }
    /**
     * Method to set GradedActivity object in the 0 index position of array
     * @param ga A GradedActivity object is passed
     */
    public void setLab(GradedActivity ga){
        grades[0]=ga;
    }
    /**
     * Method to set PassFailExam object in the 1 index position of array
     * @param pfe A PassFailExam object is passed
     */
    public void setPassFailExam(PassFailExam pfe){
        grades[1]=pfe;
    }
    /**
     * Method to set Essay object in the 2 index position of array
     * @param e An Essay object is passed
     */
    public void setEssay(Essay e){
        grades[2]=e;
    }
    /**
     * Method to set FinalExam object in the 3 index position of array
     * @param fe A FinalExam object is passed
     */
    public void setFinalExam(FinalExam fe){
        grades[3]=fe;
    }
    /**
     * Overridden toString() method 
     * @return String of the StringBuilder
     */
    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< 4; i++){
            sb.append(grades[i].toString());
        }
        return sb.toString();
    }
    /**
     * Interface method to get the highest grade in the array
     * @return reference to the highest grade
     */
    @Override public GradedActivity getHighest(){
        GradedActivity highest = grades[0];
         for (int i =0; i<4; i++){
         if( grades[i].getScore()>highest.getScore()) {
             highest=grades[i];
         }
        }
         return highest;
    }
    /**
     * Interface method to get the lowest grade in the array
     * @return reference to the lowest grade
     */    
    @Override public GradedActivity getLowest(){
        GradedActivity lowest = grades[0];
        for (int i =0; i<4; i++){
            if( grades[i].getScore()<lowest.getScore()) lowest=grades[i]; 
        }
         return lowest;
    }
    /**
     * Interface method to get the average grade of the array
     * @return double value of the average
     */
    @Override public double getAverage() {
        double total=0;
       
        for (int i =0; i<4; i++){
            total += grades[i].getScore();
        }
        return total/grades.length;
    }
}
