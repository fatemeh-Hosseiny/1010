package ir.freeland.springboot.persistence.base;

import java.util.List ;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryDigi extends JpaRepository<ItemDigi, Long> {  
	List<ItemDigi> findByName(String name);
    List<ItemDigi> findByNameIgnoreCase(String name);
    List<ItemDigi> findByNameEndingWith(String name);
    List<ItemDigi> findByNameEndingWithIgnoreCase(String name);
    List<ItemDigi> findByNameEndingWithIgnoreCaseOrderByIdDesc(String name);
    List<ItemDigi> findTop1ByNameEndingWithIgnoreCaseOrderByIdDesc(String name);
 

}
