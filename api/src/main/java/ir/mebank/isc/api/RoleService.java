package ir.mebank.isc.api;


import ir.mebank.isc.dto.Role;

public interface RoleService {
    Role findByName(String name);

    boolean exists(String name);
}
