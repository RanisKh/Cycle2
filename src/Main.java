public class Main {
    public static void main(String[] args) {
        System.out.println("1 task");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println(" 2 task");
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(y + " ");
        }
        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }

        System.out.println(" 3 task");
        int yCountry = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 1;
        int difference = born - death;
        while (year < 10) {
            year++;
            yCountry += yCountry * difference / 1000;
            System.out.println("Год " + year + " численность населения составляет " + yCountry);
        }

        System.out.println("4 task");
        int sum = 15_000;
        int q = 0;
        while (sum < 12_000_000) {
            q++;
            sum += sum / 100 * 7;
            System.out.println("За " + q + " месяцев, накопится " + sum);
        }

        System.out.println(" 5 task");
        int summa = 15_000;
        int w = 0;
        while (summa < 12_000_000) {
            w++;
            summa += summa / 100 * 7;
            if (w % 6 == 0) {
                System.out.println("За " + w + " месяцев, накопится " + summa);
            }
        }

        System.out.println("6 task");
        int summ = 15_000;
        int e = 0;
        int yearOne = 9 * 12;
        while (e < yearOne) {
            e++;
            summ += summ / 100 * 7;
            if (e % 6 == 0) {
                System.out.println("За " + e + " месяцев, накопится " + summ);
            }
        }

        System.out.println(" 7 task");
        int firstFriday = 3;
        while (firstFriday < 31) {
            firstFriday += 7;
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("8 task");
        int period = 79;
        int starSeeing = 0;
        int currentYear = 2025;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int years = start; years < end; years++) {
            if (years % period == starSeeing) {
                System.out.println(years);
            }
        }
    }
}