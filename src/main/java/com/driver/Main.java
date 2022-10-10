package com.driver;

public class Main {
        public static class Product{
                public int product(int x, int y){
                        return y;
                }
                public int product(int x, int y, int z) {
                        return z;
                }
                public double product(double x, double y) {
                        return x;
                }
        }
        public static void main(String args[]){
                Product p = new Product();
                System.out.println(p.product(12, 34));
                System.out.println(p.product(1, 3, 5));
                System.out.println(p.product(1.445, 4.66));
        }
}
