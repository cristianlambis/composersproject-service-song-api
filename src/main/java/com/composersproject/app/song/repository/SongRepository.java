package com.composersproject.app.song.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.composersproject.app.song.model.Song;

@Repository
public interface SongRepository extends MongoRepository<Song,String> {

}
