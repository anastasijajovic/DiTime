/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rs.ac.bg.fon.ditime;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import rs.ac.bg.fon.ditime.config.AppConfig;

/**
 *
 * @author student2
 */
@Component
public class DiTimeApp {
    private final LocalTime trenutnoVreme;

    @Autowired
    public DiTimeApp(LocalTime trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }
    
    
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DiTimeApp app = context.getBean(DiTimeApp.class);
        app.prikaziVreme();
    }

    private void prikaziVreme() {
        System.out.println("Trenutno vreme: " + trenutnoVreme);
    }
}
