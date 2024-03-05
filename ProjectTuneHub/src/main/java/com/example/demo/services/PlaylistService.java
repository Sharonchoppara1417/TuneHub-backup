package com.example.demo.services;


	import java.util.List;

import com.example.demo.entity.PlayList;

	
	public interface PlaylistService {

		
		public void addplaylist(PlayList playlist);

		public List<PlayList> fetchAllPlaylists();


	
}
