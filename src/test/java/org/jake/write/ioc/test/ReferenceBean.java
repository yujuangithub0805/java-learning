package org.jake.write.ioc.test;

public class ReferenceBean {

    private HelloWorld helloWorld;

    public void say(){
        helloWorld.say();
    }


    public HelloWorld getHelloWorld() {
        return helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }
}
