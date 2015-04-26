/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.structual.decorator;

/**
 *
 */
public class SimpleNumberPrinter implements NumberPrinter {

    @Override
    public void printNumbers(int toNumber) {
        for (int i = 0; i <= toNumber; i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

}
