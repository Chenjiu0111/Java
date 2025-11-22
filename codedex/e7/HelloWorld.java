package e7;
/*让我们创建一张身份证！你将使用不同的数据类型来存储你的身份信息。

创建以下变量：

字符串 name 变量
字符串 state 变量
char gender 变量
整数 age 变量
布尔 organDonor 变量
然后，使用打印语句输出这些*/
public class HelloWorld {
    public static void main(String[] args) {
        String name = "张三";
        String state = "黑龙江";
        String gender = "M";
        int age = 18;
        boolean organDonor = true;
        System.out.println(name + " " + state + " " + gender + " " + age + " " + organDonor);
    }
}
//以下是八种原始类型：
//
//整数值： byte 、 short 、 int 和 long
//浮点值： float 和 double
//布尔值： boolean
//字符： char