package com.bolivar.comunes.ajustartexto.controller;

import com.bolivar.comunes.ajustartexto.models.PalabraajustadaResponse;
import com.bolivar.comunes.ajustartexto.service.PalabrasAjustadasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalabrasAjustadasController {

    @Autowired
    private PalabrasAjustadasService palabrasService;

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/primerLetraPalabraMayusculaDemasMinusculasConToken")
    public ResponseEntity<PalabraajustadaResponse> ajustarTextoPrimeraPalabraMayusculaDemasMinuscula(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.ajustarTextoPrimeraPalabraMayusculaDemasMinuscula(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/inversionMayusculasMinusculas")
    public ResponseEntity<PalabraajustadaResponse> intercalarMayusculasMinusculas(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.intercalarMayusculasMinusculas(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/inversionPrimeraLetraDemasDiferentes")
    public ResponseEntity<PalabraajustadaResponse> cambiarPrimeraLetraDemasDiferenteAPrimeraLetra(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarPrimeraLetraDemasDiferenteAPrimeraLetra(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/inversionPrimeraLetraDemasIguales")
    public ResponseEntity<PalabraajustadaResponse> cambiarPrimeraLetraDemasIgualAPrimeraLetra(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarPrimeraLetraDemasIgualAPrimeraLetra(palabra));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/todoMayusculasTokenEntreLetras")
    public ResponseEntity<PalabraajustadaResponse> cambiarTodoMayusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/todoMinusuculasTokenEntreLetras")
    public ResponseEntity<PalabraajustadaResponse> cambiarTodoMinusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/todoMayusculasTokenEntrePalabras")
        public ResponseEntity<PalabraajustadaResponse> cambiarTodoMayusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntrePalabras(palabra, token));
    }

    @PostMapping("/api/v1/servicioPalabras/textoAjustado/todoMinusculasTokenEntrePalabras")
    public ResponseEntity<PalabraajustadaResponse> cambiarTodoMinusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntrePalabras(palabra, token));
    }

}
