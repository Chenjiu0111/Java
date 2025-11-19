package e9;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("我无嘴能言，无耳能听。我没有形体，却随风而生。我是什么？");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
