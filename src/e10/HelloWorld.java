package e10;
//《企鹅俱乐部》是一款 2010 年代初的 Flash 游戏，迅速走红，成为最热门的电脑游戏之一！在游戏中，你扮演一只企鹅，和朋友们一起在世界各地漫步，进行社交互动。🐧
//《企鹅俱乐部》中的游戏货币是金币，玩家可以用金币购买物品，也可以通过玩小游戏和完成任务获得金币。
//在我们的挑战中，
//在企鹅俱乐部里，1 个金币等于 0.0045 美元。
//创建一个程序，作为货币转换计算器，企鹅可以在其中输入它拥有的硬币数量，程序将返回它拥有的美元金额！
//
//按下“运行”按钮测试您的程序，按下“标记完成”按钮继续。
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        // 添加用户提示
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你拥有的金币数量：");
        // 从用户输入读取金币数量
        int coins = scanner.nextInt();
        double coinValue = 0.0045;  //金币
        double money = coinValue * coins;
        System.out.println(money);
        scanner.close();
    }
}
