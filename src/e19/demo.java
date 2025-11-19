package e19;
/*创建一个从 1 到 10 计数的循环。当循环到达一个能被 2 和 3 整除的数字时，打印“在 NUM 处中断”并退出循环，其中 NUM 是能被 2 和 3 整除的数字。

要检查一个数是否能被另一个数整除，可以使用取模运算 % 。

如果 a % b 等于 0，则 a 能被 b 整除。*/
public class demo {
    public static void main(String[] args) {
        for(int j=1;j<10;j++){
            System.out.println("j = " + j);
            if(j%2==0 && j%3==0){
                System.out.println(j);
                break;
            }
        }
    }
}
