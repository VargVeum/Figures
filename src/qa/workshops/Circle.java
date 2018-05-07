package qa.workshops;

import java.util.Scanner;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        getParametersFromUser();
    }

    private void getParametersFromUser() {
        System.out.print("Введите радиус окружности: \n");

        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();

    }

    public void showAreaAndCircumreference() {
        double area = Math.PI * (radius * radius);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Площадь круга равна: " + area);
        System.out.println("Окружность круга равна:" + circumference);
    }


    @Override
    public void showArea() {
        showAreaAndCircumreference();
    }
}

