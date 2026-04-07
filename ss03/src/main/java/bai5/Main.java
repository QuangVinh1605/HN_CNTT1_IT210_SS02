package bai5;


import bai5.config.AppConfig;
import bai5.model.SystemConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SystemConfig config = context.getBean(SystemConfig.class);

        System.out.println("Branch: " + config.getBranchName());
        System.out.println("Opening hours: " + config.getOpeningHour());
    }
}
