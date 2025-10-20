package productservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import productservice.entity.ProductEntity;
public interface ProductDAO extends JpaRepository<ProductEntity, Integer>
{
}