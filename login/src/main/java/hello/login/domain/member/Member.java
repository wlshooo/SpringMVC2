package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String loginId; //사용자 입력 id
    @NotEmpty
    private String password;

}
