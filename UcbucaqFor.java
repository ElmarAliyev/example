/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misallarinHelleri;

/**
 *
 * @author Elmar
 */
public class UcbucaqFor {

    public static void ucbucaqFor(int a) {
        for (int i = 1; i <= a; i++) {

            for (int k = a; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    public static void ucbucaqFor2(int a) {
        for (int i = 1; i <= a; i++) {

            for (int k = a; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

//            for (int k = 0; k < a; k++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        ucbucaqFor(6);
    }
}
