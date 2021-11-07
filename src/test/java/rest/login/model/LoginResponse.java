package rest.login.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginResponse {
    private boolean mfaEnabled;
    private String mfaSession;
    private String token;
}
