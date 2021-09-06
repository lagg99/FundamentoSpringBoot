package fundamentos.SpringBoot.fundamentos.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
    @RequestMapping//nos sirve para aceptar todas las solicitudes dentro este metodo a nivel  http
    @ResponseBody//para responder un cuerpo a nivel del servicio
    public ResponseEntity<String> funtion() {
        return new ResponseEntity("hello from controller", HttpStatus.OK);
    }

}
