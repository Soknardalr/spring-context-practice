package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.OutputStream;

//@Component
@Service
public class ProductService {
    private Repository repository;

    @Autowired
    private OutputStream out;
    public String getTitleById(Long id){
        return repository.findById(id).getTitle();
    }

    public ProductService(@Qualifier("repo") Repository repository) {
        this.repository = repository;
    }

    public void write() throws Exception{
        out.write("asd".getBytes());
        out.flush();
    }



//    @Autowired
//    public void setRepository(InMemoryRepository repository) {
//        this.repository = repository;
//    }
}
