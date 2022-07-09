package br.com.fjb.Contacts.Service;

import br.com.fjb.Contacts.Entity.EntityProduct;
import br.com.fjb.Contacts.Repository.RepositoryProduct;
import br.com.fjb.Contacts.Interface.Service.InterfaceServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServiceProduct implements InterfaceServiceProduct {
    @Autowired
    RepositoryProduct repositoryProduct;

    @Override
    public List<EntityProduct> get() {
        return repositoryProduct.findAll();
    }

    @Override
    public EntityProduct getById(long codigo) {

        EntityProduct contact = null;

        try{
            if(repositoryProduct.existsById(codigo)){
                contact = repositoryProduct.getReferenceById(codigo);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return contact;

    }

    @Override
    public boolean put(@RequestBody EntityProduct contact) {
        Boolean update = false;

        try {
            repositoryProduct.save(contact);
            update = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return update;
    }

    @Override
    public boolean post(@RequestBody EntityProduct contact) {
        Boolean create = false;

        try {
            repositoryProduct.save(contact);
            create = true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return create;

    }

    @Override
    public boolean delete(long codigo) {

        Boolean deleting = false;

        try{
            if(repositoryProduct.existsById(codigo)){
                repositoryProduct.deleteById(codigo);
                deleting = true;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            deleting = false;
        }

        return deleting;

    }
}
