/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.az.methods;

/**
 *
 * @author Elmar
 */
public class Test {

    static int a = 4;

    public static void main(String[] args) {
        artir(a);
        System.out.println(a);
    }

    public static void artir(int deyer) {
        deyer = deyer + 3;
        System.out.println("metoddaki a: " +deyer);
    }
}
