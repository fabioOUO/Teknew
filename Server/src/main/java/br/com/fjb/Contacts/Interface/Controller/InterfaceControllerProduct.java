package br.com.fjb.Contacts.Interface.Controller;

import br.com.fjb.Contacts.Entity.EntityProduct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface InterfaceControllerProduct {
    public List<EntityProduct> get();
    public ResponseEntity getById(@PathVariable Long codigo);
    public ResponseEntity put(@RequestBody EntityProduct contact);
    public ResponseEntity post(@RequestBody EntityProduct contact);
    public ResponseEntity delete(@PathVariable Long codigo);
}
