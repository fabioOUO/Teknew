package br.com.fjb.Contacts.Controller;

import br.com.fjb.Contacts.Entity.EntityProduct;
import br.com.fjb.Contacts.Interface.Controller.InterfaceControllerProduct;
import br.com.fjb.Contacts.Service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class ControllerProduct implements InterfaceControllerProduct {

    final private String nameRouter =  "/product";
    final private String nameRouterCodigo =  "/product/{code}";
    @Autowired
    ServiceProduct serviceContact;

    public ResponseEntity messageError(Exception e){
        System.out.println(e.getMessage());
        ResponseEntity responseEntity = ResponseEntity.internalServerError().body("Erro interno no server.");
        return responseEntity;
    }

    @GetMapping({"/app", "/", ""})
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @Override
    @GetMapping(nameRouter)
    public List<EntityProduct> get() {
        return serviceContact.get();
    }

    @Override
    @GetMapping(nameRouterCodigo)
    public ResponseEntity getById(@PathVariable Long code) {
        ResponseEntity responseEntity;

        try{
            EntityProduct contact = serviceContact.getById(code);
            if(contact == null) responseEntity = ResponseEntity.ok().body(false);
            else responseEntity = ResponseEntity.ok().body(contact);
        }catch (Exception e){
            responseEntity = this.messageError(e);
        }

        return responseEntity;

    }

    @Override
    @PutMapping(nameRouter)
    public ResponseEntity put(@RequestBody EntityProduct contact) {
        ResponseEntity responseEntity;

        try{
            Boolean update = serviceContact.put(contact);
            responseEntity = ResponseEntity.ok().body(update);
        }catch (Exception e){
            responseEntity = this.messageError(e);
        }

        return responseEntity;

    }

    @Override
    @PostMapping(nameRouter)
    public ResponseEntity post(@RequestBody EntityProduct contact) {
        ResponseEntity responseEntity;

        try{
            Boolean created = serviceContact.post(contact);
            responseEntity = ResponseEntity.ok().body(created);
        }catch (Exception e){
            responseEntity = this.messageError(e);
        }

        return responseEntity;

    }

    @Override
    @DeleteMapping(nameRouterCodigo)
    public ResponseEntity delete(@PathVariable Long code) {
        ResponseEntity responseEntity;

        try {
            Boolean deleted = serviceContact.delete(code);
            responseEntity = ResponseEntity.ok().body(deleted);
        }catch (Exception e){
            responseEntity = this.messageError(e);
        }

        return responseEntity;

    }
}
