package com.niit;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import  org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import javax.sql.DataSource;


@Configuration
@ComponentScan(basePackages = "com.niit")
public class Config {

    @Bean
    public SessionFactory sessionFactory() {
        LocalSessionFactoryBuilder lsf = new LocalSessionFactoryBuilder(getDataSource());

        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        lsf.addProperties(hibernateProperties);
        Class classes[] = {Product.class};
        return lsf.addAnnotatedClasses(classes).buildSessionFactory();
    }

    @Bean
    public DataSource getDataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/world");
        dataSource.setUsername("root");
        dataSource.setPassword("password");
        return dataSource;
    }

}
