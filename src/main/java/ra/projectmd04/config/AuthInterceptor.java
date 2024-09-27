package ra.projectmd04.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import ra.projectmd04.model.dto.response.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserInfo u = (UserInfo) request.getSession().getAttribute("UserLogin");
        if (u== null){ // chua co nguoi dang nhap
            response.sendRedirect("/login");
            return false;
        }
        if(!u.isRole()){ // khong co quyen truy cap admin khi dang la user
            response.sendRedirect("/");
            return false;
        }
        return true;
    }
}
