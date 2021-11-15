public  class  Paciente {
    private  String nomeCompleto;
    private  String rg;
    private  String cpf;
    private String telefoneParaContato ;
    private String endereco ;

    //Getters
    public  String  getNomeCompleto(){
    return this.nomeCompleto;
    }

    public String getRG(){
       return this.rg; 
    }

    public  String  getCPF(){
        return this.cpf;
    }
    public String getTelefoneParaContato(){
        return this.telefoneParaContato;
    }
    public String getEndereco(){
        return this.endereco;
    }

    //  Setters

    public void setTelefoneParaContato(String telefoneParaContato){
        this.telefoneParaContato = telefoneParaContato;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }


}

