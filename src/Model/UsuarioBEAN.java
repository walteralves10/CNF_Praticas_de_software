package Model;

public class UsuarioBEAN {
    
    private int codigo_usuario;
    private int tipo_usuario;
    private String senha_usuario;
    private int status_usuario;

    public UsuarioBEAN(int codigo_usuario, int tipo_usuario, String senha_usuario) {
        this.codigo_usuario = codigo_usuario;
        this.tipo_usuario = tipo_usuario;
        this.senha_usuario = senha_usuario;
    }

    public UsuarioBEAN(int tipo_usuario, String senha_usuario, int status_usuario) {
        this.tipo_usuario = tipo_usuario;
        this.senha_usuario = senha_usuario;
        this.status_usuario = status_usuario;
    }

    public int getCodigo() {
        return codigo_usuario;
    }

    public int getTipo() {
        return tipo_usuario;
    }

    public void setTipo(int tipo) {
        this.tipo_usuario = tipo;
    }

    public String getSenha() {
        return senha_usuario;
    }

    public void setSenha(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public int getStatus_usuario() {
        return status_usuario;
    }

    public void setStatus_usuario(int status_usuario) {
        this.status_usuario = status_usuario;
    }
    
    
}
