package e27;
/*创建一个名为 isEqual222 的 public static 方法，该方法接受三个 int 参数，并返回一个 boolean 值。此方法会将这三个值相加，并检查结果是否为 222。

如果数字是 222，则返回 true ！否则，返回 false 。

准备好测试后，按下运行按钮！该方法已为您调用。*/
public class demo {
    public static boolean isEqual222(int a,int b,int c){
        int sum = a + b + c;
        if (sum == 222) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("The first method is " + isEqual222(47, 85, 90));
        System.out.println("The second method is " + isEqual222(90, 10, 47));
        System.out.println("The third method is " + isEqual222(30, 80, 82));
    }
}

