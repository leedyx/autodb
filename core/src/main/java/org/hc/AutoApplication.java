package org.hc;

import org.hc.service.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class AutoApplication {


    private final static Logger LOGGER = LoggerFactory.getLogger(AutoApplication.class);


    private final static ExecutorService AUTO_SERVICE = Executors.newFixedThreadPool(1);


    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(AutoApplication.class);

        ApplicationContext context = application.run(args);

        AutoService autoService = context.getBean(AutoService.class);

        AUTO_SERVICE.execute(autoService);

    }


}
