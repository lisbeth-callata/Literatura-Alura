package com.alura.literatura.ui;

public class Menu {
    private String menu = """
    |***************************************************|
    |*****      BIENVENIDO A LIBRERÍA ALURA       ******|
    |***************************************************|
    
    1-Buscar libro por título
    2-Listar libros registrados
    3-Listar autores registrados
    4-Listar autores vivos en un determinado año
    5-Listar libros por idioma
    
    0-Salir
    
    |***************************************************|
    |*****            INGRESE UNA OPCIÓN          ******|
    |***************************************************|
    
    Digite un número: 
    """;


    public String getMenu() {
        return menu;
    }


}
