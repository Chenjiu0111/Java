package e15;

import java.util.Scanner;

/*今天你就是咖啡店的咖啡师啦！☕️
让我们创建一个票务自动化系统，以便您可以根据订单获取每种饮品的配料清单。
创建布尔变量isLatte 、 isIced和withMatcha 。
创建整数变量itemsOrdered和vanillaPumps 。

首先，创建一个符合以下顺序的 if/else 语句：
如果顾客点了一杯冰拿铁，请打印“浓缩咖啡、牛奶、冰块、糖浆”。
否则，如果顾客点了一杯抹茶拿铁，则打印“抹茶、燕麦奶、冰块、香草”。
否则，如果顾客点了一杯拿铁，则打印“浓缩咖啡，蒸牛奶”。
否则，打印“选择一种饮品开始吧！”
创建另一个 if 语句，条件如下：

如果顾客订购超过 1 件商品，请打印“提供杯架”。
在最后一个 if 语句中添加以下条件：

如果顾客点了 2 泵或更多香草糖浆，请打印“加收 1 美元”。
以下是一个示例工单，供您为变量赋值。

“嗨，外面好冷啊！冬天真的来了，对吧？请给我一杯热乎乎的抹茶拿铁好吗？可以加三泵香草糖浆吗？谢谢！”*/
public class demo {
    public static void main(String[] args) {
        boolean isLatte = true; //是否拿铁
        boolean isIced = false; //是否加冰
        boolean withMatcha =true; //抹茶味
        int itemsOrdered = 1; //已订购的商品
        int vanillaPumps =3; //香草糖浆
        if(isLatte==true && isIced==true && withMatcha==false)//冰拿铁
        {
            System.out.println("浓缩咖啡、牛奶、冰块、糖浆");
        }
        else if(isLatte==true && isIced==false && withMatcha==true)//抹茶拿铁
        {
            System.out.println("抹茶、燕麦奶、冰块、香草");
        }
        else if(isLatte==true && isIced==false && withMatcha==false)//拿铁
        {
            System.out.println("浓缩咖啡，蒸牛奶");
        }
        else
        {
            System.out.println("选择一种饮品开始吧！");
        }
        if(itemsOrdered >= 2)
        {
            System.out.println("提供杯架");
        }
        if(vanillaPumps >=2)
        {
            System.out.println("加收 1 美元");
        }
    }
}
