package AD212_Kaziamyr;

import javafx.beans.binding.DoubleExpression;
/*
 * @author Bohdan Kaziamyr
 * @version 18 Oct 2022
 */
public class RightTriangle {
    double base, height;
    RightTriangle (double b, double h) {
        base = b;
        height = h;
    }
    double square(){
        return base*height/2;
    }
    double hypotenuse(){
        return Math.sqrt(Math.pow(base, 2)+Math.pow(height, 2));
    }
    double perimeter(){
        return base + height + hypotenuse();
    }
}
