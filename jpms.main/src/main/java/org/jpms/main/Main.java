package org.jpms.main;

import j2html.TagCreator;
import org.jpms.api.Greeter;
import org.jpms.maths.MathUtils;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        System.out.println("Simple dependency");
        long res = MathUtils.add(1, 2);
        System.out.println("result: " + res);

        System.out.println("--------------------");

        System.out.println("Services:");
        ServiceLoader.load(Greeter.class)
            .stream()
            .forEach(provider -> provider.get().greet());

        System.out.println("--------------------");
        
        System.out.println("third-party library:");
        System.out.println(TagCreator.body().toString());
        
    }

}

