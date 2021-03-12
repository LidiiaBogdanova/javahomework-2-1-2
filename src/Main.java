public class Main {
    public static void main(String[] args) {
        float start_balance = 100;
        float refill = 1500;
        int bonus = 0;
        float total_balance;
        if (refill >= 1_000) {
            bonus = (int) (refill / 100);
            total_balance = refill + start_balance + bonus;
            System.out.println(bonus);
        } else total_balance = start_balance + refill;
        System.out.print(total_balance);
    }

}
