package com.todolist.demo.Repository;

import com.todolist.demo.Domain.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<Mission, Long> {
}
