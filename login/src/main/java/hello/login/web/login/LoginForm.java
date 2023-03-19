package hello.login.web.login;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm {    //로그인 시 필요한 데이터가 수정, 조회등과 다르므로 분리
    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
