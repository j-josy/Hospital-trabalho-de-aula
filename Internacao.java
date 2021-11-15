import  java.time.LocalDate ;

public  class  Internacao {
     private String medicoResponsavel;
     private Paciente paciente;
     private  LocalDate dataDaInternacao;
     private  LocalDate dataDaAlta;
     private String observacoes;

    // Getters 
     
    public  String getMedicoResponsavel(String medicoResponsavel){
        return this.medicoResponsavel;
    }

    public  Paciente  getPaciente( Paciente paciente){
        return this.paciente;
    }

    public LocalDate  getDataDaInternacao(LocalDate dataDaInternacao){
        return this.dataDaInternacao;
    }

    public LocalDate getDataDaAlta(LocalDate dataDaAlta){
        
        return this.dataDaAlta;
    }

    public String  getObservacoes(String observacoes){
        return  this.observacoes;
    }

        // Setters

        public void setMedicoResponsavel(String medicoResponsavel){
            this.medicoResponsavel = medicoResponsavel;
        }

        public void setPaciente(Paciente paciente){
            this.paciente = paciente;
        }

         public void setDataDaInternacao(LocalDate DataDaInternacao){
            this.dataDaInternacao = dataDaInternacao;

        public void setObservacoes(String observacoes){
            this.observacoes = observacoes;
        }

}
