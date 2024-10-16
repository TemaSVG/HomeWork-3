public class Main {
    public static void main(String[] args) {
        //Задача 1
        int x = 2000000000;
        byte y = 120;
        short z = 30000;
        long a = 10000000000L;
        float b = 3.70f;
        double c = 4.54d;
        System.out.println(String.format("\nЗначение переменной x с типом int равно %d\n" +
                " Значение переменной y с типом byte равно %d\n Значение переменной z с типом short равно %d\n " +
                "Значение переменной a с типом long равно %d\n Значение переменной b с типом float равно %f\n " +
                "Значение переменной c с типом double равно %f\n", x, y, z, a, b, c));
        //Задача 2
        float q = 27.12f;
        long w = 987678965549L;
        float e = 2.786f;
        short r = 569;
        short t = -159;
        short s = 27897;
        byte d = 67;
        //Задача 3
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int sheetsPaper = 480;
        int studentSheets = sheetsPaper / (lP + aS + eA);
        System.out.println(String.format("На каждого ученика рассчитано %d листов бумаги.\n", studentSheets));
        //Задача 4
        int productivityInTwoMinutes = 16;
        int productivityInOneMinutes = productivityInTwoMinutes / 2;
        int productionInTwentyMinutes = productivityInOneMinutes * 20;
        int productionDay = productivityInOneMinutes * 60 * 24;
        int productionThreeDay = productionDay * 3;
        int productionMount = productionDay * 30;
        System.out.println(String.format("За 20 минут машина произвела %d штук бутылок\n" +
                 "За сутки машина произвела %d штук бутылок\n" +
                 "За 3 дня машина произвела %d штук бутылок\n" +
                 "За месяц машина произвела %d штук бутылок\n", productionInTwentyMinutes, productionDay, productionThreeDay, productionMount));
        //Задача 5
        int totalNumberOfCans = 120;
        int whitePaintCountForClass = 2;
        int brownPaintCountForClass = 4;
        int paintForClass = whitePaintCountForClass + brownPaintCountForClass;
        int countOfClasses = totalNumberOfCans / paintForClass;
        int totalWhitePaint = countOfClasses * whitePaintCountForClass;
        int totalBrownPaint = countOfClasses * brownPaintCountForClass;
        System.out.println(String.format("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n", countOfClasses, totalWhitePaint, totalBrownPaint));
        //Задача 6
        int weightOfOneBanana = 80;
        int weightOfOneHundredMlMilk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;
        int countOfBananas = 5;
        int countOfOneHundredMlMilk = 2;
        int countOfIceCream = 2;
        int countOfEggs = 4;
        int weightbreakfastSports = (countOfBananas * weightOfOneBanana) + (countOfOneHundredMlMilk * weightOfOneHundredMlMilk) + (countOfIceCream * weightIceCream) + (countOfEggs * weightEgg);
        float weightBreakFastSportInKg = (float) weightbreakfastSports / 1000;
        System.out.println(String.format("Вес спортзавтрака %d грамм или %s кг.\n", weightbreakfastSports, weightBreakFastSportInKg));
        //Задача 7
        int solveWeightLoss = 7;
        int weightLossTwoHundredAndFiftyPerGrDay = 250;
        int weightLossFiveHundredGrDay = 500;
        int countDayLossTwoHundredFiftyPerGr = (solveWeightLoss * 1000) / weightLossTwoHundredAndFiftyPerGrDay;
        int countDayLossFiveHundredGr = (solveWeightLoss * 1000) / weightLossFiveHundredGrDay;
        int averageCountDaySolveWeightLoss = (countDayLossTwoHundredFiftyPerGr + countDayLossFiveHundredGr) / 2;
        System.out.println(String.format("Для похудения спортсмену на 7 кг при диете в 250 гр в день, необходимо %d дней, а при диете в 500 гр в день, понадобится %d дней. Среднее количество дней для похудения %d\n", countDayLossTwoHundredFiftyPerGr, countDayLossFiveHundredGr, averageCountDaySolveWeightLoss));
        //Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int newSalaryMasha = (int) (salaryMasha * 1.1);
        int newSalaryDenis = (int) (salaryDenis * 1.1);
        int newSalaryKristina = (int) (salaryKristina * 1.1);
        int differenceSalaryMasha = Math.abs(salaryMasha - newSalaryMasha);
        int differenceSalaryDenis = Math.abs(salaryDenis - newSalaryDenis);
        int differenceSalaryKristina = Math.abs(salaryKristina - newSalaryKristina);
        System.out.println(String.format("Маша теперь получает %d рублей. Годовой доход вырос на %d рублей\n" +
                "Денис теперь получает %d рублей. Годовой доход вырос на %d рублей\n" +
                "Кристина теперь получает %d рублей. Годовой доход вырос на %d рублей\n", newSalaryMasha, differenceSalaryMasha, newSalaryDenis, differenceSalaryDenis, newSalaryKristina, differenceSalaryKristina));
    }
}