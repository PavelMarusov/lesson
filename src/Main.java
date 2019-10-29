public class Main<name> {
    public static String global = ("Hello");

    public static void main(String[] args) {
        addition(5, 2.1);
        printText();
        System.out.println(global);
        test(3);
        text();



    }
    public static String text(){
        System.out.println("Pasha");;
        return ("Pasha");
        }

    public static void test(int num1){
        System.out.println("Отработал метод тест" + num1);
        if(num1>0){
            num1 = num1 -1;
            test(num1);
        }

    }

    public static void addition(int num1, double num2) {
        System.out.println("Результат сложения =" + (num1 + num2));



    }

    public static void printText() {

        double someNumber = 5.1;
        System.out.println(someNumber);
        int myNumber = 5;

        switch (myNumber) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Неизвестное число");
        }
        String name = "Sasha";
        switch (name) {
            case "Sasha":
                System.out.println("Привет, Саша");
                break;
            case "Masha":
                System.out.println("Привет, Маша");
                break;
            case "Aibek":
                System.out.println("Привет, Айбек");
                break;
            default:
                System.out.println("Такого нет");
        }

    }
}




