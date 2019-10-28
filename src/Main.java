public class Main<name> {

    public static void main(String[] args) {
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




