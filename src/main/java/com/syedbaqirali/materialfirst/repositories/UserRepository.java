/**
 * 
 */
package com.syedbaqirali.materialfirst.repositories;

/**
 * @author SBA
 *
 */

import org.springframework.data.repository.CrudRepository;

import com.syedbaqirali.materialfirst.entities.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}