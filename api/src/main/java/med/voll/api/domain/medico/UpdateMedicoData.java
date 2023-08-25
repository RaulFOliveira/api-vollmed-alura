package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.EnderecoData;

public record UpdateMedicoData(
        @NotNull Long id, String nome, String telefone, EnderecoData endereco) {
}
