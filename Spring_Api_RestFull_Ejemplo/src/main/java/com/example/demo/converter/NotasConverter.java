package com.example.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Nota;
import com.example.demo.model.MNota;

@Component("convertidor")
public class NotasConverter {
	
	public List<MNota>convertirLista(List<Nota>notas){
		
		List<MNota>mnotas=new ArrayList<MNota>();
		
		for (Nota nota : notas) {
			mnotas.add(new MNota(nota));
		}
		
		return mnotas;
		
	}

}
