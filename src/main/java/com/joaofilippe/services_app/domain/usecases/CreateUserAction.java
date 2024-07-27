package com.joaofilippe.services_app.domain.usecases;

import com.joaofilippe.services_app.domain.models.User;
import com.joaofilippe.services_app.ports.repositories.IUserRepository;

public class CreateUserAction {
    public CreateUserAction(IUserRepository repository){
        this.repository = repository;
    }
    private IUserRepository repository;

    public Long execute(User user) {
        return this.repository.save(user);
    }
}

