package com.app.test.repository;

import com.app.test.model.FundingRound;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class FundingRoundRepository extends SimpleJpaRepository<FundingRound, String> {
    private final EntityManager em;
    public FundingRoundRepository(EntityManager em) {
        super(FundingRound.class, em);
        this.em = em;
    }
    @Override
    public List<FundingRound> findAll() {
        return em.createNativeQuery("Select * from \"test\".\"FundingRound\"", FundingRound.class).getResultList();
    }
}