package masterstock.demo.entity.user;

import java.security.KeyStore.Entry.Attribute;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class UserRolesConvert implements AttributeConverter<UserRole,String>{

    @Override
    public String convertToDatabaseColumn(UserRole userRole) {
       if (userRole == null) {
            return null;
        }
        return userRole.getRole(); // Salva "admin" ou "user" na base de dados
    }

    @Override
    public UserRole convertToEntityAttribute(String dbData) {

        if (dbData == null) {
            return null;
        }
        // Procura no enum pelo valor correspondente ("admin" ou "user")
        return Stream.of(UserRole.values())
                .filter(c -> c.getRole().equals(dbData))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
    
}
