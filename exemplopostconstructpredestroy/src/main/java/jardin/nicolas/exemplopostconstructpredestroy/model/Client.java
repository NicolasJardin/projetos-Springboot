package jardin.nicolas.exemplopostconstructpredestroy.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Nicólas
 * @version 1.0
 * @since 6/11/2020 - 3:19 PM
 */
//Lombok
@ToString
@Getter @Setter
@AllArgsConstructor

//Sprintboot
@Component
public class Client {


    private String name;
    private String lastName;

    public Client() {
        System.out.println("Classe cliente");
    }
}
