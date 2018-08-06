package com.yogesh.ManyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class BookDTO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="bookName")
	private String bookName;

	@ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinTable(name="Book_Chapter", joinColumns={@JoinColumn(name="bookId")},
	inverseJoinColumns={@JoinColumn(name="chapterId")})
	private Set<ChapterDTO> chapter = new HashSet<ChapterDTO>(0);

	public int getId() {
		return id;
	}

	public String getBookName() {
		return bookName;
	}

	public Set<ChapterDTO> getChapter() {
		return chapter;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setChapter(Set<ChapterDTO> chapter) {
		this.chapter = chapter;
	}
	
	
	
}
