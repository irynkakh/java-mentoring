import java.util.Random;
public class Main {
    public static void main(String[] args) {
        final int COUNT = 6;
        final int MAX_LIMIT = 60;
        final int MIN_LIMIT = 1;
        Random random = new Random();
        int[] randomNumbers = new int[COUNT];
        String lotteryTicket = "";
        randomNumbers[0] = random.nextInt((MAX_LIMIT - MIN_LIMIT)+1) + MIN_LIMIT;
        for (int number = 1; number < randomNumbers.length; number++) {
            do {
                randomNumbers[number] = random.nextInt((MAX_LIMIT - MIN_LIMIT)+1) + MIN_LIMIT;
            }
            while (randomNumbers[number] < randomNumbers[number - 1] || randomNumbers[number - 1] == randomNumbers[number]);
        }
        for (int number = 0; number < randomNumbers.length; number++) {
            if (randomNumbers[number] <= 9) {
                lotteryTicket += ("0" + randomNumbers[number]);
            } else {
                lotteryTicket += randomNumbers[number];
            }
        }
        System.out.println(lotteryTicket);
    }
}