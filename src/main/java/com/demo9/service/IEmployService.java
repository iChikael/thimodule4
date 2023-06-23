package com.demo9.service;

import com.demo9.model.Employ;

import java.util.List;
import java.util.Optional;

public interface IEmployService{
    List<Employ> findAll();

    Employ getOne(Long id);

    Optional<Employ> findOne(Long id);

    Employ save(Employ employ);

    Employ delete(Employ employ);

    List<Employ> findAllByEmailLike(String email);

    List<Employ> findAllByFullNameLikeOrEmailLikeOrPhoneLikeOrAddressLike(String keySearch);
}
