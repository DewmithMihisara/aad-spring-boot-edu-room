package lk.ijse.springbootwithjwtauth.repository;

import lk.ijse.springbootwithjwtauth.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-18
 * @since 0.0.1
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{
}
