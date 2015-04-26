/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.creational.factorymethod;

/**
 *
 */
public class MobilePhoneFactory extends PhoneFactory {

    @Override
    public Product createPhone() {
        return new MobilePhone();
    }

}
