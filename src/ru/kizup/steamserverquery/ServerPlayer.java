package ru.kizup.steamserverquery;

/**
 * Class contains common information about player
 */
public class ServerPlayer {
	
	private int PlayerIndex;
	private String PlayerName;
	private long PlayerScore;
	private float PlayerDuration;
	
	public ServerPlayer(int Index, String Name, long Score, float Duration) {
		this.PlayerIndex = Index;
		this.PlayerName = Name;
		this.PlayerScore = Score;
		this.PlayerDuration = Duration;
	}
	
	public int getIndex() {
		return this.PlayerIndex;
	}
	
	public String getName() {
		return this.PlayerName;
	}
	
	public long getScore() {
		return this.PlayerScore;
	}
	
	public float getDuration() {
		return this.PlayerDuration;
	}
}
