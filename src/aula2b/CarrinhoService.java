package aula2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class CarrinhoService implements CommandLineRunner {
    @Autowired
    public CarrinhoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CarrinhoService.class, args);
    }

    @Override
    public void run(String... args) {
        Carrinho produto1 = new Carrinho(1, "iPhone 14", 21, 7900);
        repository.save(produto1);
        Carrinho produto2 = new Carrinho(2, "Carrinho de Bebe", 5, 200);
        repository.save(produto2);
        Carrinho produto3 = new Carrinho(3, "JW Black Label", 5, 150);
        repository.save(produto3);
        Carrinho produto4 = new Carrinho(4, "Carregador de iPhone", 10, 200);
        repository.save(produto4);
        Carrinho produto5 = new Carrinho(5, "Oculos de Sol Rayban", 2, 500);
        repository.save(produto5);
        repository.findAll().forEach(it -> System.out.println(it.toString()));
    }
}
