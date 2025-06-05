package it.epicode.W5_D1_2_BE.repos;

import it.epicode.W5_D1_2_BE.bean.Table;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<Table, Integer> {
}
