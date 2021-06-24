package com.codingdojo.Lookify.controllers;

import java.util.List;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.Lookify.models.Lookify;
import com.codingdojo.Lookify.services.LookifyService;

@Controller
public class LookifyController {

	private final LookifyService lookifyService;

	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}

	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";

	}

	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Lookify> songs = lookifyService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String songsByArtist(@RequestParam(value = "artist") String artist, Model model) {
		model.addAttribute("artist", artist);
		model.addAttribute("songs", lookifyService.searchByArtist(artist));
		return "artistfile.jsp";
//		session.setAttribute("artistdata",lookifyService.searchByArtist(artist));
//		session.setAttribute("thisartist",artist);
//		List<Lookify> artistdata = (List<Lookify>) session.getAttribute("artistdata");
//		return "redirect:/search/"+artist;

	}

	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Lookify song) {
		return "newsong.jsp";
	}

	@RequestMapping(value = "/song", method = RequestMethod.POST)
	public String addSong(@Valid @ModelAttribute("song") Lookify song, BindingResult result) {
		if (result.hasErrors()) {
			return "newsong.jsp";
		}
		lookifyService.creatSong(song);
		return "redirect:/dashboard";
	}
	@RequestMapping("songs/{id}")
	public String songDetails(@PathVariable("id")Long id,Model model) {
		Lookify song = lookifyService.findSong(id);
		model.addAttribute("song", song);
		return "songdetails.jsp";
	}
	@RequestMapping(value="songs/{id}", method= RequestMethod.DELETE)
	public String destroy(@PathVariable("id")Long id) {
		lookifyService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("search/topTen")
	public String topTen(Model model) {
		List<Lookify> songs = lookifyService.topTen();
		model.addAttribute("songs", songs);
		return "topten.jsp";
	}
	
	
}
