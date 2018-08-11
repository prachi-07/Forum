package lti.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue
	private int comId;
	@ManyToOne
	@JoinColumn(name="user_id")
	private Set<User> user = new HashSet<User>();
	
	@ManyToOne
	@JoinColumn(name="feedId")
	private Set<Comment> cmt = new HashSet<Comment>();
	private String comment;
	private Date comstamp;
	
	public Comment() {
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Set<Comment> getCmt() {
		return cmt;
	}

	public void setCmt(Set<Comment> cmt) {
		this.cmt = cmt;
	}

	public int getComId() {
		return comId;
	}

	public void setComId(int comId) {
		this.comId = comId;
	}

	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComstamp() {
		return comstamp;
	}

	public void setComstamp(Date comstamp) {
		this.comstamp = comstamp;
	}
	
	
}
