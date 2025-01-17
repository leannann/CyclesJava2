public class Main {
    public static void main(String[] args)
    {
        // Task 1
        System.out.println("Задача 1");
        int savings = 0;
        int monthCount = 0;
        while (savings <= 2_459_000){
            savings += 15_000;
            monthCount++;
            if (savings >= 2_459_000) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " +
                        savings + " рублей");
            }
        }
        // Task 2
        System.out.println("Задача 2");
        int count = 1;
        while (count <= 10){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        for (count = 10; count > 0; count--){
            System.out.print(count + " ");
        }
        // Task 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 0;
        int increase = 17 * (12_000_000 / 1000) - 8 * (12_000_000 / 1000);
        while (year < 10){
            year++;
            population += increase;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        // Task 4
        System.out.println("Задача 4");
        float deposit = 15_000f;
        float rate = 1.07f;
        monthCount = 0;
        while (deposit <= 12_000_000){
            deposit *= rate;
            monthCount++;
            System.out.println("Месяц " + monthCount + ", сумма накоплений равна " +
                    deposit + " рублей");
        }
        // Task 5
        System.out.println("Задача 5");
        deposit = 15_000f;
        monthCount = 0;
        while (deposit <= 12_000_000){
            deposit *= rate;
            monthCount++;
            if (monthCount % 6 == 0) {
                System.out.println("Месяц " + monthCount + ", сумма накоплений равна " +
                        deposit + " рублей");
            }
            // Task 6
            System.out.println("Задача 6");
            deposit = 15_000f;
            monthCount = 12 * 9; // 9 лет
            int halfYearCounter = 0;
            while (monthCount >= 0){
                deposit *= rate;
                monthCount--;
                if (monthCount % 6 == 0) {
                    halfYearCounter++;
                    System.out.println("Полугодие " + halfYearCounter + ", сумма накоплений равна " +
                            deposit + " рублей");
                }
                }
            // Task 7
            System.out.println("Задача 7");
            int firstFriday = 1;
            int daysInMonth = 31;
            int currentFriday = firstFriday;
            while (currentFriday <= daysInMonth) {
                System.out.println("Сегодня пятница, " + currentFriday +
                        "-е число. Необходимо подготовить отчет");
                currentFriday += 7;
            }
            // Task 8
            System.out.println("Задача 8");
            int frequency = 79;
            int currentYears = 2025; // текущий год
            int lastYears = currentYears - 200; // год 200 лет до текущего
            int futureYears = currentYears + 100; // год через 100 лет от текущего
            while (lastYears <= futureYears) {
                if (lastYears % frequency == 0) {
                    System.out.println(lastYears);
                }
                lastYears++;
            }
        }
    }
}