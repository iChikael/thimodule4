package com.demo9.service;

import com.demo9.model.Employ;
import com.demo9.repository.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployService implements IEmployService {


    @Autowired
    private EmployRepository employRepository;

    public EmployService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }


    @Override
    public List<Employ> findAll() {
        return employRepository.findAll();
    }

    @Override
    public Employ getOne(Long id) {
        return employRepository.getOne(id);
    }

    @Override
    public Optional<Employ> findOne(Long id) {
        return employRepository.findById(id);
    }


    @Override
    public Employ save(Employ employ) {
        return employRepository.save(employ);
    }

    @Override
    public Employ delete(Employ employ) {
        employRepository.delete(employ);
        return employ;
    }

    @Override
    public List<Employ> findAllByEmailLike(String email) {
        return employRepository.findAllByEmailLike(email);
    }

    @Override
    public List<Employ> findAllByFullNameLikeOrEmailLikeOrPhoneLikeOrAddressLike(String keySearch) {
        return employRepository.findAllByFullNameLikeOrEmailLikeOrPhoneLikeOrAddressLike(keySearch, keySearch, keySearch, keySearch);
    }
}
