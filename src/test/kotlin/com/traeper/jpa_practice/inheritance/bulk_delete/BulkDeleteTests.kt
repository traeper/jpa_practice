package com.traeper.jpa_practice.inheritance.bulk_delete

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.context.SpringBootTest
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@DataJpaTest
class BulkDeleteTests {

    @PersistenceContext
    lateinit var entityManager: EntityManager

    @Test
    fun batchDelete() {
        entityManager.createQuery("delete from person where employed = :employed")
            .setParameter("employed", false)
            .executeUpdate()
    }

}
