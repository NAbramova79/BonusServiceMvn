public class BonusService {
    public long calculate(long amount, boolean registered) {
        int Percent = registered ? 3 : 1;
        long bonus = amount * Percent / 100;
        if (bonus > 500) {
            bonus = 500;
        }
        return bonus;
    }

}