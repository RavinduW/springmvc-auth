package com.wdr.springmvc.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.wdr.springmvc")
@PropertySource("classpath:persistence-mysql.properties")
public class AppConfig {

    @Autowired
    private Environment env; //hold data read from properties file

    //define a bean for view resolver
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver intViewResolver = new InternalResourceViewResolver();

        intViewResolver.setPrefix("/WEB-INF/view/");
        intViewResolver.setSuffix(".jsp");

        return intViewResolver;
    }

    @Bean
    public DataSource securityDataSource(){

        ComboPooledDataSource securityDataSource = new ComboPooledDataSource();

        try{
            securityDataSource.setDriverClass(env.getProperty("jdbc.driver"));
            securityDataSource.setJdbcUrl(env.getProperty("jdbc.url"));
            securityDataSource.setUser(env.getProperty("jdbc.user"));
            securityDataSource.setPassword(env.getProperty("jdbc.password"));
            securityDataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
            securityDataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
            securityDataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
            securityDataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));
        }catch(Exception e){
            System.out.println(e);
        }


        return securityDataSource;
    }

    private int getIntProperty(String propName){
        String propVal = env.getProperty(propName);
        int intPropVal = Integer.parseInt(propVal);

        return intPropVal;
    }

}
