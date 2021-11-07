package rest.login.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginRequest {
    private final String captchaToken = "";
    private String email;
    private String password;
}
