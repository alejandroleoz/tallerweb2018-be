package ar.edu.utn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
@ServletComponentScan
public class App {

    public static void main(String[] args) throws URISyntaxException, IOException {
        // start application after config
        SpringApplication.run(App.class, args);
    }
}
