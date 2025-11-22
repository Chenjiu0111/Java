package e39;

public class demo {
    public static void launchCalculator(double timeOne, double timeTwo){
        double distance = timeOne * timeTwo;
        long roundedDistance = Math.round(distance);
        // 打印结果
        System.out.println("Rounded distance: " + roundedDistance + " meters");
    }
    public static void main(String[] args) {
        launchCalculator(1000,1000);
    }
}
