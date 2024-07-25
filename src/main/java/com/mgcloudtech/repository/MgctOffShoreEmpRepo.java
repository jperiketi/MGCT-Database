package com.mgcloudtech.repository;

import com.mgcloudtech.entities.MgctOffshoreEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MgctOffShoreEmpRepo extends JpaRepository<MgctOffshoreEmployees, Integer> {

/*
    @Modifying
    @Transactional


    @Query("UPDATE MgctOffshoreEmployees a SET a.firstName = :firstName, a.lastName = :lastName,a.dob = :dob, a.gender = :gender, a.startDate = :startDate, a.endDate = :endDate,a.phoneNumber1 = :phoneNumber1, a.phoneNumber2 = :phoneNumber2,a.email1 = :email1,a.email2 = : email2,a.aadharNo WHERE a.addressId = :addressId")
    void updateAddress(@Param("addressId") Integer id, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("dob") Date dob, @Param("gender") Enum gender, @Param("startDate") Date startDate,@Param("endDate") Date endDate, @Param("phoneNumber1") Integer phoneNumber1,@Param("phoneNumber2") Integer phoneNumber2,@Param("email1") String email1,@Param("email2") String email2);

*/

}
