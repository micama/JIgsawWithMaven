package org.jpms.othergreeter;

import org.jpms.api.Greeter;

public class OtherGreeter implements Greeter {

    @Override
    public void greet() {
        System.out.println("Hello Other!");
    }

}
