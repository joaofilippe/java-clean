package com.joaofilippe.services_app.domain.usecases;

import com.joaofilippe.services_app.domain.models.User;
import com.joaofilippe.services_app.ports.repositories.IUserRepository;

public class GetUserByIdAction {
    public GetUserByIdAction(IUserRepository repository){
        this.repository = repository;
    }
    private IUserRepository repository;

    public User execute(Long id){
        return this.repository.findById(id);
    }
}
