public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int topUpAmount = 1200;
        int bonusThreshold = 1000;
        int bonusPer100 = 100;


        int bonusAmount = 0;
        int finalBalance = 0;


        if (topUpAmount > bonusThreshold) {
            bonusAmount = topUpAmount / bonusPer100;
        }

        finalBalance = initialBalance + topUpAmount + bonusAmount;


        System.out.println("Итоговый баланс: " + finalBalance + " рублей");
        System.out.println("Начисленные бонусы: " + bonusAmount + " рублей");
    }
}
