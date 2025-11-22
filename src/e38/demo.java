package e38;
import java.util.Random;
import java.util.Scanner;


public class demo {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-10之间猜数字：");
        int userNumber = scanner.nextInt();
        int guess = rand.nextInt(11);
        System.out.println("💻 The computer guesses: " + guess);

        // 比较猜测结果并输出相应信息
        if (guess == userNumber) {
            System.out.println("✅ The computer guessed right!");
        } else {
            System.out.println("❌ The computer guessed wrong!");
        }

        // 关闭Scanner对象
        scanner.close();
    }
}
