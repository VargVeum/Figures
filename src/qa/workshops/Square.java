package qa.workshops;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Square extends Figure{
    public double side;

    public Square() throws InputMismatchException {
        getParametersFromUser();
    }

    public void getParametersFromUser() throws InputMismatchException  {
        System.out.println("Введите длину стороны квадрата:");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextDouble();
    }

    public void showSquareArea(){
        double area = side * side;
        System.out.println("Площадь квадрата: "+ ConsoleColors.ANSI_BLUE + area + ConsoleColors.ANSI_RESET);
    }

    @Override
    public void showArea() {
        showSquareArea();
    }
}



