package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
//@PropertySource("com/nt/common/file")       We are using alias name so this not needed
@ImportResource("com/nt/confg/applicationContext.xml")
public class AppConfig {

}
