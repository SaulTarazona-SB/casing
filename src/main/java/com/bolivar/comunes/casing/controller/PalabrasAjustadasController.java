package com.bolivar.comunes.casing.controller;

import com.bolivar.comunes.casing.models.ObtenerpalabraajustadaResponse;
import com.bolivar.comunes.casing.service.PalabrasAjustadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalabrasAjustadasController {

    @Autowired
    private PalabrasAjustadasService palabrasService;

    @PostMapping("/api/v1/servicioPalabras/textoAjustado")
    public ResponseEntity<ObtenerpalabraajustadaResponse> ajustarTexto1MayusculaDemasMinuscula(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.ajustarTexto1MayusculaDemasMinuscula(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/invertido")
    public ResponseEntity<ObtenerpalabraajustadaResponse> intercalarMayusculasMinusculas(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.intercalarMayusculasMinusculas(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/primeraLetra")
    public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarLetra1DemasDiferenteALetra1(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarLetra1DemasDiferenteALetra1(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/primeraLetraYTexto")
    public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarLetra1DemasIgualALetra1(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarLetra1DemasIgualALetra1(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/mayusculasTokenLetras")
    public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarTodoMayusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/minusculasTokenLetras")
    public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarTodoMinusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/mayusculasTokenPalabras")
        public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarTodoMayusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntrePalabras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/minusculasTokenPalabras")
    public ResponseEntity<ObtenerpalabraajustadaResponse> cambiarTodoMinusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntrePalabras(palabra, token));
    }

}
