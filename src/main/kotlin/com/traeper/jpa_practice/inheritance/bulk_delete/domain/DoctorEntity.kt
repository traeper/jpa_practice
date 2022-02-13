package com.traeper.jpa_practice.inheritance.bulk_delete.domain

import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "doctor")
class DoctorEntity(
    id: Long,
    name: String,
    employed: Boolean,
    @Column(nullable = false)
    val major: String,
) : PersonEntity(id, name, employed)