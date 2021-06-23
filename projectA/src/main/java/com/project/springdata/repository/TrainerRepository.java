
package com.project.springdata.repository;

import com.project.springdata.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {
    

     @Query(value = "update trainer set firstname= :firstname, lastname= :lastname, course= :course where id= :id"
            , nativeQuery=true)
     public void updateTrainer(String firstname, String lastname, String course, int id);

}
