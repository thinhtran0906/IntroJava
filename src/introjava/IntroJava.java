/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introjava;

import java.util.Scanner;


public class IntroJava {

    public static void main(String[] args) {
        double length, width;
        double area, cir;
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
        
        area = length * width;
        cir = (length + width) * 2;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + cir);
    }
    
}
