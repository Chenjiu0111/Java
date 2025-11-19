package e13;
/*还记得上次我们只给猫主人发放优惠码吗？这次也给狗主人发一个吧！我们不能把他们落下。😞

创建两个布尔变量， isCatOwner和isDogOwner ，并分别赋予它们一个值。

编写一个程序，使其能够提供以下特殊功能：

使用优惠码 MEOW 可享猫咪用品 20% 折扣。
使用优惠码 WOOF 可享狗狗用品 20% 折扣。
如果您既不养猫也不养狗，请写一条通用的“欢迎光临宠物店！”信息。*/
public class demo {
    public static void main(String[] args) {
        boolean isCatOwner = false;
        boolean isDogOwner = false;
        if (isCatOwner) {
            System.out.println("使用优惠码 MEOW 可享猫咪用品 20% 折扣。");
        }
        else if (isDogOwner) {
            System.out.println("使用优惠码 WOOF 可享狗狗用品 20% 折扣。");
        }
        else {
            System.out.println("欢迎光临宠物店！");
        }
    }
}
