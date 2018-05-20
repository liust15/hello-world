package com.liust.helloworldDemo;

import com.liust.MyApplet;

import javax.inject.Inject;
import javax.inject.Provider;


/**
 * @program: guiceDome
 * @description:
 * @author: liust
 * @create: 2018-05-20 11:05
 **/
public class StringWritingApplet implements MyApplet {
    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }


    private void writeString() {
        destination.write( stringProvider.get());
    }

    public void run() {
        writeString();
    }
}
