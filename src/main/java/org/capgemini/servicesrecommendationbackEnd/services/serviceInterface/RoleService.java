package org.capgemini.servicesrecommendationbackEnd.services.serviceInterface;

import org.capgemini.servicesrecommendationbackEnd.models.entities.Role;

public interface RoleService {
    Role add(Role role);
    Role findById(Long id);
}
