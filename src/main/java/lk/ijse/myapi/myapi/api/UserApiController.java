package lk.ijse.myapi.myapi.api;

import lk.ijse.myapi.myapi.dto.UserDTO;
import lk.ijse.myapi.myapi.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
@RequiredArgsConstructor
public class UserApiController {

    private final RestTemplate restTemplate;

    @GetMapping
    public ResponseUtil getAll(){
        return new ResponseUtil();
    }

    @PostMapping
    public ResponseUtil saveUser(@RequestBody UserDTO userDTO, @RequestHeader("Authorization") String token){

        System.out.println(token);
        /*UserDTO userDTO1 = restTemplate
                .postForObject("https://0ac93198ac14481b8222420b17b7ee7e.weavy.io/api/users", userDTO, UserDTO.class);*/


        return new ResponseUtil(201, "ok", null);
    }
}
