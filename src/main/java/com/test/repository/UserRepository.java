package com.test.repository;

import com.test.pojo.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserRepository extends PagingAndSortingRepository<User, Long>, QueryByExampleExecutor<User> {

    @Query("from User where userName = :userName")
    User getByUserName(@Param("userName") String userName);
}
