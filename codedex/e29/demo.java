package e29;
/*创建一个名为 returnBin() 的 public static void 方法，该方法接收一个 String 数组作为参数。该函数将以如下格式输出数组中的所有元素：

Items to Return
—--------------
1. Clothes
2. Shoes
3. Laptop

本练习将用到字符串拼接和 for 循环。方法调用已为您完成。*/
public class demo {
    public static void returnBin(String[] a)
        {
            System.out.println("Items to Return");
            System.out.println("—--------------");
            // 使用for循环遍历数组
            for(int i=0;i<a.length;i++) {
                System.out.println((i+1)+"."+a[i]);
            }
        }
    public static void main(String[] args) {
        String[] itemsToReturn = {"Clothes", "Shoes", "Laptop"};
        returnBin(itemsToReturn);
    }
}

