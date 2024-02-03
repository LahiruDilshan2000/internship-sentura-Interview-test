package lk.ijse.myapi.myapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Lahiru Dilshan
 * @created Sat 9:49 AM on 2/3/2024
 * @project myapi
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private int id;
    private String uid;
    private String display_name;
    private String email;
    private String given_name;
    private String middle_name;
    private String name;
    private String family_name;
    private String nickname;
    private String phone_number;
    private String comment;
    private int directory_id;
    private int picture_id;
    private String avatar_url;
    private Object metadata;

    private List<String> tags;

    private String presence;
    private String created_at;
    private String modified_at;
    private boolean is_suspended;
    private boolean is_trashed;

}
