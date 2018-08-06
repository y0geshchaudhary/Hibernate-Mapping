package com.yogesh.ManyToMany;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManyToManyHibernate 
{
	public static void main(String[] arg)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/yogesh/config.xml");
		
		CommonDAO commonDAO = (CommonDAO) ctx.getBean("commonDAO");
		
		//Uni - Directional mapping
		
		/*Set<ChapterDTO> chapterSet = new HashSet<ChapterDTO>();
		ChapterDTO chp1;
		for(int i=1;i<6;i++)
		{
			chp1 = new ChapterDTO();
			chp1.setChapterName("Chapter"+i);
			chapterSet.add(chp1);
		}
		
		BookDTO bookDTO1 = new BookDTO();
		bookDTO1.setBookName("Hibernate");
		bookDTO1.setChapter(chapterSet);
		commonDAO.saveEntity(bookDTO1);
		
		BookDTO bookDTO2 = new BookDTO();
		bookDTO2.setBookName("Spring");
		bookDTO2.setChapter(chapterSet);
		commonDAO.saveEntity(bookDTO2);*/
		
		
		// Bi - Directional mapping
		
		/*BookDTO book3 = commonDAO.getBookByName("Spring");
		
		System.out.println(book3.getChapter());
		
		ChapterDTO chapterDTO = new ChapterDTO();
		chapterDTO.setChapterName("Chapter6");
		chapterDTO.getBook().add(book3);
		
		book3.getChapter().add(chapterDTO);
		
		commonDAO.saveEntity(chapterDTO);*/
		
		
		//Separately get chapter row and map it to book row.
		/*BookDTO book = commonDAO.getBookByName("Spring");
		ChapterDTO chapter = commonDAO.getChapterByName("Chapter6");
		book.getChapter().add(chapter);
		commonDAO.saveEntity(book);*/
		
		System.out.println("Spring= "+commonDAO.getBookByName("Spring").getChapter());
		System.out.println("Hibernate= "+commonDAO.getBookByName("Hibernate").getChapter());
		
		
	}
}
