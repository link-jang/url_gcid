package game.web.ui;

import javax.servlet.http.HttpServletRequest;

import game.domain.UrlGcid;
import game.service.UrlGcidService;












import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/show")
public class GcidUrlController {
	
	@Autowired
	private UrlGcidService urlGcidService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  index(@RequestParam(value = "page", required = false, defaultValue ="0") String page) {

		
        int pageSize =20; 

        Pageable pager =new PageRequest(Integer.parseInt(page), pageSize);
		Page<UrlGcid> urlgcids =this.urlGcidService.findAll(pager);
		urlgcids.getNumber();
		return new ModelAndView("greeting","data",urlgcids);
        //return  new ModelAndView("greeting", "messages", "hello");
    } 
	
	
}
