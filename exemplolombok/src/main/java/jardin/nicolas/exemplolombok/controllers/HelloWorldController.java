package jardin.nicolas.exemplolombok.controllers;

import jardin.nicolas.exemplolombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello world Lombok";
    }



//    @GetMapping("/product")
//    public String getProduct() {
//        return "Objeto Produto";
//    }
}
