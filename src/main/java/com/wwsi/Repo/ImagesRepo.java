package com.wwsi.Repo;

import com.wwsi.Entity.Categories;
import com.wwsi.Entity.Images;
import com.wwsi.Entity.Recipes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository

public interface ImagesRepo extends CrudRepository<Images, Long> {

    Images findByRecipesId(long recipes_Id);

}
