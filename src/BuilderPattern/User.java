package BuilderPattern;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {
    private String name;
    private String surname;
    private int age;
    private String email;

}
