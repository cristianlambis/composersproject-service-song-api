package com.composersproject.app.song.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.composersproject.app.song.model.Song;
import com.composersproject.app.song.service.SongService;

@RestController
@RequestMapping("/api/v3")
public class SongController {
	
	@Autowired
    private SongService songService;

     @PostMapping("/songs")
    public Song save(@RequestBody Song song){
        return songService.save(song);

     }

     @GetMapping("/songs")
     public List<Song> findAll(){
         return songService.findAll();
     }

     @GetMapping("/song/{id}")
     public Song findById(@PathVariable String id){
         return songService.findById(id).get() ;
     }

     @DeleteMapping("/song/{id}")
     public void deleteById(@PathVariable String id){
         songService.deleteById(id);
     }

     @PutMapping ("/songs")
     public void update(@RequestBody Song song){
         songService.save(song);
     }


}
