/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.soal2sedang;

/**
 *
 * @author Faiq
 */
import java.util.Scanner;

public class Soal2Sedang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari jari tabung : ");
        int r = input.nextInt();
        System.out.println("Masukkan tinggi tabung : ");
        int t = input.nextInt();

        double phi = 3.14159;
        double volume = (phi) * r * r * t;
        System.out.println("Volume tabung adalah : " + volume);

    }
}
