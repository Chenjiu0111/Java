package e12;
/*宠物店想给养猫人士寄送优惠券！🐈

编写一个程序，其中包含一个名为isCatOwner变量，其值为 true 或 false。

如果属实，则打印“使用优惠码 MEOW2025 可享指定猫咪商品八折优惠”。否则，打印通用信息“欢迎光临 Pets Pets Pets 宠物店！”。

点击“运行”，查看结果！*/
public class HelloWorld {
    public static void main(String[] args) {
        boolean isCatOwner = true;
        if (isCatOwner) {
            System.out.println("使用优惠码 MEOW2025 可享指定猫咪商品八折优惠");
        }
        else {
            System.out.println("欢迎光临 Pets Pets Pets 宠物店！");
        }
    }
}
