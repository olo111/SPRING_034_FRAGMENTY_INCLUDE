package pl.olointeria.spring_034_fragmenty_include;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
@Controller
public class HexagonController {






        @GetMapping("/hexagon")
        String getHexagon() {
           // Optional<Product> product = productRepository.findById(id);
           // product.ifPresent(value -> model.addAttribute("product", value));
            return "hexagon";
        }
    }


