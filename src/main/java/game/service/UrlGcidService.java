package game.service;

import game.domain.UrlGcid;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface  UrlGcidService {

	UrlGcid findUrlGcid(int game_id);
	
	Page<UrlGcid> findAll(Pageable pager);
}
