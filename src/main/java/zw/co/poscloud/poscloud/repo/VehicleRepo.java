package zw.co.poscloud.poscloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.poscloud.poscloud.model.Vehicle;

import java.util.Optional;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

    void deleteVehicleById(Long id);

    Optional<Vehicle> findVehicleById(Long id);
}
