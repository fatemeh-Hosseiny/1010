package ir.freeland.springboot.persistence.base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
	@Autowired  
    private RepositoryDigi repositoryDigi ;  
	
	public List<ItemDigi> getAllProducts() {  
        return repositoryDigi.findAll();  
    }  
	 public ItemDigi getProductById(Long id) {  
	        return repositoryDigi.findById(id).orElse(null);  
	    }
	 public ItemDigi saveProduct(ItemDigi Name) {  
	        return repositoryDigi.save(Name);  
	    }  
	 public void deleteProduct(Long id) {  
		 repositoryDigi.deleteById(id);  
	    }  
	 public ItemDigi updateProduct(Long id, ItemDigi productDetails) {  
	        ItemDigi Name = repositoryDigi.findById(id).orElse(null);  
	        if (Name != null) {  
	            Name.setName(productDetails.getName());  
	            Name.setPrice(productDetails.getPrice());  
	            Name.setDescription(productDetails.getDescription());  
	            return repositoryDigi.save(Name);  
	        }  
	        return null;  
	    }  
}  

