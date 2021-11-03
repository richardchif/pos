package zw.co.poscloud.poscloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.poscloud.poscloud.exception.VehicleNotFoundException;
import zw.co.poscloud.poscloud.model.Vehicle;
import zw.co.poscloud.poscloud.repo.VehicleRepo;

import java.util.List;
import java.util.UUID;

@Service
public class VehicleService {
    private  final VehicleRepo vehicleRepo;

    @Autowired
    public VehicleService(VehicleRepo vehicleRepo){
        this.vehicleRepo=vehicleRepo;
    }

    public Vehicle addVehicle(Vehicle vehicle){
        vehicle.setCode(UUID.randomUUID().toString());
        return  vehicleRepo.save(vehicle);
    }
    public List<Vehicle> findAllVehicles(){
        return vehicleRepo.findAll();
    }
    public Vehicle updateVehicle(Vehicle vehicle){
        return  vehicleRepo.save(vehicle);
    }
    public void deleteVehicle(Long id){
        vehicleRepo.deleteVehicleById(id);
    }
    public  Vehicle findVehicleById(Long id){
        return vehicleRepo.findVehicleById(id).orElseThrow(() -> new VehicleNotFoundException("Vehicle by id" + id + "was not found"));
    }
}
