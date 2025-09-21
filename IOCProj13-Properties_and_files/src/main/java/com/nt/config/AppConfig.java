package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nt.sbeans")
@PropertySource("com/nt/common/myfile.properties")
public class AppConfig {

}
