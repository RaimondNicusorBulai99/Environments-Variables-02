package Deploy.Environments.Variables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

   /* @Value("${myCustomEnvs.welcomeMsg}")
    String welcomeMsgFromProd;*/

    @GetMapping("/")
    public String getWelcomeMessage (){
        String welcomeMessage = environment.getProperty("myCustomEnvs.welcomeMsg");
        return welcomeMessage;
    }
}