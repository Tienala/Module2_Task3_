/* Module 2. Task 3
 * Classname: Main
 *
 * Version 1
 *
 * Nataliia Zviertseva, NTU KhPI
 *
 * Create and implement  two interfaces for your class.
 */
package com.company;
public class Main {

    public static void main(String[] args) {
        Priamougolnik priamougolnik1 = new Priamougolnik(3,4);
        Priamougolnik priamougolnik2 = new Priamougolnik((10+5)/5, 4);
        System.out.println(priamougolnik1);
        System.out.println(priamougolnik1.hashCode());
        boolean equals = priamougolnik1.equals(priamougolnik2);
        System.out.println(equals);
    }
}
