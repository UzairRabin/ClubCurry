package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
}
