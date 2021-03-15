public class Main {
    public static void main(String[] args) {
        float startBalance = 100;
        float refill = 1500.15F;
        int bonus = 0;
        float totalBalance;
        if (refill >= 1_000) {
            bonus = (int) (refill / 100);
            totalBalance = refill + startBalance + bonus;
            System.out.println(bonus);
        } else totalBalance = startBalance + refill;
        System.out.print(totalBalance);
    }

}
