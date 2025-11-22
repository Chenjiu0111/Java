package e41;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        final double RUPEE_RATE = 0.44;    // 1美元 = 0.44卢比
        final double GIL_RATE = 54.87;     // 1美元 = 54.87吉尔
        final double COIN_RATE = 2.23;     // 1美元 = 2.23金币

        // 先显示提示信息，再获取输入
        System.out.println("What's your $USD balance?");
        System.out.print(">> ");
        double usdAmount = scan.nextDouble();

        // 为每种货币生成独立的通货膨胀率
        double rupeeInflation = -0.03 + (0.05 - (-0.03)) * rand.nextDouble();
        double gilInflation = -0.03 + (0.05 - (-0.03)) * rand.nextDouble();
        double coinInflation = -0.03 + (0.05 - (-0.03)) * rand.nextDouble();

        // 计算考虑通货膨胀后的实际货币数量（要乘以基础汇率）
        double rupees = usdAmount * RUPEE_RATE * (1 + rupeeInflation);
        double gil = usdAmount * GIL_RATE * (1 + gilInflation);
        double goldenCoins = usdAmount * COIN_RATE * (1 + coinInflation);

        // 输出结果
        System.out.println("\nYour rates today are: ");
        System.out.println("- - - - - - - - - - - - -");
        System.out.println("Rupees: " + rupees);
        System.out.println("Gil: " + gil);
        System.out.println("Golden Coins: " + goldenCoins);

        scan.close();
    }
}
