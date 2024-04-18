package lk.ijse.springbootwithbasicauth.repository;


import lk.ijse.springbootwithbasicauth.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since 0.0.1
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity,Long> {
}
