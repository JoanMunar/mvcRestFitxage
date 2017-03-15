package com.esliceu.dwes.boot.dao;

import com.esliceu.dwes.boot.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface MarkRepository extends CrudRepository<User,String> {



}
