package org.igetwell.listener;

import org.igetwell.common.util.JwtTokenUtil;
import org.igetwell.system.dto.JwtUser;
import org.igetwell.system.dto.SystemUserDTO;
import org.igetwell.system.service.ISystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springside.modules.utils.text.JsonMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private ISystemUserService iSystemUserService;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        String jwtToken = jwtTokenUtil.createToken(authentication.getName());
        response.setHeader("X-API-TOKEN", "Bearer " + jwtToken);
        System.err.println("userDetail["+authentication.getDetails()+"]");
        SystemUserDTO dto = iSystemUserService.get(authentication.getName());
        JwtUser jwtUser = JwtUser.build(authentication.getName(), dto.getOfficeName(), dto.getDeptName(), dto.getPositionName(), authentication.getAuthorities());
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().write(JsonMapper.INSTANCE.toJson(jwtUser));
        //super.onAuthenticationSuccess(request, response, authentication);
    }
}
