package dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Nicólas
 */
@Getter @Setter
@Component
public class ClassDAO {

    @Autowired
    private ClassJDBC classJDBC;
}
