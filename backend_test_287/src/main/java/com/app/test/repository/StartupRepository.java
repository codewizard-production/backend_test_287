package com.app.test.repository;

import com.app.test.model.Startup;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class StartupRepository extends SimpleJpaRepository<Startup, String> {
    private final EntityManager em;
    public StartupRepository(EntityManager em) {
        super(Startup.class, em);
        this.em = em;
    }
    @Override
    public List<Startup> findAll() {
        return em.createNativeQuery("Select * from \"test\".\"Startup\"", Startup.class).getResultList();
    }
}