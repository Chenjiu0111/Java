package e37;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();//读取整行
        String[] words = sentence.trim().split("\\s+");// \\s+ 匹配一个或多个连续的空白字符。
        int wordCount = words.length;
        System.out.println("This sentence has " + wordCount + " words!");
    }
}
