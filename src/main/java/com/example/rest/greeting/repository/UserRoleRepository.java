package com.example.rest.greeting.repository;

import java.util.Optional;

// import java.util.List;

import com.example.rest.greeting.entity.UserRole;
// import com.example.rest.greeting.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    Optional<UserRole> findByUSERID(Long userid);

    // UserRole getRoleByUserId(Long userId);
    // @Query(value = "SELECT p.slug, p.title, p.body, p.created_at, u.name "
    //             + "FROM Users u INNER JOIN Posts p ON u.id=p.userid", nativeQuery = true)
    // List<Object[]> getAllUserPosts();

    // @Query(value = "SELECT p.slug, p.title, p.body, p.created_at, u.name "
    //             + "FROM Users u INNER JOIN Posts p ON u.id=p.userid "
    //             + "WHERE u.id=:userid", nativeQuery = true)
    // List<Object[]> getAllUserPosts(@Param("userid") int userid);

    // @Query(value = "SELECT * FROM Users u WHERE UPPER(u.name)=UPPER(?1)", nativeQuery = true)
    
}
