package com.traeper.jpa_practice.inheritance.bulk_delete.domain

import javax.persistence.*

@Entity(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
open class PersonEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var name: String,

    @Column(nullable = false)
    var employed: Boolean,
)