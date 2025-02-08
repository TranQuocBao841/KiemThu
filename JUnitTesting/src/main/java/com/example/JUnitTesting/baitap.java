package com.example.JUnitTesting;

public class baitap{
    public static int Tong(int a, int b) {
        return a + b;
    }

    public static int Hieu(int a, int b) {
        return a - b;
    }

    public static int Nhan(int a, int b) {
        return a * b;
    }

    public static int Chia(int a, int b) {
        if (b == 0) throw new ArithmeticException("không chia cho 0");
        return a / b;
    }

    public  static int TongNsole(int n) {
        return n * n;
    }

    public static int TongNsoNguyen(int N){
        return N*(N+1)/2;
    }

    public static int TimViTri(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


    public static int tinhTrungBinhCong(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}

