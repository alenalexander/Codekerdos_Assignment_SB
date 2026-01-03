package com.codekerdos.session_7.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.codekerdos.session_7.implementation",
        "com.codekerdos.session_7.services"})

@ComponentScan(basePackageClasses = {com.codekerdos.session_7.beans.Vehicle.class,
        com.codekerdos.session_7.beans.Person.class})
public class ProjectConfig {
}
