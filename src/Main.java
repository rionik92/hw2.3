import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int age = getRandom(107, 0);

        int temp = getRandom(50, -20);

        String name = "Рома";


        if (age > 20 && age < 45) {

            if (temp > 30 || temp < -20) {
                System.out.println(name + " " + "не выходи гулять");
            } else {
                System.out.println(name + " " + "можно идти к другу");
            }
        } else if (age < 20) {
            if (temp >= 0 && temp <= 28) {
                System.out.println(name + " " + "можно идти к другу");
            } else {
                System.out.println(name + " " + "не выходи гулять");
            }
        } else if (age > 45) {
            if (temp >= -10 && temp <= 25) {
                System.out.println(name + " " + "можно идти к другу");
            } else {
                System.out.println(name + " " + "не выходи гулять");
            }
        }


    }
    public static int getRandom(int max, int min) {
        Random a = new Random();
        int randomAge = a.nextInt(max) - min;
        System.out.println("Случайный возраст" + " - " + randomAge);
        return randomAge;
    }

}


