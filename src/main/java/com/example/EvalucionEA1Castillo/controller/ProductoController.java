/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.EvalucionEA1Castillo.controller;

import com.example.EvalucionEA1Castillo.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LAB-SISE-PP
 */
@Controller
public class ProductoController {

    @GetMapping("/registroProducto")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "registroProducto";
    }

    @PostMapping("/registrarProducto")
    public String registrarProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "exitoProducto";
    }
}
