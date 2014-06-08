package game.service;

import game.domain.UrlGcid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("UrlGcidService")
@Transactional
public class UrlGcidServiceImpl implements UrlGcidService {
	
	private UrlGcidRepository urlGcidReposity;
	
	@Autowired
	public UrlGcidServiceImpl(UrlGcidRepository urlGcidReposity){
		this.urlGcidReposity = urlGcidReposity;
	}

	@Override
	public UrlGcid findUrlGcid(int game_id) {
		// TODO Auto-generated method stub
		return this.urlGcidReposity.findByGameIdAndurl( game_id);
	}

	@Override
	public Page<UrlGcid> findAll(Pageable pager) {
		// TODO Auto-generated method stub
		return this.urlGcidReposity.findAll(pager);
	}

}
