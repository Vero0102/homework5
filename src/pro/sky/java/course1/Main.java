package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // Задача №1.1
        int[] arr;
        arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // Задача №1.2
        float[] b = {1.57f, 7.654f, 9.986f};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        // Задача №1.3
        boolean[] c = {true, false};
        System.out.println(c[0]);
        System.out.println(c[1]);

        // Задача №2
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
        System.out.println(b[0] + ", " + b[1] + ", " + b[2]);
        System.out.println(c[0] + ", " + c[1]);

        // Задача №3
        System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
        System.out.println(b[2] + ", " + b[1] + ", " + b[0]);
        System.out.println(c[1] + ", " + c[0]);

        // Задача №4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2] + ".");


    }
}
