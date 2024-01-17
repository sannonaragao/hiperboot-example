package com.hiperbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hiperboot.db.repository.HiperBootRepositoryFactoryBean;

@SpringBootApplication
@EnableJpaRepositories(repositoryFactoryBeanClass = HiperBootRepositoryFactoryBean.class)
public class HiperbootExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(HiperbootExampleApplication.class, args);
    }
}