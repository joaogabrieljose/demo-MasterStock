package masterstock.demo.dto.dtoSecurity;

import masterstock.demo.entity.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
    
}
