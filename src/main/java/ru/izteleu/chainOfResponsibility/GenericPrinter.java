package ru.izteleu.chainOfResponsibility;
import org.springframework.core.Ordered;

public abstract class GenericPrinter implements Printer, Ordered {
    public void print(User user) {
        String prefix = "Mr";
        if (user.getGender() == 'F') {
            prefix = "Mrs";
        }
        System.out.println(getGreeting() + ' ' + prefix + ' ' + user.getName());
    }

    protected abstract String getGreeting();

    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
