package com.liust.helloworldDemo;

import com.google.inject.AbstractModule;
import com.liust.MyApplet;

import java.io.PrintStream;

/**
 * @program: guiceDome
 * @description:
 * @author: liust
 * @create: 2018-05-20 14:05
 **/
public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyApplet.class).to(StringWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
        bind(String.class).annotatedWith(Output.class)
                .toInstance("Hello World!");
    }
}
