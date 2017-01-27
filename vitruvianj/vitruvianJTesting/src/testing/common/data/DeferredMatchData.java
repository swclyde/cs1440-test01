package testing.common.data;

import vitruvianJ.serialization.Serialize;

public class DeferredMatchData implements java.io.Serializable{

	private Long matchSrcCharmId;
	private Long matchDestCharmId;
	private String  matchingDegree;
	private Double matchingScore;
	
	@Serialize
	public void setMatchSrcCharmId(Long matchSrcCharmId) {
		this.matchSrcCharmId = matchSrcCharmId;
	}
	@Serialize
	public Long getMatchSrcCharmId() {
		return matchSrcCharmId;
	}
	@Serialize
	public void setMatchDestCharmId(Long matchDestCharmId) {
		this.matchDestCharmId = matchDestCharmId;
	}
	@Serialize
	public Long getMatchDestCharmId() {
		return matchDestCharmId;
	}
	@Serialize
	public void setMatchingDegree(String matchingDegree) {
		this.matchingDegree = matchingDegree;
	}
	@Serialize
	public String getMatchingDegree() {
		return matchingDegree;
	}
	@Serialize
	public void setMatchingScore(Double matchingScore) {
		this.matchingScore = matchingScore;
	}
	@Serialize
	public Double getMatchingScore() {
		return matchingScore;
	}
}
