package com.liust.helloworldDemo;

import java.io.PrintStream;

import javax.inject.Inject;

/**
 * @program: guiceDome
 * @description:
 * @author: liust
 * @create: 2018-05-20 13:21
 **/
public class PrintStreamWriter implements MyDestination {
    private PrintStream destination;

    @Inject
    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    @Override
    public void write(String s) {
        destination.println(s);
    }
}
