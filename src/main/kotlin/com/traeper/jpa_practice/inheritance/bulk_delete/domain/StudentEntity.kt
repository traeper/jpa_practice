package com.traeper.jpa_practice.inheritance.bulk_delete.domain

import javax.persistence.Column
import javax.persistence.Entity

@Entity(name = "student")
class StudentEntity(
    id: Long,
    name: String,
    employed: Boolean,
    var creditAverage: Double,
) : PersonEntity(id, name, employed)