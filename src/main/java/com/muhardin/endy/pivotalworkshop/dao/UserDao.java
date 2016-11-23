package com.muhardin.endy.pivotalworkshop.dao;

import com.muhardin.endy.pivotalworkshop.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserDao extends PagingAndSortingRepository<User, String>{
    
}
