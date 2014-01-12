package com.bi4farmers.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 * Farm entity, representing a company object that can be persisted to a
 relational database and, at the same time, be used as a transfer object for
 company entities that are used in the user interface.
 * 
 * @author Nils Preusker - n.preusker@gmail.com
 */
@Entity
@Data
public class Farm {

  @Id
  @GeneratedValue
  private Long id;
  private String name;

  /**
   * Default constructor for JAX-RS (object <> JSON serialization)
   */
  public Farm() {
  }

  public Farm(String name) {
    this.name = name;
  }

  // -------- getters and setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}