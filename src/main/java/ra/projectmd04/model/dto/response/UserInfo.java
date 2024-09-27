package ra.projectmd04.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ra.projectmd04.model.entity.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {
    private Long userId;
    private String fullName;
    private String avatar;
    private boolean status;
    private boolean role;
    public UserInfo(User user){
        this.userId = user.getUserID();
        this.fullName = user.getFullname();
        this.avatar = user.getAvatar();
        this.status = user.isStatus();
        this.role = user.isRole();
    }
}
