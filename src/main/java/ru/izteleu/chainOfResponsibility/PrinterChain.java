package ru.izteleu.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component
public class PrinterChain {
    @Autowired
    private List<Printer> printers;

    @PostConstruct
    public void init() {
        Collections.sort(printers, AnnotationAwareOrderComparator.INSTANCE);
    }

    public void introduceUser(User user) {
        for (Printer printer : printers) {
            printer.print(user);
        }
    }
}

