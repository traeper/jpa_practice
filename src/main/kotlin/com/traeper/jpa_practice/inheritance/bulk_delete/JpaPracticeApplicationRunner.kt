package com.traeper.jpa_practice.inheritance.bulk_delete

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Component
class JpaPracticeApplicationRunner : ApplicationRunner {
    @PersistenceContext
    private lateinit var entityManager: EntityManager

    @Transactional
    override fun run(args: ApplicationArguments) {
        entityManager.createQuery("delete from person where employed = :employed")
            .setParameter("employed", false)
            .executeUpdate()
    }
}