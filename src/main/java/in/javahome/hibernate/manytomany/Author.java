package in.javahome.hibernate.manytomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHOR")
public class Author implements Serializable {
	@Column(name = "AUTH_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authorId;
	@Column(name = "AUTH_NAME")
	private String authorName;
	@Column(name = "MAIL")
	private String mail;
	@ManyToMany
	@JoinTable(name = "AUTHOR_BOOK", joinColumns = { @JoinColumn(name = "AUTH_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "BOOK_ID") })
	private Set<Book> books = new HashSet<>();

	public Integer getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
