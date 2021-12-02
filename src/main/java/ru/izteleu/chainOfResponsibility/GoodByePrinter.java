package ru.izteleu.chainOfResponsibility;

import org.springframework.stereotype.Component;

@Component
public class GoodByePrinter extends GenericPrinter{
    private static final String GREETING = "Goodbye";

    @Override
    protected String getGreeting() {
        return GREETING;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
