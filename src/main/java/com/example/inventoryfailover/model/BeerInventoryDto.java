package com.example.inventoryfailover.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record BeerInventoryDto(UUID id,
                               OffsetDateTime createdDate,
                               OffsetDateTime lastModifiedDate,
                               UUID beerId,
                               String upc,
                               Integer quantityOnHand) {
}
