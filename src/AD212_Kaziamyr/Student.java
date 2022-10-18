package AD212_Kaziamyr;
/*
 * @author Bohdan Kaziamyr
 * @version 18 Oct 2022
 */
public class Student {
    String name, surname, group;
    int course;
    double mark;
    Student (String n,String s,String g, int c,double m){
        name = n;
        surname = s;
        group = g;
        course = c;
        mark = m;
    }
    void nextCourse (){
        course++;
    }
    void markChange(double m){
        mark = m;
    }
    double scholarship(){
        return mark*80;
    }
}
