package ch17;

public class Player {
	private PlayerLevel level;
	
	public Player(){
		level = new BeginnerLevel();
		level.showMasage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upGrade(PlayerLevel level) {
		this.level = level;
		level.showMasage();
	}
	public void play(int count) {
		level.go(count);
	}
}
