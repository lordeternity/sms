package it.soufiane.azedine.sms.model.data.entities;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.AbstractAuditable;

@MappedSuperclass
public abstract class CommonEntity extends AbstractAuditable<Entity, Integer> {
    
}
