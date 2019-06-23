public class Main {

    public static void main(String[] args) {

        String name = "Рома";
        int age = 25;
        byte temp = 25;

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


}


