/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1014;

import java.util.Scanner;

public class Projeto1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanciapercorrida;
        distanciapercorrida = sc.nextInt();
        double totaldecombustivelgasto;
        totaldecombustivelgasto = sc.nextDouble();
        double consumomedio;
        consumomedio = distanciapercorrida / totaldecombustivelgasto;
        System.out.printf("%.3f km/l\n", consumomedio);
    }
}
