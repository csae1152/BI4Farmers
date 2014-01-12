/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bi4farmers.entity;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;


/**
 *
 * @author Helmut
 */


@Entity
@Data 
public class Member implements Serializable 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String firstname;
    private String lastname;
    private String title;
    
    private String street;
    private int housenumber;
    
    private int zip_code;
    private short country_id;
    
    public Member() {}
    
    public Member(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    
    
    
}
