package lk.ijse.springbootwithjwtauth.service.impl;

import lk.ijse.springbootwithjwtauth.dto.UserDTO;
import lk.ijse.springbootwithjwtauth.service.UserService;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-18
 * @since 0.0.1
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetailsService userDetailsService() {
        return null;
    }

    @Override
    public void saveUser(UserDTO userDTO) {

    }
}
