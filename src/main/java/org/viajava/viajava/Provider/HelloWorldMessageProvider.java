package org.viajava.viajava.Provider;

public class HelloWorldMessageProvider implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello World!";
    }
}
