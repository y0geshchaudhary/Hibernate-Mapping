package com.yogesh.ManyToMany;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CommonDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	
	public void saveEntity(Object object)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(object);
	}
	
	public List<BookDTO> getBookList()
	{
		DetachedCriteria criteria = DetachedCriteria.forClass(BookDTO.class);
		return (List<BookDTO>) criteria.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
	}
	
	public Set<ChapterDTO> getChapterSet()
	{
		Set list = new HashSet(sessionFactory.getCurrentSession().createCriteria(ChapterDTO.class).setFetchSize(5).list());
		return list;
	}
	
	public BookDTO getBookByName(String name)
	{
		return (BookDTO) sessionFactory.getCurrentSession().createCriteria(BookDTO.class).add(Restrictions.eq("bookName", name)).uniqueResult();
	}
	
	public ChapterDTO getChapterByName(String chapterName)
	{
		return (ChapterDTO) sessionFactory.getCurrentSession()
				.createQuery("From ChapterDTO as chapter where chapter.chapterName = :chapterName")
				.setString("chapterName", chapterName).list().get(0);
	}
	
}
