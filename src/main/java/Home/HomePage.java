package Home;

import org.springframework.web.bind.annotation.GetMapping;

public class HomePage {
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }
}
