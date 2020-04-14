package dev.hyux.springrecipe.controllers;

import dev.hyux.springrecipe.domain.Category;
import dev.hyux.springrecipe.domain.UnitOfMeasure;
import dev.hyux.springrecipe.repositories.CategoryRepository;
import dev.hyux.springrecipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})

    public String getIndexPage() {

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat id: " + categoryOptional.get().getId());
        System.out.println("UOM id: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
