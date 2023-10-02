package entities;

import lombok.Data;


@Data
public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco getEnderecoByCep(String cep) {
        Endereco endereco = new Endereco();

        HttpGet request = HttpGet new ("https://viacep.com.br/ws/"+ cep +"/json/");


        return endereco;
    }

}
