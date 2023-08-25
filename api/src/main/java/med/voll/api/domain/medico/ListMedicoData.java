package med.voll.api.domain.medico;

public record ListMedicoData(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public ListMedicoData(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }


}
