package eaa.eng.spring_oracle.controller;

import eaa.eng.spring_oracle.model.Cliente;
import eaa.eng.spring_oracle.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> findAll (){
        List<Cliente> clientes = clienteService.findAll();
        return ResponseEntity.ok(clientes);
    }

    @PostMapping()
    public ResponseEntity<Cliente> save (@RequestBody Cliente cliente) {
        Cliente clienteNovo = clienteService.save(cliente);
        return ResponseEntity.ok(clienteNovo);
    }
}
