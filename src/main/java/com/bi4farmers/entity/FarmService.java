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
public interface FarmService {

	/**
	 * Returns the {@link Customer} with the given id or {@literal null} if no {@link Customer} with the given id was
	 * found.
	 * 
	 * @param id
	 * @return
	 */
	Farm findById(Long id);

	/**
	 * Saves the given {@link Customer}.
	 * 
	 * @param farm
	 * @return
	 */
	Farm save(Farm farm);

	/**
	 * Returns all customers.
	 * 
	 * @return
	 */
	List<Farm> findAll();

	/**
	 * Returns the page of {@link Customer}s with the given index of the given size.
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<Farm> findAll(int page, int pageSize);

	/**
	 * Returns the page of {@link Customer}s with the given lastname and the given page index and page size.
	 * 
	 * @param name
	 *  @return
	 */
	List<Farm> findByName(String name);
}
