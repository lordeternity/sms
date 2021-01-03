package it.soufiane.azedine.sms.model.data.repo;

import org.springframework.data.repository.CrudRepository;

import it.soufiane.azedine.sms.model.data.entities.CommonEntity;


public interface CommonRepository <Ent extends CommonEntity> extends CrudRepository<Ent, Integer>{
    
}
