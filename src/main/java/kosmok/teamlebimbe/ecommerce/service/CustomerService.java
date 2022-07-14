package kosmok.teamlebimbe.ecommerce.service;

import kosmok.teamlebimbe.ecommerce.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;
    //Metodi di logica
}
