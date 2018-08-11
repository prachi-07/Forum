package lti.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="feeds")
public class Feed {
	@Id
	@GeneratedValue
	private int feedId;
	private String question;
	@Temporal(TemporalType.TIMESTAMP)
	private Date feedstamp;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy = "feedId", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Comment comment;
	public Feed() {

	}

	public int getFeedId() {
		return feedId;
	}

	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getFeedstamp() {
		return feedstamp;
	}

	public void setFeedstamp(Date feedstamp) {
		this.feedstamp = feedstamp;
	}
	
	

}
