package com.mgcloudtech.service;


import com.mgcloudtech.entities.Address;
import com.mgcloudtech.repository.AddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {


    @Autowired
    private AddressRepo addressRepo;

    @Transactional
    public Address insert(Address address){
        return addressRepo.save(address);
    }
    @Transactional
    public void updateAddress(Integer addressId, Address address) {
        addressRepo.updateAddress(addressId,
                address.getStreetAddress(), address.getCity(),
                address.getState(), address.getZipcode(),address.getUpdateBy());
    }

}

