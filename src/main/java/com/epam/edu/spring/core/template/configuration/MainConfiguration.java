package com.epam.edu.spring.core.template.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.epam.edu.spring.core.template")
@PropertySource("classpath:application.properties")
@Import({InitializerConfiguration.class,RepositoryConfiguration.class})
public class MainConfiguration {
}
