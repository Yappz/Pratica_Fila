package com.mycompany.fila;

import java.util.Random;

/**
 *
 * @author 119110926 - Douglas , 119126755 - Mateus
 */
public class TesteFila {

    public static void main(String[] args) {
        Fila p = new Fila();
        int max = 10, r, n;
        Random random = new Random();

        try {
            for (int i = 0; i < max; i++) {
                r = Math.abs(random.nextInt() % max);
                p.push(r, i);
                
            }
            p.imprimir();
            p.pop();
            System.out.println("---------------------------------");
            p.imprimir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
