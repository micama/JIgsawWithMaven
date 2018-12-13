package org.jpms.api.impl;

import org.jpms.api.Greeter;

public class DefaultGreeter implements Greeter {

    @Override
    public void greet() {
        System.out.println("Hello Default!");
    }

}
