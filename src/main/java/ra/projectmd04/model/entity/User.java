package ra.projectmd04.model.entity;

import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;
    @Column(length = 100,unique = true)
    private String username;
    @Column(unique = true)
    private String email;
    @NotBlank(message = "Ten khong duoc de trong")
    private String fullname;
//    @Password(message = "mật khẩu ko hợp lệ")
    private String password;
    private String avatar; //Không bắt buộc
    private String phone; // Định dạng phone VN, không trùng lặp
    private String address;
    private boolean status;
    private Date createdAt;
    private Date updatedAt;
    private boolean isDeleted;
    private boolean role;
 }
