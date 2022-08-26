package ru.spbstu.preaccelerator.domain.repository

import ru.spbstu.preaccelerator.domain.entities.Team
import ru.spbstu.preaccelerator.domain.entities.user.Tracker

interface TeamRepository {
    fun get(id: Team.Id): Team
    fun get(trackerId: Tracker.Id): List<Team>
    fun add(name: String, trackerId: Tracker.Id): Team.Id
}
