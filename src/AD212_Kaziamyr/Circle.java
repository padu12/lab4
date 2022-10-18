package AD212_Kaziamyr;
/*
 * @author Bohdan Kaziamyr
 * @version 18 Oct 2022
 */
public class Circle {
    double r;
    Circle (double rad){
        r = rad;
    }
    double area(){
        return Math.PI*Math.pow(r, 2);
    }
    double circumference(){
        return 2*Math.PI*r;
    }
}
