package com.example.postgrecallapi.repository;

import com.example.postgrecallapi.model.FoodDetails;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.Query;

@Transactional
public interface PostGreRepository extends CrudRepository<FoodDetails,Long> {
    @Modifying
    @Query(value="insert into fooddetails_replica(person_id,food_desc) values (?1,?2)",nativeQuery = true)
    void insertIntoPostGre(int id, String foodDesc);
}