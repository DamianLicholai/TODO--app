package io.github.mat3e.adapter;

import io.github.mat3e.model.ProjectRepository;
import io.github.mat3e.model.Projects;
import io.github.mat3e.model.TaskGroup;
import io.github.mat3e.model.TaskGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SqlProjectRepository extends ProjectRepository, JpaRepository<Projects, Integer> {

    @Override
    @Query("select distinct p from Projects p join fetch p.steps")
    List<Projects> findAll();
}
