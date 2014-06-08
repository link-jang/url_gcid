package game.web.Rest;

import game.service.UrlGcidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/url")
public class GcidUrlRestController {
	
	@Autowired
	private UrlGcidService urlGcidService;
	
	@RequestMapping
	public game.domain.UrlGcid  index() {
		System.out.println("--------------");
		GameInfo gameInfo1 = new GameInfo(1,"修仙","诛仙",
				new UrlGcid("http://1xxx.html","1234556"),
				new UrlGcid("http://2xxx.html","2345666"));
		return this.urlGcidService.findUrlGcid(1);
        //return  new ModelAndView("greeting", "messages", "hello");
    } 
	
	
	class UrlGcid{
		private String url;
		private String gcid;
		public UrlGcid(String url,String gcid){
			this.url = url;
			this.gcid = gcid;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getGcid() {
			return gcid;
		}
		public void setGcid(String gcid) {
			this.gcid = gcid;
		}
		
	}
	
	class GameInfo{
		private int gameId;
		private String gameType;
		private String gameName;
		private UrlGcid offcialUrl;
		private UrlGcid webUrl;
		
		public GameInfo(int gameId,String gameType,String gameName,UrlGcid offcialUrl,UrlGcid webUrl){
			this.gameId = gameId;
			this.gameType = gameType;
			this.gameName = gameName;
			this.offcialUrl = offcialUrl;
			this.webUrl = webUrl;
		}

		public int getGameId() {
			return gameId;
		}

		public void setGameId(int gameId) {
			this.gameId = gameId;
		}

		public String getGameType() {
			return gameType;
		}

		public void setGameType(String gameType) {
			this.gameType = gameType;
		}

		public String getGameName() {
			return gameName;
		}

		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

		public UrlGcid getOffcialUrl() {
			return offcialUrl;
		}

		public void setOffcialUrl(UrlGcid offcialUrl) {
			this.offcialUrl = offcialUrl;
		}

		public UrlGcid getWebUrl() {
			return webUrl;
		}

		public void setWebUrl(UrlGcid webUrl) {
			this.webUrl = webUrl;
		}
		
		
	}

}
