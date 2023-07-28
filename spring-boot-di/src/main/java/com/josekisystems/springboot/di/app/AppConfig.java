package com.josekisystems.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.josekisystems.springboot.di.app.models.domain.ItemFactura;
import com.josekisystems.springboot.di.app.models.domain.Producto;

@Configuration
public class AppConfig {

    @Bean("itemFactura")
    
    List<ItemFactura> registrarItems(){
		
		Producto producto1 = new Producto("Casa para acampar", 2000);
		Producto producto2 = new Producto("Lampara Coleman", 5000);
		
		ItemFactura linea1 = new ItemFactura(producto1,3);
		ItemFactura linea2 = new ItemFactura(producto2,6);
		
		return Arrays.asList(linea1,linea2);
		
	}
    
    @Bean("itemFacturaOficina")
    @Primary
    List<ItemFactura> registrarItemsOficina(){
		
		Producto producto1 = new Producto("Monitor LG LCD 24", 2000);
		Producto producto2 = new Producto("MacBook Laptop", 50000);
		Producto producto3 = new Producto("Impresora HP Multifincional", 2000);
		Producto producto4 = new Producto("Escritorio Oficina", 5000);
		
		ItemFactura linea1 = new ItemFactura(producto1,4);
		ItemFactura linea2 = new ItemFactura(producto2,2);
		ItemFactura linea3 = new ItemFactura(producto3,2);
		ItemFactura linea4 = new ItemFactura(producto4,2);
	
		return Arrays.asList(linea1,linea2,linea3,linea4);
		
	}
    
}	 
