package ru.izteleu.chainOfResponsibility;

import org.springframework.stereotype.Component;

@Component
public class CleaningSpacePrinter extends GenericPrinter{
    private static final String GREETING = "Cleaning space after";

    @Override
    protected String getGreeting() {
        return GREETING;
    }
}
