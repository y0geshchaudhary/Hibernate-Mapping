package com.yogesh.ManyToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Chapter")
public class ChapterDTO 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	
	@Column(name="chapterName")
	private String chapterName;
	
	@ManyToMany(mappedBy="chapter",cascade=CascadeType.ALL)
	private Set<BookDTO> book = new HashSet<BookDTO>(0);
	
	
	public Set<BookDTO> getBook() {
		return book;
	}
	public void setBook(Set<BookDTO> book) {
		this.book = book;
	}
	public int getId() {
		return id;
	}
	public String getChapterName() {
		return chapterName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setChapterName(String chapterName) {
		this.chapterName = chapterName;
	}
	@Override
	public String toString() {
		return "ChapterDTO [id=" + id + ", chapterName=" + chapterName + "]";
	}
	
	
}
