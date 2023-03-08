package aula3a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("estoque")
public class ProdutoResource {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("greeting2")
    public String greeting2(@RequestParam(name="name", required=false, defaultValue="Fulano") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("carrinho")
    public String getAllProdutos(Model model) {
        List<Produto> lista = produtoService.getAllProdutos();
        model.addAttribute("lista", lista);
        return "carrinho";
    }
}
