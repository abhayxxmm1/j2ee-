package com.jsp.unimapOneToMany2.driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.unimapOneToMany2.entity.Anime;
import com.jsp.unimapOneToMany2.entity.HiAnime;

public class AnimeHiAnimeDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ps");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Anime a = new Anime("strugle", 20);
		Anime a1 = new Anime("job", 22);
		Anime a2 = new Anime("kids", 32);
		Anime a3 = new Anime("death", 62);
		
		List<Anime> animes=Arrays.asList(a,a1,a2,a3);
		
		HiAnime h = new HiAnime(1, "Abhay", "winter", animes);
		
		et.begin();
		em.persist(a);
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(h);
		
		et.commit();
	}
}
