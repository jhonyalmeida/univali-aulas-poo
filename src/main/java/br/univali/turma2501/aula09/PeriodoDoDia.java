package br.univali.turma2501.aula09;

public enum PeriodoDoDia {

    MATUTINO("07:00", "12:00") {
        @Override
        void fazerAlgumaCoisa() {

        }
    },
    VESPERTINO("12:00", "18:30") {
        @Override
        void fazerAlgumaCoisa() {

        }
    },
    NOTURNO("18:30", "22:30") {
        @Override
        void fazerAlgumaCoisa() {

        }
    };

    private String horarioInicio;
    private String horarioFim;

    PeriodoDoDia(String horarioInicio, String horarioFim) {
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    abstract void fazerAlgumaCoisa();
}
