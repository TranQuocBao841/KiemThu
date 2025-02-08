package com.example.Asmbainop;

import java.util.List;

public class baitap {
    public static int bai1(int a, int b) {
        return a * b;
    }

    public static int bai2(int a, int b) {
        if (b == 0) throw new ArithmeticException("khong chia het cho 0");
        return a / b;
    }

    public static double bai3(List<Integer> numbers) {
        if (numbers.isEmpty()) throw new ArithmeticException("danh sach trong");
        return numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static int getElementAtIndex(int[] arr, int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException("Index out of bounds");
        return arr[index];
    }


    //bai5
    class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public String getName(User user) {
        if (user == null) throw new NullPointerException("nguoi dung la null");
        return user.getName();
    }

    //bai 6
    public int PhanTuNhoNhat(int[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Array is empty");
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

//bai 3 bổ sung
public double average(int[] numbers) {
    if (numbers.length == 0) throw new ArithmeticException("List is empty");
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return (double) sum / numbers.length;
}
}
