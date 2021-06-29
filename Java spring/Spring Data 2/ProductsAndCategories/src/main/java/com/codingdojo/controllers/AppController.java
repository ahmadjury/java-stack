package com.codingdojo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.models.Category;
import com.codingdojo.models.CategoryProduct;
import com.codingdojo.models.Product;
import com.codingdojo.services.AppService;

@Controller
public class AppController {
	private final AppService appService;

	public AppController(AppService appService) {
		super();
		this.appService = appService;
	}

	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}

	@PostMapping("/Product/create")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "newProduct.jsp";
		} else {
			appService.addProduct(product);
			return "redirect:/Product/" + product.getId();
		}
	}

	@RequestMapping("/product/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id,
			@ModelAttribute("relation") CategoryProduct relation) {
		model.addAttribute("product", appService.findProductById(id));
		model.addAttribute("categories", appService.unAddCategory(appService.findProductById(id)));
		return "showProduct.jsp";
	}
	
	//////////
	
	@RequestMapping("/category/new")
	public String category(@ModelAttribute("category") Category category) {
		return "category.jsp";
	}

	@PostMapping("category/create")
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "category.jsp";
		} else
			appService.addCategory(category);
		return "redirect:/categories/" + category.getId();
	}

	@RequestMapping("/categories/{id}")
	public String showCategories(Model model, @PathVariable("id") Long id,
			@ModelAttribute("relation") CategoryProduct relation) {
		model.addAttribute("category", appService.findCategoryById(id));
		model.addAttribute("products", appService.unAddProducts(appService.findCategoryById(id)));

		return "showCategory.jsp";
	}

	@PostMapping("/product/addCategory")
	public String productAddCategory(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "showProduct.jsp";
		}

		appService.add(relation);
		return "redirect:/products/" + relation.getProduct().getId();

	}
	@PostMapping("/category/addProduct")
	public String categoryAddProduct(@Valid @ModelAttribute("relation") CategoryProduct relation,
			BindingResult result) {
		if (result.hasErrors()) {
			return "showProduct.jsp";
		}

		appService.add(relation);
		return "redirect:/categories/" + relation.getCategory().getId();

	}

}
