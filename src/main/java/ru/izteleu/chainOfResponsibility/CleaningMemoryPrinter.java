package ru.izteleu.chainOfResponsibility;

import org.springframework.stereotype.Component;

@Component
public class CleaningMemoryPrinter extends GenericPrinter{
    private static final String GREETING = "Cleaning memory after";

    @Override
    protected String getGreeting() {
        return GREETING;
    }
}
