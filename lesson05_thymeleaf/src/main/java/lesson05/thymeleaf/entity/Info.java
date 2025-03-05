package lesson05.thymeleaf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String name;
    private String nickname;
    private String email;
    private String website;


}
