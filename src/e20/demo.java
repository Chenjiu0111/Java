package e20;
/*编写一个程序，使用数字 1 到 52 来遍历一副标准扑克牌中的全部 52 张牌。第 32 张牌来自另一副牌！如果牌堆达到 32，则程序终止，并输出“第 32 项中发现了一张错误的牌”。

您的输出结果应如下所示：

Card 1
Card 2
Card 3
        ...
Card 31
An incorrect card was found in item 32.
*/
public class demo {
    public static void main(String[] args) {
        for(int j=1;j<52;j++){
            System.out.println("Card " + j);
            if(j == 32)
            {
            System.out.println("An incorrect card was found in item 32");
            break;
            }
        }
    }
}
