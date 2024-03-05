package com.example.demo.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entity.PlayList;
import com.example.demo.repositories.PlayListRepository;

	
	@Service
	public class PlaylistServiceImpl implements PlaylistService{

		@Autowired
		PlayListRepository playlistRepository;

		@Override
		public void addplaylist(PlayList playlist) {
			playlistRepository.save(playlist);
		}

		@Override
		public List<PlayList> fetchAllPlaylists() {
			List<PlayList> allplaylist = playlistRepository.findAll();
			return allplaylist;
		}

	
}
