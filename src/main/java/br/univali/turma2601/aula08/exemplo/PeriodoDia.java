package br.univali.turma2601.aula08.exemplo;

public enum PeriodoDia {
    MATUTINO("9:00", "12:00"),
    VESPERTINO("12:00", "18:00"),
    NOTURNO("18:00", "23:00");

    private String horarioInicio;
    private String horarioFim;

    PeriodoDia(String horarioInicio, String horarioFim) {
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public boolean isManha() {
        return this == MATUTINO || this == VESPERTINO;
    }
}
