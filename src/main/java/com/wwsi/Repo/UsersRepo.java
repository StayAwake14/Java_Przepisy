package com.wwsi.Repo;

import com.wwsi.Entity.Categories;
import com.wwsi.Entity.Images;
import com.wwsi.Entity.Recipes;
import com.wwsi.Entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository

public interface UsersRepo extends CrudRepository<Users, Long> {
    Users findByLogin(String login);

}
