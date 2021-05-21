package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(1));

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {

            return -1;
        }

        int count = 0;
        int lPrime = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                count = 0;
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        count ++;
                    }
                }

                if (count == 2) {

                    lPrime = i;
                }
            }
        }

        return lPrime;

    }

}

