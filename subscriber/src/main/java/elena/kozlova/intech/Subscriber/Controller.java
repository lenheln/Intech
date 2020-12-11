package elena.kozlova.intech.Subscriber;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {

    @PostMapping("/messenger")
    public void readMsg(@RequestBody Message message){
        System.out.println(message);
    }
}
