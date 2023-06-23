package com.demo9.repository;

import com.demo9.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;



public interface EmployRepository  extends JpaRepository <Employ, Long>  {

    List<Employ> findAllByEmailLike(String email);

    List<Employ> findAllByFullNameLikeOrEmailLikeOrPhoneLikeOrAddressLike(String fullName, String email, String phone, String address);


}
