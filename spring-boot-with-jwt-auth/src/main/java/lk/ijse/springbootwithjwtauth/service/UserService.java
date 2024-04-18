package lk.ijse.springbootwithjwtauth.service;

import lk.ijse.springbootwithjwtauth.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-18
 * @since 0.0.1
 */
public interface UserService {
    UserDetailsService userDetailsService();
    void saveUser(UserDTO userDTO);
}
