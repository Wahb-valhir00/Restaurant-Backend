package com.elife.projet_ff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elife.projet_ff.model.Admin;
import com.elife.projet_ff.repository.AdminRepository;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public List<Admin> getAllAdmin(){
        return adminRepository.findAll();
    }

    public Admin getAdminById(String id){
        return adminRepository.findById(id).orElse(null);
    }

    public Admin updateAdmin(Admin admin){
        return adminRepository.save(admin);
    }

    public void deleteAdminById(String id){
        adminRepository.deleteById(id);
    }
}
