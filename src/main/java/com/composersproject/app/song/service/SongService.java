package com.composersproject.app.song.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.composersproject.app.song.model.Song;
import com.composersproject.app.song.repository.SongRepository;

@Service
public class SongService {
	
	@Autowired
    private SongRepository songRepository;

    public Song save (Song song){
       return songRepository.save(song);
    }
    public List<Song> findAll(){
        return songRepository.findAll();
    }
    public Optional<Song> findById(String id){
       return songRepository.findById(id);
    }

    public void deleteById(String id) {
        songRepository.deleteById(id);	
    }

}
