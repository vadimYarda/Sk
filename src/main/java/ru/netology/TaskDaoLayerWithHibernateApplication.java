package ru.netology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.beans.Transient;

@SpringBootApplication
public class TaskDaoLayerWithHibernateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskDaoLayerWithHibernateApplication.class, args);
    }
}
