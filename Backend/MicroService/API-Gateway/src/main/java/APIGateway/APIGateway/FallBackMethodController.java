package APIGateway.APIGateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/issueBillsFallBack")
    public String issueBillsFallBackMethod(){
        return("issue bills is taking more time then expected");
    }

    @GetMapping("/setRatesFallBack")
    public String setRatesFallBackMethod(){
        return("issue bills is taking more time then expected");
    }
}
