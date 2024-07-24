package com.mgcloudtech.repository;

import com.mgcloudtech.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
        @Modifying
        @Transactional
        @Query("UPDATE Address a SET a.streetAddress = :streetAddress, a.city = :city,a.state = :state, a.zipcode = :zipcode WHERE a.addressId = :addressId")
        void updateAddress(@Param("addressId") Integer id, @Param("streetAddress") String streetAddress, @Param("city") String city,@Param("state") String state, @Param("zipcode") Integer zipcode);
    }

