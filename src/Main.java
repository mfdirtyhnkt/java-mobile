public class Main {
    public static void main(String[] args) {

        int InitialBalance = 100;
        int TopUpAmount = 1200;
        int BonusThreshold = 1000;
        int BonusPer100 = 100;


        int BonusAmount = 0;
        int FinalBalance = 0;


        if (TopUpAmount > BonusThreshold) {
            BonusAmount = TopUpAmount / BonusPer100;
        }

        FinalBalance = InitialBalance + TopUpAmount + BonusAmount;


        System.out.println("Итоговый баланс: " + FinalBalance + " рублей");
        System.out.println("Начисленные бонусы: " + BonusAmount + " рублей");
    }
}
