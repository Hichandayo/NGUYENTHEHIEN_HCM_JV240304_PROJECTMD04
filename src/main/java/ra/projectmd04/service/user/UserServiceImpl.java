package ra.projectmd04.service.user;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.projectmd04.dao.user.IUserDao;
import ra.projectmd04.exception.AuthenticationException;
import ra.projectmd04.model.dto.request.FormLogin;
import ra.projectmd04.model.dto.request.FormRegister;
import ra.projectmd04.model.dto.response.UserInfo;
import ra.projectmd04.model.entity.User;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.Date;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public UserInfo login(FormLogin request) {
        // 1. lay ra nguoi dung theo username
        try {
            User user = userDao.findByUsername(request.getUsername());
            // 2. so khop mat khau
            boolean isSuccess = BCrypt.checkpw(request.getPassword(), user.getPassword());
            if (isSuccess) {
                return new UserInfo(user);
            }
            throw new AuthenticationException("tai khoan hoac mat khau khong dung");
        } catch (NoResultException e) {
            throw new AuthenticationException("tai khoan hoac mat khau khong dung");
        }
    }

    @Override
    @Transactional
    public void register(FormRegister request) {
        // chuyển đổi từ request thành entity
        User user = User.builder()
                .username(request.getUsername())
                .address(request.getAddress())
                .phone(request.getPhone())
                .password(BCrypt.hashpw(request.getPassword(),BCrypt.gensalt(5)))
                .fullname(request.getFullName())
                .email(request.getEmail())
                .role(false) // măc định user
                .avatar("example.jpg")
                .createdAt(new Date())
                .status(true)
                .isDeleted(false)
                .updatedAt(new Date())
                .build();
        userDao.register(user);
    }
}
