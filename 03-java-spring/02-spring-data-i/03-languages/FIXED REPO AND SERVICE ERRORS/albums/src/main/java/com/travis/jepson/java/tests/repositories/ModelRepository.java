package com.travis.jepson.java.tests.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travis.jepson.java.tests.models.Model;
import com.travis.jepson.java.tests.models.Album;
// MAKE SURE ITS THIS IMPORT TYPE

@Repository
public interface ModelRepository extends CrudRepository<Model, Long>
{
	List<Model> findAllByAlbum(Album album);
}
