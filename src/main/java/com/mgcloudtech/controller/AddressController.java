package com.mgcloudtech.controller;



import com.mgcloudtech.entities.Address;
import com.mgcloudtech.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PatchMapping("/{addressId}")
    public ResponseEntity<Void> updateAddress(@PathVariable Integer addressId, @RequestBody Address address) {
        addressService.updateAddress(addressId, address);
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Address> insertAddress(@RequestBody Address address) {
        try {
            Address newAddress = addressService.insert(address);
            return new ResponseEntity<>(newAddress, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

