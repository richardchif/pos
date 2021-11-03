package zw.co.poscloud.poscloud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.poscloud.poscloud.model.Vehicle;
import zw.co.poscloud.poscloud.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/vehicle")
public class VehicleResource {
    private final VehicleService vehicleService;

    public VehicleResource( VehicleService vehicleService){
        this.vehicleService = vehicleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        List <Vehicle> vehicles = vehicleService.findAllVehicles();
        return new ResponseEntity<>(vehicles, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable("id") Long id){
        Vehicle vehicle = vehicleService.findVehicleById(id);
        return new ResponseEntity<>(vehicle, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle){
        Vehicle newVehicle = vehicleService.addVehicle(vehicle);
        return new ResponseEntity<>(newVehicle, HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vehicle){
        Vehicle updateVehicle = vehicleService.updateVehicle(vehicle);
        return new ResponseEntity<>(updateVehicle, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteVehicle(@PathVariable("id") Long id){
         vehicleService.deleteVehicle(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }
}
