/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ditime.config;

import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author student2
 */
@ComponentScan(basePackages = {
    "rs.ac.bg.fon.ditime"
})
public class AppConfig {
    @Bean(name = "diTime")
    public LocalTime diTime() {
        return LocalTime.now();
    }
}
