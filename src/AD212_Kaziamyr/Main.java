package AD212_Kaziamyr;
import java.util.Scanner;
/*
 * @author Bohdan Kaziamyr
 * @version 18 Oct 2022
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userStr, userStr1, userStr2, userStr3;
        int userInt, ws;
        double userD1, userD2;
        while (true){
            System.out.printf("\n\n\n\n\n\n");
            System.out.printf("1 - Right triangle\n2 - Circle\n3 - Student\n4 - Book\n\nPlease, enter the number: ");
            userInt = sc.nextInt();
            switch (userInt){
                case 1:
                    System.out.printf("\nPlease, enter the base of your triangle: ");
                    userD1 = sc.nextDouble();
                    System.out.printf("Please, enter the height of your triangle: ");
                    userD2 = sc.nextDouble();
                    RightTriangle myTriangle = new RightTriangle(userD1, userD2);
                    System.out.printf("\nSquare: %.2f\nHypotenuse: %.2f\nPerimeter: %.2f\n\nPlease, enter sth: ",
                            myTriangle.square(),myTriangle.hypotenuse(), myTriangle.perimeter());
                    userStr = sc.next();
                    break;
                case 2:
                    System.out.printf("\nPlease, enter the radius of your circle: ");
                    userD1 = sc.nextDouble();
                    Circle myCircle = new Circle(userD1);
                    System.out.printf("\nArea: %.2f\nCircumference: %.2f\n\nPlease, enter sth: ",
                            myCircle.area(),myCircle.circumference());
                    userStr = sc.next();
                    break;
                case 3:
                    System.out.printf("\nPlease, enter the\nName: ");
                    userStr1 = sc.next();
                    System.out.printf("Surname: ");
                    userStr2 = sc.next();
                    System.out.printf("Group: ");
                    userStr3 = sc.next();
                    System.out.printf("Course: ");
                    userInt = sc.nextInt();
                    System.out.printf("Average mark: ");
                    userD1 = sc.nextDouble();
                    Student myStudent = new Student (userStr1, userStr2, userStr3, userInt, userD1);
                    ws = 1;
                    while (ws == 1){
                        System.out.printf("\n\n1 - Go to the next course\n2 - Change the average mark\n3 - Display the " +
                                "scholarship\n0 - Exit\n\nPlease, enter the number: ");
                        userInt = sc.nextInt();
                        switch(userInt){
                            case 1:
                                myStudent.nextCourse();
                                System.out.printf("Now your course is: "+myStudent.course + "\n\nPlease, enter sth: ");
                                userStr = sc.next();
                                break;
                            case 2:
                                System.out.printf("Please, enter the new average mark: ");
                                userD1 = sc.nextDouble();
                                myStudent.markChange(userD1);
                                System.out.printf("Now your average mark is: "+myStudent.mark + "\n\nPlease, enter " +
                                        "sth: ");
                                userStr = sc.next();
                                break;
                            case 3:
                                System.out.printf("Your scholarship is: " + myStudent.scholarship() + "\n\nPlease, " +
                                        "enter sth: ");
                                userStr = sc.next();
                                break;
                            case 0:
                                ws--;
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.printf("\nPlease, enter the\nTitle: ");
                    userStr1 = sc.next();
                    System.out.printf("Author: ");
                    userStr2 = sc.next();
                    System.out.printf("Year: ");
                    userStr3 = sc.next();
                    System.out.printf("Count: ");
                    userInt = sc.nextInt();
                    System.out.printf("Price: ");
                    userD1 = sc.nextDouble();
                    Book myBook = new Book (userStr1, userStr2, userStr3, userInt, userD1);
                    ws = 1;
                    while (ws == 1){
                        System.out.printf("\n\n1 - Change the number of books\n2 - Display the price of all " +
                                "books\n0 - Exit\n\nPlease, enter the number: ");
                        userInt = sc.nextInt();
                        switch(userInt){
                            case 1:
                                System.out.printf("Please, enter the new count: ");
                                userInt = sc.nextInt();
                                myBook.changeCount(userInt);
                                System.out.printf("\nNow the number of the books is "+myBook.count+"\n\nPlease, enter" +
                                        " " +
                                        "sth: ");
                                userStr = sc.next();
                                break;
                            case 2:
                                System.out.printf("\nThe price of all books is %.2f\n\nPlease, " +
                                        "enter sth: ", myBook.allBooksPrice());
                                userStr = sc.next();
                                break;
                            case 0:
                                ws--;
                                break;
                        }
                    }
                    break;
            }
        }
    }
}