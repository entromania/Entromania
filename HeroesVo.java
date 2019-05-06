package Vo;

import java.io.Serializable;

public class HeroesVo implements Serializable{

	private int heroId;
	private String heroName;
	private String heroDob;
	private int heroAge;
	private String heroPosition;
	private attachmentVo attachmentVo;
	
	public int getHeroId() {
		return heroId;
	}
	public void setHeroId(int heroId) {
		this.heroId = heroId;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroDob() {
		return heroDob;
	}
	public void setHeroDob(String heroDob) {
		this.heroDob = heroDob;
	}
	public int getHeroAge() {
		return heroAge;
	}
	public void setHeroAge(int heroAge) {
		this.heroAge = heroAge;
	}
	public String getHeroPosition() {
		return heroPosition;
	}
	public void setHeroPosition(String heroPosition) {
		this.heroPosition = heroPosition;
	}
	public attachmentVo getAttachmentVo() {
		return attachmentVo;
	}
	public void setAttachmentVo(attachmentVo attachmentVo) {
		this.attachmentVo = attachmentVo;
	}
	
	
}
