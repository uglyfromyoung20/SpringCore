package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:musicPlayer.properties.properties")
public class SpringConfig {
}
