import java.util.Random;
    public class Rand {
        public static void main(String[] args) {
            Random random = new Random();

            int n = random.nextInt(28801);
            System.out.println("Осталось " + n + " секунд");
            int hoursLeft = n / 3600; // количесиво секунд в часе
            if (hoursLeft >= 1) {
                System.out.println("Осталось " + hoursLeft + " часов");
            } else {
                System.out.println("Осталось еще немножко");
            }
            // Выводим информацию для тех, кто не понимает в секундах
            if (hoursLeft >= 1) {
                System.out.println("Осталось " + hoursLeft + " полных часов до конца рабочего дня");
            } else if (n >= 3600) {
                System.out.println("Остался " + (n / 3600) + " час и " + ((n % 3600) / 60) + " минут до конца рабочего дня");
            } else if (n >= 60) {
                System.out.println("Осталось потрудиться  " + (n / 60) + " минут до конца рабочего дня");
            } else {
                System.out.println("Осталось меньше  минуты до конца рабочего дня");
            }
        }
    }


