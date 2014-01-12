/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bi4farmers.entity;

/**
 *
 * @author Helmut
 */
import java.util.List;



/**
 * Service interface for {@link Farm}s.
 * 
 * @author Helmut Steiner
 */
public interface MemberService 
{

	/**
	 * Returns the {@link Customer} with the given id or {@literal null} if no {@link Customer} with the given id was
	 * found.
	 * 
	 * @param id
	 * @return
	 */
	Member findById(Long id);

	/**
	 * Saves the given {@link Customer}.
	 * 
	 * @param member
	 * @return
	 */
	Member save(Member member);

	/**
	 * Returns all customers.
	 * 
	 * @return
	 */
	List<Member> findAll();

	/**
	 * Returns the page of {@link Customer}s with the given lastname and the given page index and page size.
	 * 
	 * @param firstname
         * @param lastname
	 *  @return
	 */
	List<Member> findByName(String firstname, String lastname);
}