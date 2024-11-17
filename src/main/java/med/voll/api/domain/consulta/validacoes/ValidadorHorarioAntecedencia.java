package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaAgendamento")
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta  {


    @Override
    public void validar(DadosAgendamentoConsulta dados) throws ValidacaoException {
        new ValidadorHorarioFuncionamentoClinica().validar(dados);
    }

    public class ValidadorHorarioFuncionamentoClinica {

        public void validar(DadosAgendamentoConsulta dados) throws ValidacaoException {
            var dataConsulta = dados.data();
            var agora = LocalDateTime.now();
            var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();
            if (diferencaEmMinutos < 30) {
                throw new ValidacaoException("A consulta deve ser agendada com no mínimo 30 minutos de antecedência");
            }

        }
    }
}
