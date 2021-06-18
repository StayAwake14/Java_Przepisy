package com.wwsi.Repo;

import com.wwsi.Entity.Commentaries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Comment;
import java.util.List;

@Repository

public interface CommentariesRepo extends CrudRepository<Commentaries, Long> {
    List<Commentaries> findByRecipesId(long recipes_id);
}
