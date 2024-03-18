package ib.ts_2.repository;

import ib.ts_2.entity.Hire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HireRepository extends CrudRepository<Hire, Integer> {
}
