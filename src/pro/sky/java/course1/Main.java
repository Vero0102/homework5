package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // Задача №1.1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Задача №1.2
        float[] b = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // Задача №1.3
        boolean[] c = {true, false};
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        // Задача №2
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }

        // Задача №3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = b.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        for (int i = c.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(c[i] + ", ");
            } else {
                System.out.println(c[i]);
            }
        }
        //Задача №4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}


