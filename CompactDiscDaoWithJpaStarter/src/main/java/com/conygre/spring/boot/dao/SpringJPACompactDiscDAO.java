package com.conygre.spring.boot.dao;

import com.conygre.spring.boot.entities.CompactDisc;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;


@Repository
public class SpringJPACompactDiscDAO implements CompactDiscDAO{
    @PersistenceContext
    private EntityManager em;
    @Override
    public void addCompactDisc(CompactDisc disc){
        System.out.println("addCompactDisc");
    }

    @Override
    public CompactDisc getCompactDiscByTitle(String title) {
        return null;
    }

    @Override
    public Collection<CompactDisc> getDiscsByArtist(String artist) {
        return null;
    }

    public Collection<CompactDisc> getAllDiscs() {
        Query query = em.createQuery("from CompactDisc");
        List<CompactDisc> discs = query.getResultList();
        return discs;
    }

    @Override
    public CompactDisc getCompactDiscById(int id) {
        return null;
    }
}
