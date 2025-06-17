package com.springjdbc;

import com.springjdbc.config.AppConfig;
import com.springjdbc.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);
        
        // Use as needed
        System.out.println(studentDao.getStudentById(101));
    }
}
