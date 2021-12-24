package io.github.mat3e.model;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    List<Projects> findAll();

    Optional<Projects> findById(Integer id);

    Projects save(Projects entity);


}
