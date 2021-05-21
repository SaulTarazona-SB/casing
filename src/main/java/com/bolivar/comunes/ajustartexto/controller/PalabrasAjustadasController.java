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

    @PostMapping("/api/v1/dataaccess/primerLetraPalabraMayusculaDemasMinusculas/conToken")
    public ResponseEntity<PalabraajustadaResponse> modificarTextoPrimeraPalabraMayusculaDemasMinuscula(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.ajustarTextoPrimeraPalabraMayusculaDemasMinuscula(palabra, token));
    }

    @PostMapping("/api/v1/dataaccess/inversionMayusculasMinusculas")
    public ResponseEntity<PalabraajustadaResponse> modificarMayusculasMinusculas(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.intercalarMayusculasMinusculas(palabra));
    }

    @PostMapping("/api/v1/dataaccess/inversionPrimeraLetraDemasDiferentes")
    public ResponseEntity<PalabraajustadaResponse> modificarPrimeraLetraDemasDiferenteAPrimeraLetra(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarPrimeraLetraDemasDiferenteAPrimeraLetra(palabra));
    }

    @PostMapping("/api/v1/dataaccess/inversionPrimeraLetraDemasIguales")
    public ResponseEntity<PalabraajustadaResponse> modificarPrimeraLetraDemasIgualAPrimeraLetra(@RequestParam String palabra) {
        return ResponseEntity.ok(palabrasService.cambiarPrimeraLetraDemasIgualAPrimeraLetra(palabra));
    }

    @PostMapping("/api/v1/dataaccess/todoMayusculasTokenEntreLetras/conToken")
    public ResponseEntity<PalabraajustadaResponse> modificarTodoMayusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/dataaccess/todoMinusuculasTokenEntreLetras/conToken")
    public ResponseEntity<PalabraajustadaResponse> modificarTodoMinusculasTokenEntreLetras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntreLetras(palabra, token));
    }

    @PostMapping("/api/v1/dataaccess/todoMayusculasTokenEntrePalabras/conToken")
        public ResponseEntity<PalabraajustadaResponse> modificarTodoMayusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMayusculasTokenEntrePalabras(palabra, token));
    }

    @PostMapping("/api/v1/dataaccess/todoMinusculasTokenEntrePalabras/conToken")
    public ResponseEntity<PalabraajustadaResponse> modificarTodoMinusculasTokenEntrePalabras(@RequestParam String palabra, @RequestParam String token) {
        return ResponseEntity.ok(palabrasService.cambiarTodoMinusculasTokenEntrePalabras(palabra, token));
    }

}
