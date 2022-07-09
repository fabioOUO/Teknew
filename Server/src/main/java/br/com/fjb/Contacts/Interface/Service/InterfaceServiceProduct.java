package br.com.fjb.Contacts.Interface.Service;

import br.com.fjb.Contacts.Entity.EntityProduct;

import java.util.List;

public interface InterfaceServiceProduct {
    public List<EntityProduct> get();
    public EntityProduct getById(long codigo);
    public boolean put(EntityProduct contact);
    public boolean post(EntityProduct contact);
    public boolean delete(long codigo);

}
