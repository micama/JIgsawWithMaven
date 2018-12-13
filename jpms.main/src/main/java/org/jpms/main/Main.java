package org.jpms.main;

import java.util.ServiceLoader;
import org.jpms.api.Greeter;
import org.jpms.maths.MathUtils;

public class Main {

    public static void main(String[] args) {

        long res = MathUtils.add(1, 2);
        System.out.println("result: " + res);

        System.out.println("--------------------");

        ServiceLoader.load(Greeter.class)
                .stream()
                .forEach(provider -> provider.get().greet());

        System.out.println("--------------------");
    }

}
