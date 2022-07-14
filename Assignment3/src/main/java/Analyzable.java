/**
 *Chris Shaw
 * CS 143 Java 2
 * 7/24/19
 * Program to create objects of graded activities and test inheritance 
 * with an array of the objects
 */

/**
 * Interface with methods to be implemented in CourseGrades
 */
public interface Analyzable {
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}
