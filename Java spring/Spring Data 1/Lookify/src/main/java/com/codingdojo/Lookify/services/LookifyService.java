package com.codingdojo.Lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.Lookify.models.Lookify;
import com.codingdojo.Lookify.repositories.LookifyRepository;


@Service
public class LookifyService {
	 private final LookifyRepository lookifyRepo;
	    
	    public LookifyService(LookifyRepository lookifyRepo) {
	        this.lookifyRepo = lookifyRepo;
	    }
	    public void creatSong(Lookify song) {
	    	lookifyRepo.save(song);
	    }
	   
	    public List<Lookify> allSongs() {
	        return lookifyRepo.findAll();
	    }
	   public void deleteSong(Long id){
		   lookifyRepo.deleteById(id);
		   
	   }
	   public void updateSong(Lookify song) {
		   lookifyRepo.save(song);
	   }
	   
	   public List<Lookify> topTen(){
		   return lookifyRepo.findTop10ByOrderByRatingDesc();
	   }
	   
	   public List<Lookify> searchByArtist(String artist){
		   return lookifyRepo.findByArtistContaining(artist);
	   }
	   
	    public Lookify addSong(Lookify song) {
	        return lookifyRepo.save(song);
	    }
	   
	    public Lookify findSong(Long id) {
	        Optional<Lookify> optionalLookify = lookifyRepo.findById(id);
	        if(optionalLookify.isPresent()) {
	            return optionalLookify.get();
	        } else {
	            return null;
	        }
	    }
}
