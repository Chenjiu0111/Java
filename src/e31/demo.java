package e31;

public class demo {
    public static double earthMoonWeight(String name,int weight,String unit) {
        double earthMoonWeight = weight * (1.62 / 9.81);
        System.out.println("嗨!"+name +"你在地球上的体重是" +weight + "磅，在月球上的体重大约是"+earthMoonWeight+unit);
        return earthMoonWeight;

    }
    public static void main(String[] args) {
        earthMoonWeight("小明", 70, "kg");
        earthMoonWeight("Alice", 150, "lbs");
        earthMoonWeight("张三", 65, "kg");
    }
}
