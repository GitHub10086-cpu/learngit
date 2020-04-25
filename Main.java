import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("蜜汁游戏~");
        Scanner a = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String x = a.nextLine();
        System.out.print("输入一个数： ");
        int c = a.nextInt();
        System.out.println("さあぁ、ゲームを始めるよ！");
        if (c >= 0) {
            System.out.println("I win!");
        } else {
            System.out.println("You win!");
        }
        if (c <= -1) {
            System.out.println("Oh,that was Interesting");
        } else {
            System.out.println("チェックメイト");
        }
        System.out.println("Name: ");
        System.out.println(x);
    }
}
