import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1= input.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2= input.nextLine();
        System.out.println();
        System.out.println();

        int x1= Integer.parseInt(coordinate1.substring(1,coordinate1.indexOf(",")));
        int y1= Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.indexOf(")")));
        int x2= Integer.parseInt(coordinate2.substring(1,coordinate2.indexOf(",")));
        int y2= Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 1,coordinate2.indexOf(")")));
        LinearEquation random= new LinearEquation(x1,y1,x2,y2);
        if (x1!=x2) {
            System.out.println("----- Line info -----");
            System.out.print(random.lineInfo());
        } else {
            System.out.println("These points are on a vertical line: x = " + x1);
        }


        System.out.print("Enter a value for x: ");
        double newX= input.nextDouble();
        System.out.println();
        System.out.println(random.coordinateForX(newX));




    }
}
