package lk.ijse.myapi.myapi.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
@CrossOrigin
public class UserApiController {

    @GetMapping
    public String test(){
        return "Test";
    }
}
