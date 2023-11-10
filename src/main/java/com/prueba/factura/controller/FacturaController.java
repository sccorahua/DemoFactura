package com.prueba.factura.controller;

import com.prueba.factura.dto.FacturaDTO;
import com.prueba.factura.service.ClienteService;
import com.prueba.factura.service.FacturaService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @Autowired
    private ClienteService clienteService;

    @RequestMapping("factura")
    public ModelAndView facturaPage() {
        ModelAndView mv = new ModelAndView("Factura");

        mv.addObject("fac", new FacturaDTO());
        mv.addObject("lista", clienteService.listarTodo());
        mv.addObject("factura", facturaService.listarTodo());

        return mv;
    }

    @RequestMapping("facturaInsertar")
    public ModelAndView insFactura(@ModelAttribute("fac") FacturaDTO factura, BindingResult rs) {
        ModelAndView mv = new ModelAndView("Factura");
        if (rs.hasErrors()) {
            mv.addObject("fac", factura);
            mv.addObject("lista", clienteService.listarTodo());
            mv.addObject("factura", facturaService.listarTodo());

        } else {
            facturaService.insertar(factura);
            log.info("se inserto la factura" + factura.getNro());
            mv.addObject("fac", new FacturaDTO());
            mv.addObject("lista", clienteService.listarTodo());
            mv.addObject("factura", facturaService.listarTodo());

        }
        return mv;
    }

    @RequestMapping("facturaEliminar")
    public ModelAndView delFactura(@RequestParam("codigo") int codigo) {
        ModelAndView mv = new ModelAndView("Factura");

        facturaService.eliminar(codigo);
        log.info("se elimino la factura" + codigo);

        mv.addObject("fac", new FacturaDTO());
        mv.addObject("lista", clienteService.listarTodo());
        mv.addObject("factura", facturaService.listarTodo());

        return mv;
    }

    @RequestMapping("facturaModificar")
    public ModelAndView modFactura(@RequestParam("codigo") int codigo) {
        ModelAndView mv = new ModelAndView("Factura");

        FacturaDTO fact = facturaService.obtenerUno(codigo);

        mv.addObject("fac", fact);
        mv.addObject("lista", clienteService.listarTodo());
        mv.addObject("factura", facturaService.listarTodo());

        return mv;
    }
}
