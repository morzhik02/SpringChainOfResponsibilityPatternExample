package ru.izteleu.chainOfResponsibility;

import org.springframework.stereotype.Component;

@Component
public class WelcomePrinter extends GenericPrinter{
    private static final String GREETING = "Welcome to the autowired chain";

    @Override
    protected String getGreeting() {
        return GREETING;
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
