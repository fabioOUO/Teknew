package br.com.fjb.Contacts.Repository;

import br.com.fjb.Contacts.Entity.EntityProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProduct extends JpaRepository<EntityProduct, Long> {}
