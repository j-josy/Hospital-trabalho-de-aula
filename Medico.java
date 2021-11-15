
    
import  java.time.LocalDate ;

public  class  Medico {
    
    private  String  CRM ;
    private  String nomeCompleto;
    private String endereco;
    private String  telefoneParaContato;
     
    // Getters

    public Medico(String string, String string2, LocalDate of) {
    }

    public  String  getCRM(){
        return this.CRM;
    }

    public  String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public  String getTelefoneParaContato(){
        return this.telefoneParaContato;
    }

    // Setters

    public  void  setEndereco( String endereco){
        this.endereco = endereco;
    
   }


    public  void  setTelefoneDeContato ( String  telefoneParaContato) {
        this. telefoneParaContato = telefoneParaContato;
    }


}

