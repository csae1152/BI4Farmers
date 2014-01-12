package com.bi4farmers.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.NamedQuery;

import com.bi4farmers.entity.Member;





/**
 *
 * @author Helmut
 */
public class MemberService
{
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Member> findAllMembers() 
    {
      TypedQuery<Member> query = entityManager.createQuery(
      "SELECT m FROM Member m", Member.class);
      return (List<Member>) query.getResultList();
    }
    
    
  
  
    
}
