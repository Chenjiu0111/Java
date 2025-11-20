package e28;
/*我们将练习如何使用名为 multiply() 的方法正确地重载方法。

multiply() 方法已在编辑器中为您编写完成，其返回类型为 int ，参数为 int 数组。

public static int multiply(int[] channelCodes) {}

您需要创建以下内容：

一个接受三个 int 参数的 multiply() 方法，用于将这三个数字相乘。
一个接受两个 double 浮点数参数的 multiply() 方法，用于将两个数字相乘。
完成后，点击运行按钮，使用预设值测试你的方法！💫*/
public class demo {
    public static int multiply(int[] channelCodes) {
        int result = 1;
        for (int i = 0; i < channelCodes.length; i++) {
            result *= channelCodes[i];
        }
        return result;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 重载方法2：接受两个double参数
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("The result is " + multiply(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println("The result is " + multiply(new int[] {13, 8, 7}));
        System.out.println("Three int multiplication: " + multiply(2, 3, 4));
        System.out.println("Two double multiplication: " + multiply(233.9, 10.5));
    }
}
