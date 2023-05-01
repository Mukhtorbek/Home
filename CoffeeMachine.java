import java.util.Scanner;

public class CoffeeMachine {

    static void espresso() {
        System.out.println("Приготовление эспрессо...");
    }

    static void americano() {
        System.out.println("Приготовление американо...");
        espresso();
        System.out.println("Добавление воды...");
    }

    static void cappuccino() {
        System.out.println("Приготовление капучино...");
        espresso();
        System.out.println("Добавление вспененного молока...");
    }

    static void tea() {
        System.out.println("Приготовление чая...");
    }

    static void prepareDrink(int button) {
        switch (button) {
            case 1:
                espresso();
                break;
            case 2:
                americano();
                break;
            case 3:
                cappuccino();
                break;
            case 4:
                tea();
                break;
            default:
                System.out.println("Неверный выбор.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите напиток (1 - эспрессо, 2 - американо, 3 - капучино, 4 - чай):");
        int userChoice = scanner.nextInt();
        prepareDrink(userChoice);
    }
}
