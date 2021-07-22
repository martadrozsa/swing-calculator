package enuns;

public enum OperationType {
    
    SOMA("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("*"),
    DIVISAO("/"),
    RAIZ("√")
    ;
    
    private final String nomeFormatado;
    
    OperationType(String nomeFormatado) {
        this.nomeFormatado = nomeFormatado;
    }
    
    public String getNomeFormatado() {
        return nomeFormatado;
    }
    
}
