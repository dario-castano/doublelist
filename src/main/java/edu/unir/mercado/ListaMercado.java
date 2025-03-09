package edu.unir.mercado;

import edu.unir.dlinked.model.gateway.ListGateway;
import lombok.*;

@Data
@RequiredArgsConstructor
public class ListaMercado {
    private final ListGateway productos;
}
