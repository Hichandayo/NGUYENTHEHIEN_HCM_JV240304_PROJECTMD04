package ra.projectmd04.service.user;

import ra.projectmd04.model.dto.request.FormLogin;
import ra.projectmd04.model.dto.request.FormRegister;
import ra.projectmd04.model.dto.response.UserInfo;

public interface IUserService {
    UserInfo login(FormLogin request);

    void register(FormRegister request);
}
