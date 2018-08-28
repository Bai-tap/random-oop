import java.util.Random;

public class MyRandom {
    public MyRandom() {

    }

    Random random = new Random(1000);

    public int getRandomNumber() {
        return random.nextInt(100);
    }

    public void displayNumber() {
        System.out.printf("STT \t Number\n");
        for (int i = 0; i < 50; i++) {
            System.out.printf("%d \t\t %d\n", i, getRandomNumber());
        }
    }
}
