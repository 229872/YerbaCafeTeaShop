package pl.lodz.p.edu.presentation.dto.user.address;

import lombok.Builder;

@Builder
public record AddressOutputDto(
    String postalCode,
    String country,
    String city,
    String street,
    Integer houseNumber
) {
}
