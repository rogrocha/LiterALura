package br.com.alura.LiterALura.ConsumoAPI;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
