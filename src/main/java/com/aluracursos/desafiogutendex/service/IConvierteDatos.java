package com.aluracursos.desafiogutendex.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
