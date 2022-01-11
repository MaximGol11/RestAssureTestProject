package pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserData {
    public Integer id;
    public String email;
    public String first_name;
    public String last_name;
    public String avatar;

    public UserData() {
    }

    public UserData(Integer id, String email, String first_name, String last_name, String avatar) {
        this.id = id;
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.avatar = avatar;
    }

}
