package ru.izteleu.chainOfResponsibility;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PrinterChain printerChain = (PrinterChain) context.getBean("printerChain");
        //printerChain.introduceUser(new User("Adil Adilet", 'M'));
        //System.out.println("--------");
        //printerChain.introduceUser(new User("Julie Marot", 'F'));

        User user1;
        String name1, gender1;
        System.out.println("What's your name?");
        name1 = scanner.nextLine();
        System.out.println("What's your gender? Please, input \'M\' or \'F\'");
        gender1 = scanner.next();
        user1 = new User(name1, gender1.charAt(0));

        printerChain.introduceUser(user1);

    }
}
