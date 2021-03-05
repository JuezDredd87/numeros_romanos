package com.numeros_romanos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {

    @GetMapping("/convertirARomanos")
    public String convertirARomanos(@RequestParam(value = "numero", defaultValue = "") String numeroNaturalEntrada){
        int numeroNatural;

        try {
            numeroNatural = Integer.parseInt(numeroNaturalEntrada);
        } catch (Exception e){
                return "Numero no soportado";
        }

        if (numeroNatural == 0){
            return "Numero no soportado";
        }

        return sumarM(numeroNatural);
    }

    public String convertirARomanos(int numeroNatural){
        return sumarM(numeroNatural);
    }

    private String sumarM(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;
        int contadorM = 0;

        for (int i = 1000; i <= numeroNatural && i<=3000; i+=1000){
            resto -= 1000;
            resultado.append("M");
            contadorM++;
        }

        if (contadorM > 3){
            return "Numero no soportado";
        }


        return resultado.toString() + sumarD(resto);
    }

    private String sumarD(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;

        if (resto > 399) {
            if (resto <= 499) {
                resultado.append("CD");
                resto -= 400;
            } else {
                resultado.append("D");
                resto -= 500;
            }
        }

        return resultado.toString() + sumarC(resto);
    }

    private String sumarC(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;

        for (int i = 100; i <= numeroNatural && i<=300; i+=100){
            resto -= 100;
            resultado.append("C");
        }

        if (resto >= 90 && resto <= 99){
            resultado.append("XC");
            resto -= 90;
        }

        return resultado.toString() + sumarL(resto);
    }

    private String sumarL(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;

        if (resto > 39) {
            if (resto <= 49) {
                resultado.append("XL");
                resto -= 40;
            } else {
                resultado.append("L");
                resto -= 50;
            }
        }

        return resultado.toString() + sumarX(resto);
    }

    private String sumarX(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;

        for (int i = 10; i <= numeroNatural && i <=30; i+=10){
            resto -= 10;
            resultado.append("X");
        }

        if (resto == 9){
            resultado.append("IX");
            resto -= 9;
        }

        return resultado.toString() + sumarV(resto);
    }

    private String sumarV(int numeroNatural){
        StringBuilder resultado = new StringBuilder();
        int resto = numeroNatural;

        if (resto > 3) {
            if (resto == 4) {
                resultado.append("IV");
                resto -= 4;
            } else {
                resultado.append("V");
                resto -= 5;
            }
        }

        return resultado.toString() + sumarI(resto);
    }

    private String sumarI(int numeroNatural){
        if (numeroNatural <= 3) {
            return "I".repeat(Math.max(0, numeroNatural));
        }

        return "";
    }
}
