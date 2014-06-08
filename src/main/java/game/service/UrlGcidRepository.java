package game.service;

import game.domain.UrlGcid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

interface UrlGcidRepository extends Repository<UrlGcid,Long>{
	
	@Query("select new game.domain.UrlGcid(h.id_g,h.url,h.gcid)  "+
	"from UrlGcid h where h.id_g=?1")
	UrlGcid findByGameIdAndurl(int id_g);
	
	@Query("select new game.domain.UrlGcid(h.id_g,h.url,h.gcid)  "+
			"from UrlGcid h")
	Page<UrlGcid> findAll(Pageable pageable);
	

}
