package dev.hyux.springrecipe.repositories;

import dev.hyux.springrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
