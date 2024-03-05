package com.example.demo.services;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.entity.Song;
import com.example.demo.repositories.SongRepository;

	

	@Service
	public class SongserviceImpl implements SongService{

		@Autowired
		SongRepository songRepository;

		@Override
		public void addSong(Song song) {
			songRepository.save(song);

		}

		@Override
		public List<Song> fetchAllSongs() {
			List<Song> songs = songRepository.findAll();
			return songs;
		}

		@Override
		public boolean songExists(String name) {
			Song song = songRepository.findByName(name);
			if(song==null) {
				return false;
			}
			else {
				return true;
			}
		}

		@Override
		public void updateSong(Song s) {
			songRepository.save(s);
		}

	
}
