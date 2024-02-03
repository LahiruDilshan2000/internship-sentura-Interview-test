package lk.ijse.myapi.myapi.api;

import lk.ijse.myapi.myapi.dto.UserDTO;
import lk.ijse.myapi.myapi.util.ResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
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

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        System.out.println(userDTO);

        HttpEntity<UserDTO> requestEntity = new HttpEntity<>(userDTO, headers);

        ResponseEntity<UserDTO> response = restTemplate.exchange(
                "https://0ac93198ac14481b8222420b17b7ee7e.weavy.io/api/users",
                HttpMethod.POST,
                requestEntity,
                UserDTO.class);

        if (requestEntity.getBody() != null){
            return new ResponseUtil(201, "User save successfully", response);
        }
        return new ResponseUtil(500, "Error", null);
    }
}
