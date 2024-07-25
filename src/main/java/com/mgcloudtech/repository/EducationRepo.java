package com.mgcloudtech.repository;

import com.mgcloudtech.entities.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EducationRepo extends JpaRepository<Education,Integer> {

    @Modifying
    @Transactional

    @Query("UPDATE Education a SET a.educationType = :educationType, a.major = :major,a.universityName = :universityName, a.universityCountry = :universityCountry, a.updateBy = :updateBy WHERE a.id = :id")
    void updateEducation(@Param("id") Integer id, @Param("educationType") Enum educationType, @Param("major") String major, @Param("universityName") String universityName, @Param("universityCountry") String universityCountry, @Param("updateBy") String updateBy);
}
