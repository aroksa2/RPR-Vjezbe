package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Double> br = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite broj (ili 'kraj' za kraj unosa): ");
            String unos = scanner.next();

            if (unos.equalsIgnoreCase("kraj")) {
                if (br.isEmpty()) {
                    System.out.println("Nema unesenih brojeva.");
                } else {
                    double min = findMin(br);
                    double max = findMax(br);
                    double mean = calculateMean(br);
                    double stdDev = calculateStandardDeviation(br);

                    System.out.println("Minimum: " + min);
                    System.out.println("Maksimum: " + max);
                    System.out.println("Srednja vrijednost: " + mean);
                    System.out.println("Standardna devijacija: " + stdDev);
                }
                break;
            } else {
                try {
                    double broj = Double.parseDouble(unos);
                    br.add(broj);
                } catch (NumberFormatException e) {
                    System.out.println("Unesite validan broj ili 'kraj' za kraj unosa.");
                }
            }
        }

        scanner.close();
    }

    public static double findMin(List<Double> br) {
        double min = Double.MAX_VALUE;
        for (double num : br) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findMax(List<Double> br) {
        double max = Double.MIN_VALUE;
        for (double num : br) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double calculateMean(List<Double> br) {
        double sum = 0;
        for (double num : br) {
            sum += num;
        }
        return sum / br.size();
    }

    public static double calculateStandardDeviation(List<Double> br) {
        double mean = calculateMean(br);
        double suma = 0;

        for (double num : br) {
            double d = num - mean;
            suma += d * d;
        }

        double v = suma / br.size();
        return Math.sqrt(v);
    }
}