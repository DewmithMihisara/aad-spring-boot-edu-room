package lk.ijse.springbootwithjwtauth.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-04
 * @since
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "customer")
@Entity
public class CustomerEntity {
    @Id
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_address")
    private String address;
}
