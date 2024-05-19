package com.vcdstore.main.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vcdstore.main.models.productDTO;
import com.vcdstore.main.models.productData;
import com.vcdstore.main.services.databaseRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/products")
public class databaseController {
    
    // menggunakan @Autowired agar otomtis menginisialisasi dan melakukan Dependency Injection 
    @Autowired
    private databaseRepository repo;


    // controller untuk menampilkan list item
    // mendeteksi masukan "" dan "/"
    // UI ada pada templates/products/index/index.html
    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<productData> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }

    // controller untuk menampilkan form data baru
    // mendeteksi keluaran "/create"
    // lalu mengembalikan path html
    @GetMapping("/create")
    public String showCreatePage (Model model){
        productDTO productDto = new productDTO();
        model.addAttribute("productDTO", productDto);
        return "products/CreateProduct";
    }

    // menggunakan metode POST untuk melakukan CRUD
    // disini merupakan Create item lalu menyimpan ke database
    @PostMapping("/create")
    public String createProduct(
            @Valid @ModelAttribute productDTO productDto,
            BindingResult result
            ){
        if(result.hasErrors()){
            return "products/CreateProduct";
        }

        Date tanggal = new Date();
        productData product = new productData();
        product.setJudul(productDto.getJudul());
        product.setAktor(productDto.getAktor());
        product.setSutradara(productDto.getSutradara());
        product.setPublisher(productDto.getPublisher());
        product.setHarga(productDto.getHarga());
        product.setKategori(productDto.getKategori());
        product.setStok(productDto.getStok());
        product.setTanggal(tanggal);

        repo.save(product);
        

        return "redirect:/products";
    }   

    // mendeteksi keluaran "/edit"
    // controller untuk melakukan editing data dengan mendeteksi id
    @GetMapping("/edit")
    public String showEditPage(
            Model model,
            @RequestParam int id
            ){
        try {
            productData product = repo.findById(id).get();
            model.addAttribute("product", product);

            productDTO productDto = new productDTO();
            productDto.setJudul(product.getJudul());
            productDto.setAktor(product.getAktor());
            productDto.setSutradara(product.getSutradara());
            productDto.setPublisher(product.getPublisher());
            productDto.setKategori(product.getKategori());
            productDto.setHarga(product.getHarga());
            productDto.setStok(product.getStok());

            model.addAttribute("productDto", productDto);
    
        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());
            return "redirect:/products";
        }
        return "products/EditProduct";
    }
    
    // menggunakan POST untuk melakukan CRUD
    // disini melakukan Update item
    @PostMapping("/edit")
    public String updateProduct(
            Model model,
            @RequestParam int id,
            @Valid @ModelAttribute productDTO productDto,
            BindingResult result
            ){
        
        try {
            productData product = repo.findById(id).get();
            model.addAttribute("product", product);

            if(result.hasErrors()){
                return "products/EditProduct";
            }
            product.setJudul(productDto.getJudul());
            product.setAktor(productDto.getAktor());
            product.setSutradara(productDto.getSutradara());
            product.setPublisher(productDto.getPublisher());
            product.setHarga(productDto.getHarga());
            product.setKategori(productDto.getKategori());
            product.setStok(productDto.getStok());
    
            repo.save(product);

        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }

        return "redirect:/products";
    }

    // mendeteksi keluaran "/delete"
    // controller untuk menghapus item
    // disini merupakan Delete
    @GetMapping("/delete")
    public String deleteProduct(
            @RequestParam int id
            ){
        try {
            productData product = repo.findById(id).get();
            repo.delete(product);

        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        }
        return "redirect:/products";
    }
}
