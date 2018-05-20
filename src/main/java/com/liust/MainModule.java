package com.liust;

import com.google.inject.AbstractModule;
import com.liust.helloworldDemo.HelloWorldModule;


/**
 * @program: guiceDome
 * @description:
 * @author: liust
 * @create: 2018-05-20 13:54
 **/
public class MainModule extends AbstractModule {
    @Override
    protected void configure() {
     install(new HelloWorldModule());
    }
}
