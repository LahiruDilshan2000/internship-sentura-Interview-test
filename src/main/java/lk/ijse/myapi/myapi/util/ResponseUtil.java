package lk.ijse.myapi.myapi.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
