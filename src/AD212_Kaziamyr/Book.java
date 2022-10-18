package AD212_Kaziamyr;
/*
 * @author Bohdan Kaziamyr
 * @version 18 Oct 2022
 */
public class Book {
    String name, author, year;
    int count;
    double price;
    Book (String n,String a,String y, int c, double p){
        name = n;
        author = a;
        year = y;
        count =c;
        price = p;
    }
    void changeCount (int c) {
        count = c;
        if (count <= 10) price = 10000;
        else if (count >= 1000) price = 500;
        else price = 1000;
    }
    double allBooksPrice (){
        return count*price;
    }
}
