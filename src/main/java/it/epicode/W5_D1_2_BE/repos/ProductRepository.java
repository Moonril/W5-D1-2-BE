package it.epicode.W5_D1_2_BE.repos;

import it.epicode.W5_D1_2_BE.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
